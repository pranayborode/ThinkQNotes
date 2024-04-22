package app.prog;

public class DesktopApplication extends Application {

	private String supportOS;

	public DesktopApplication(double version, String technology, Developer developer, String supportOS) {
		super(version, technology, developer);
		this.supportOS = supportOS;
	}

	public String getSupportBrowser() {
		return supportOS;
	}

	public void setSupportBrowser(String supportOS) {
		this.supportOS = supportOS;
	}


	@Override
	public String toString() {
		return super.toString()+"DesktopApplication : supportOS=" + supportOS;
	}
	
	
	

	
}
