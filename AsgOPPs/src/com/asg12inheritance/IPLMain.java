package com.asg12inheritance;

//5.Create class IPLTeam with method play. 
//  Create child classes of IPLTeam called as CSK, RCB. 
//  In main, call play from child class objects.

//Parent class
class IPLTeam {
	public String play() {
		String message = "IPL Team is Playing";
		return message;

	}
}

//child class
class CSK extends IPLTeam{
	
}
//child class
class  RCB extends IPLTeam{
	
}
public class IPLMain {

	public static void main(String[] args) {
		CSK csk = new CSK();
		
		System.out.println("CSK "+csk.play());
		
		RCB rcb = new RCB();
		
		System.out.println("RCB "+rcb.play());
		

	}

}
