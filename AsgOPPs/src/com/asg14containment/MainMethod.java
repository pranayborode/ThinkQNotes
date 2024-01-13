package com.asg14containment;

class Institute {

	private int instId;
	private String instName;
	
	public Institute() {
		
	}

	public Institute(int instId, String instName) {
		this.instId = instId;
		this.instName = instName;
	}

	public int getInstId() {
		return instId;
	}

	public void setInstId(int instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String toString() {
		return "Institute : instId=" + instId + ", instName=" + instName ;
	}
	
	
}


class Branch{
	
	private int bchId;
	private String bchName;
	private Institute institute;
	
	public Branch() {
		
	}

	public Branch(int bchId, String bchName, Institute institute) {
		this.bchId = bchId;
		this.bchName = bchName;
		this.institute = institute;
	}

	public int getBchId() {
		return bchId;
	}

	public void setBchId(int bchId) {
		this.bchId = bchId;
	}

	public String getBchName() {
		return bchName;
	}

	public void setBchName(String bchName) {
		this.bchName = bchName;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	public String toString() {
		return "Branch : bchId=" + bchId + ", bchName=" + bchName + ", \n" + institute ;
	}
}

class Subject{
	
	private int subId;
	private String subName;
	private Branch branch;
	
	public Subject() {
		
	}

	public Subject(int subId, String subName, Branch branch) {
		this.subId = subId;
		this.subName = subName;
		this.branch = branch;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	
	public String toString() {
		return "Subject : subId=" + subId + ", subName=" + subName + ", \n" + branch ;
	}
	
}

class Topic{
	
	private int topId;
	private String topName;
	private Subject subject;
	
	public Topic() {
		
	}

	public Topic(int topId, String topName, Subject subject) {
		this.topId = topId;
		this.topName = topName;
		this.subject = subject;
	}

	public int getTopId() {
		return topId;
	}

	public void setTopId(int topId) {
		this.topId = topId;
	}

	public String getTopName() {
		return topName;
	}

	public void setTopName(String topName) {
		this.topName = topName;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String toString() {
		return "Topic : topId=" + topId + ", topName=" + topName + ", \n" + subject;
	}

}

class SubTopic{
	
	private int subTopId;
	private String subTopName;
	private Topic topic;
	
	public SubTopic() {
		
	}

	public SubTopic(int subTopId, String subTopName, Topic topic) {
		this.subTopId = subTopId;
		this.subTopName = subTopName;
		this.topic = topic;
	}

	public int getSubTopId() {
		return subTopId;
	}

	public void setSubTopId(int subTopId) {
		this.subTopId = subTopId;
	}

	public String getSubTopName() {
		return subTopName;
	}

	public void setSubTopName(String subTopName) {
		this.subTopName = subTopName;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String toString() {
		return "SubTopic : subTopId=" + subTopId + ", subTopName=" + subTopName + ", \n" + topic;
	}

}

class Question{
	
	private int qtnId;
	private String qtnName;
	private SubTopic subTopic;
	
	public Question() {
		
	}
	
	public Question(int qtnId, String qtnName, SubTopic subTopic) {
		this.qtnId = qtnId;
		this.qtnName = qtnName;
		this.subTopic = subTopic;
	}

	public int getQtnId() {
		return qtnId;
	}

	public void setQtnId(int qtnId) {
		this.qtnId = qtnId;
	}

	public String getQtnName() {
		return qtnName;
	}

	public void setQtnName(String qtnName) {
		this.qtnName = qtnName;
	}

	public SubTopic getSubTopic() {
		return subTopic;
	}

	public void setSubTopic(SubTopic subTopic) {
		this.subTopic = subTopic;
	}

	public String toString() {
		return "Question : qtnId=" + qtnId + ", qtnName=" + qtnName + ", \n" + subTopic;
	}
	
}



public class MainMethod {

	public static void main(String[] args) {
		
		Institute i1 = new Institute(101, "SGBAU");
		Branch b1 = new Branch(5, "Electronics", i1);
		Subject sub1 = new Subject(1001, "VLSI", b1);
		Topic top1 = new Topic(222, "Ic-Design", sub1);
		SubTopic st1 = new SubTopic(24,"MOSFET-Design", top1);
		Question q1 = new Question();
		
		q1.setQtnId(123);
		q1.setQtnName("How to design MOSFET ?");
		q1.setSubTopic(st1);
		
		System.out.println(q1);

	}

}
