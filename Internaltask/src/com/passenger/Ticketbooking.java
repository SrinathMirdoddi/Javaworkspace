package com.passenger;

public class Ticketbooking {
	
	 private String pname;
	 private int age;
	 private String gender;
	 private String email;
	 private double ticketprice;
	 private double distance;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Ticketbooking(String pname, int age, String gender, String email, double ticketprice, double distance) {
		super();
		this.pname = pname;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.ticketprice = ticketprice;
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Ticketbooking [" + (pname != null ? "pname=" + pname + ", " : "") + "age=" + age + ", "
				+ (gender != null ? "gender=" + gender + ", " : "") + (email != null ? "email=" + email + ", " : "")
				+ "ticketprice=" + ticketprice + ", distance=" + distance + "]";
	}
	 
	 
	 
}