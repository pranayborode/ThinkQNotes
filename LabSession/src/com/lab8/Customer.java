package com.lab8;

public class Customer {

	private int cid;
	private String cname;
	private String cmail;
	private long ccontact;
	private String cpass;
	
	Customer(){
		
	}
	
	Customer(int cid,String cname,String cmail, long ccontact, String cpass){
		
		this.cid = cid;
		this.cname = cname;
		this.cmail = cmail;
		this.ccontact = ccontact;
		this.cpass = cpass;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public int getCid() {
		return cid;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	
	public String getCmail() {
		return cmail;
	}
	
	public void setCcontact(long ccontact) {
		this.ccontact = ccontact;
	}
	
	public long getCcontact() {
		return ccontact;
	}
	
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	
	public String getCpass() {
		return cpass;
	}

	public String toString() {
	
		return "Customer   cid : "+cid+" cname : "+cname+" cmail : "+cmail+" ccontact : "+ccontact+" cpass : "+cpass;
	}
	
	
	
}
