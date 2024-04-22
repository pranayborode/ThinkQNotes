package com.lab7;

public class Movie {

	private int movieId;
	private String movieName;
	private String language;
	private String showTime;
	private double ticketPrice;

//	public void setDetails(int id, String name, String lang, 
//			String time, double price) {
//		
//		movieId = id;
//		movieName = name;
//		language = lang;
//		showTime = time;
//		ticketPrice = price;	
//		
//	}

	public void setDetails(int movieId, String movieName, String language, String showTime, double ticketPrice) {

		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.showTime = showTime;
		this.ticketPrice = ticketPrice;

	}
	public void show() {

		System.out.println("Movie Id     : " + movieId);
		System.out.println("Movie Name   : " + movieName);
		System.out.println("Language     : " + language);
		System.out.println("Show Time    : " + showTime);
		System.out.println("Ticket Price : " + ticketPrice);
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}



//	public void setDetails() {
//		movieId = 101;
//		movieName = "Monto";
//		language = "Hindi";
//		showTime = "12 Pm";
//		ticketPrice = 200.00;
//	}
}
