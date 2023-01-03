package com.springframework.applicationcontext.settertype2;

// Using Setter Injection

public class Candidate {

	// Declare

	private String city;

	// Use Getter & Setter

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// Create Method

	public void getMessage(String myName) {

		System.out.println("Hello," + myName + city);
	}

	@Override
	public String toString() {
		return "Candidate [city=" + city + "]";
	}

}
