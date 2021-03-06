package it.univaq.disim.sose.cald.restaurantinformation.business.impl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univaq.disim.sose.cald.restaurantinformation.RestaurantInformationFault_Exception;
import it.univaq.disim.sose.cald.restaurantinformation.business.RestaurantInformationService;
import it.univaq.disim.sose.cald.restaurantinformation.business.model.Discount;
import it.univaq.disim.sose.cald.restaurantinformation.business.model.Restaurant;

@Service
public class JDBCRestaurantInformationServiceImpl implements RestaurantInformationService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(JDBCRestaurantInformationServiceImpl.class);
	
	@Autowired
	private DataSource dataSource;

	/**
     * Get information about all the restaurant given a city
     * @param parameters city where the user wants to see the restaurants
     * @return response List of restaurants in the city passed in input
     */
	@Override
	public List<Restaurant> getRestaurants(String city) throws RestaurantInformationFault_Exception {
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		String sql = "SELECT * FROM restaurants WHERE restaurants.restaurant_city = ? ORDER BY restaurants.restaurant_id";
		LOGGER.info(sql);
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			Restaurant restaurant = null;
			
			con = dataSource.getConnection();
			st = con.prepareStatement(sql);
			st.setString(1, city);
			rs = st.executeQuery();
			
			while(rs.next()) {
				restaurant = createRestaurant(con, rs);
				restaurantList.add(restaurant);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RestaurantInformationFault_Exception("Something was wrong Restaurant creation");
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {}
			}
		}
		return restaurantList;
	}
	
	public Restaurant createRestaurant(Connection con, ResultSet rs) throws SQLException, RestaurantInformationFault_Exception {
		PreparedStatement st = null;
		ResultSet rss = null;
		Long restaurantId = rs.getLong("restaurant_id");
		String sql = "SELECT * FROM discount JOIN cinemas ON cinemas.cinema_id = discount.cinema AND discount.restaurant = ?";
		Restaurant restaurant = new Restaurant();
		Discount discount = new Discount();
		
		restaurant.setId(restaurantId);
		restaurant.setAddress(rs.getString("restaurant_address"));
		restaurant.setCap(rs.getString("restaurant_cap"));
		restaurant.setCity(rs.getString("restaurant_city"));
		restaurant.setCousine(rs.getString("cuisine"));
		restaurant.setLatitude(rs.getDouble("restaurant_lat"));
		restaurant.setLongitude(rs.getDouble("restaurant_lon"));
		restaurant.setMenu(rs.getString("menu"));
		restaurant.setName(rs.getString("restaurant_name"));
		restaurant.setStyle(rs.getString("style"));
		restaurant.setTelephoneNumber(rs.getString("restaurant_telephoneNumber"));
		restaurant.setMaxSeats(rs.getInt("max_seats"));
		
		try {
			st = con.prepareStatement(sql);
			
			st.setLong(1, restaurantId);
			rss = st.executeQuery();
			rss.last();
			
			if (rss.getRow() != 0) {
				rss.first();
				discount.setId(rss.getLong("discount_id"));
				discount.setPrice(rss.getFloat("price"));
				discount.setCinema(rss.getInt("cinema_id"));
			
			} else {
				discount = null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RestaurantInformationFault_Exception("Something was wrong with Discount selection");
		} 
		
		restaurant.setDiscount(discount);
		return restaurant;
	}

	/**
     * Get information about a single restaurant
     * @param id restaurant_id we want to show out 
     * @return response Information about the restaurant
     */
	@Override
	public Restaurant getSingleRestaurant(long id) throws RestaurantInformationFault_Exception {
		LOGGER.info("CALLED JDBCSingleRestaurantInformation");
		
		Restaurant restaurant= new Restaurant();
		String sql ="SELECT * FROM restaurants WHERE restaurant_id=?";
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			st = con.prepareStatement(sql);
			st.setLong(1, id);
			rs = st.executeQuery();
			
			if (rs.next()) {
				restaurant=createRestaurant(con,rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {}
			}
		}
		
		
		return restaurant;
	}
}
