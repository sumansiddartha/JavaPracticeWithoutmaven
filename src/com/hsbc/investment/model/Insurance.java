package com.hsbc.investment.model;

public class Insurance {
	private GeneralInsurance generalInsurance;
	private HealthInsurance healthInsurance;
	private LifeInsurance lifeInsurance;
	
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(GeneralInsurance generalInsurance, HealthInsurance healthInsurance, LifeInsurance lifeInsurance) {
		super();
		this.generalInsurance = generalInsurance;
		this.healthInsurance = healthInsurance;
		this.lifeInsurance = lifeInsurance;
	}
	public GeneralInsurance getGeneralInsurance() {
		return generalInsurance;
	}
	public void setGeneralInsurance(GeneralInsurance generalInsurance) {
		this.generalInsurance = generalInsurance;
	}
	public HealthInsurance getHealthInsurance() {
		return healthInsurance;
	}
	public void setHealthInsurance(HealthInsurance healthInsurance) {
		this.healthInsurance = healthInsurance;
	}
	public LifeInsurance getInsurance() {
		return lifeInsurance;
	}
	public void setInsurance(LifeInsurance lifeInsurance) {
		this.lifeInsurance = lifeInsurance;
	}
	

}
