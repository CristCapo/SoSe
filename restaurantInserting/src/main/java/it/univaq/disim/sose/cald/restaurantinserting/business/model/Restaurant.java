package it.univaq.disim.sose.cald.restaurantinserting.business.model;

public class Restaurant implements java.io.Serializable {
	
	private Long id;
	private double latitude;
	private double longitude;
	private String name;
	private String cap;
	private String address;
	private String city;
	private String telephoneNumber;
	private String style;
	private String cousine;
	private String menu;
	private int max_seats;
	private Long owner;
	
	
	public Long getOwner() {
		return owner;
	}

	public void setOwner(Long owner) {
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCap() {
		return cap;
	}
	
	public void setCap(String cap) {
		this.cap = cap;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getStyle() {
		return style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}
	
	public String getCousine() {
		return cousine;
	}
	
	public void setCousine(String cousine) {
		this.cousine = cousine;
	}
	
	public String getMenu() {
		return menu;
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public int getMax_seats() {
		return max_seats;
	}
	
	public void setMax_seats(int max_seats) {
		this.max_seats = max_seats;
	}
}
