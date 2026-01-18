package com.hsbc.investment.model;

public class HealthInsurance {
	private int custId;
	private String companyName;
	private double premiumamount;
	private String userFullName;
	private String emailId;
	private long mobileNumber;
	
	
	
	
	
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HealthInsurance(int custId, String companyName, double premiumamount, String userFullName, String emailId,
			long mobileNumber) {
		super();
		this.custId = custId;
		this.companyName = companyName;
		this.premiumamount = premiumamount;
		this.userFullName = userFullName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPremiumamount() {
		return premiumamount;
	}
	public void setPremiumamount(double premiumamount) {
		this.premiumamount = premiumamount;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
