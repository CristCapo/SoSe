package it.univaq.disim.sose.cald.restaurantbooking.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingFault_Exception;
import it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingRequest;
import it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingResponse;
import it.univaq.disim.sose.cald.restaurantbooking.business.RestaurantBookingService;
import it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingPT;
import it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingFault_Exception;
import it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingRequest;
import it.univaq.disim.sose.cald.restaurantbooking.RestaurantBookingResponse;
//import it.univaq.disim.sose.cald.restaurantBooking.business.restaurantBookingService;
@Component(value = "RestaurantBookingPTImpl")
public class RestaurantBookingPTImpl implements RestaurantBookingPT {
	
	private static Logger LOGGER = LoggerFactory.getLogger(RestaurantBookingPTImpl.class);
	
	@Autowired
	private RestaurantBookingService service;
	
	@Override
	public RestaurantBookingResponse restaurantBooking(RestaurantBookingRequest parameters) throws RestaurantBookingFault_Exception {
		
		try {
			RestaurantBookingResponse response = service.insertRestaurantBooking(parameters);
			return response;
			
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
		
	}

}
