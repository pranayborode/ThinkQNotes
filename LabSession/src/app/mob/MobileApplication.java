package app.mob;

import app.prog.Application;
import app.prog.Developer;

public class MobileApplication extends Application {

	private String mobileFeature;
	
	public MobileApplication(double version, String technology, Developer developer,String mobileFeature) {
		super(version, technology, developer);
		this.mobileFeature = mobileFeature;
	}

	public String getMobileFeature() {
		return mobileFeature;
	}

	public void setMobileFeature(String mobileFeature) {
		this.mobileFeature = mobileFeature;
	}

	@Override
	public String toString() {
		return super.toString()+"MobileApplication : mobileFeature=" + mobileFeature;
	}
	
	

}
