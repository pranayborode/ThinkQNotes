package app.prog;

public class WebApplication extends Application {

	private String supportBrowser;

	public WebApplication(double version, String technology, Developer developer, String supportBrowser) {
		super(version, technology, developer);
		this.supportBrowser = supportBrowser;
	}

	public String getSupportBrowser() {
		return supportBrowser;
	}

	public void setSupportBrowser(String supportBrowser) {
		this.supportBrowser = supportBrowser;
	}

	@Override
	public String toString() {
		return super.toString()+"WebApplication : supportBrowser=" + supportBrowser;
	}

	
}
