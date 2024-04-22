package app.prog;

public class Developer {

	private String devName;
	private int devExperience;
	private String skills;
	
	public Developer(String devName, int devExperience, String skills) {
		super();
		this.devName = devName;
		this.devExperience = devExperience;
		this.skills = skills;
	}

	public void debugApp() {
		System.out.println("Developer debug the App");
	}
	
	public void integrateCode() {
		System.out.println("Developer Integrate code");
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public int getDevExperience() {
		return devExperience;
	}

	public void setDevExperience(int devExperience) {
		this.devExperience = devExperience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Developer : devName=" + devName + ", devExperience=" + devExperience + ", skills=" + skills;
	}
	
	
	
}
