package com.asg6CollectionMasterAssignment;

//Create a class Course which contains cid, cname , startDate (Date object) subject , fees, 
//duration . For this class you can have public fields as well. [NOTE: one student can be in 
//one course only]

public class Course {

	private int cid;
	private String cname;
	private Date startDate;
	private double fees;
	private int duration;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname, Date startDate, double fees, int duration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.startDate = startDate;
		this.fees = fees;
		this.duration = duration;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + ", duration=" + duration + "]";
	}

}
