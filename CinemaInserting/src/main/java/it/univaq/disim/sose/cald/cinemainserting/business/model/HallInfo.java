package it.univaq.disim.sose.cald.cinemainserting.business.model;

import java.util.Date;

public class HallInfo {
	private Date time;
	private Film film;
	private float price;
	private int freeSeatsNumber;
	private Long id;
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
		this.time=time;
	}
	
	public Film getFilm() {
		return film;
	}
	
	public void setFilm(Film film) {
		this.film=film;
	}
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price=price;
	}
	public int getFreeSeatsNumber() {
		return freeSeatsNumber;
	}
	
	public void setFreeSeatsNumber(int freeSeatsNumber) {
		this.freeSeatsNumber=freeSeatsNumber;
	}
	public  Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
}
