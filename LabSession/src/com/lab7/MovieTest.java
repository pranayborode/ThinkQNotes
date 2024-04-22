package com.lab7;

public class MovieTest {

	public static void main(String[] args) {
		 
		Movie m1 = new Movie();
		

		m1.setDetails( 101, "MOnto", "Hindi", "12 Pm", 300.00);
		m1.show();

		
		Movie m2 = new Movie();
		
		m2.setMovieId(1234);
		m2.setMovieName("72 Mail Ek Pravas");
		m2.setLanguage("Marathi");
		m2.setShowTime("9:30 Am");
		m2.setTicketPrice(300.00);
		
		m2.show();
		
	}

}
