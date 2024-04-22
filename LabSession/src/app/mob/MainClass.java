package app.mob;

import app.prog.DesktopApplication;
import app.prog.Developer;
import app.prog.WebApplication;

public class MainClass {

	public static void main(String[] args) {
		
		Developer d1 = new Developer("Arvind", 8, "Java, ReactJs");
		Developer d2 = new Developer("Riya", 6,"Android Developer");
		Developer d3 = new Developer("Sahil", 5, "Java, Html , Css, Js");
		
		
		DesktopApplication deskApp1 = new DesktopApplication(1.2, "ReactJs", d1, "Windows");
		System.out.println(deskApp1);
		deskApp1.install();
		deskApp1.uninstall();
		
		System.out.println("---------------------------------------------------");
		
		WebApplication webApp1 = new WebApplication(2.2, "AngularJs", d3, "Windows & Mac");
		System.out.println(webApp1);
		
		System.out.println("---------------------------------------------------");
		
		MobileApplication mobApp1 = new MobileApplication(3.1, "Android", d2, "RAM-16Gb, Storage:64GB, ScreenDimention : 1080×1920");
		System.out.println(mobApp1);
		mobApp1.install();
		mobApp1.uninstall();

	}

}
