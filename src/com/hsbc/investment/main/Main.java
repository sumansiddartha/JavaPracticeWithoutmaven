package com.hsbc.investment.main;

import com.hsbc.investment.model.HealthInsurance;

public class Main {

	public static void main(String[] args) {
		HealthInsurance healthInsurance=new HealthInsurance(2025, "HSBC", 25000.22, "james", "xyz@gmail.com", 5622555);
			System.out.println(healthInsurance.getUserFullName().toUpperCase());
	}

}
