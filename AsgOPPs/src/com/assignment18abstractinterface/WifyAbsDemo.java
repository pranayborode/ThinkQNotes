package com.assignment18abstractinterface;

 public abstract class WifyAbsDemo {

	protected String wifyName;
	protected String password;

	public WifyAbsDemo(String wifyName, String password) {
		this.wifyName = wifyName;
		this.password = password;
	}

	protected abstract void accessWify();

	@Override
	public String toString() {
		return ",  WifyAbsDemo : wifyName=" + wifyName + ", password=" + password;
	}
	
	
}
