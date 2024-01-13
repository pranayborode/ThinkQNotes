package com.asg14containment;

public class Dept {
	
	private int deptId;
    private String deptName;
    
    public Dept() {
		
	}

	public Dept(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
	public String toString() {
		return "Dept : DeptId - " + deptId + ", DeptName - " + deptName;
	}
    
	
    
}
