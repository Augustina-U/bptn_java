package com.bptn_02_fridayCodingChallenge_Employee.fr;

public class Employee {

	// Instance variable to store salary
	private int salary;

	// Instance variable to store hours per day worked by employee
	private double hoursPerDay;

	// Constructor to set instance variables(salary and hoursPerDay) value
	public Employee(int salary, int hoursPerDay) {
		setSalary(salary); // set the values of salary using set method
		setHoursPerDay(hoursPerDay); // set the number of hours per day using set method
	}

	// Set method to update salary
	public void setSalary(int salary) {
		// Increase salary by 10 if it's less than 500
		if (salary < 500) {
			this.salary = salary + 10;
		} else {
			this.salary = salary;
		}
	}

	// Set method to update hoursPerDay
	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
		// Increase salary by 5 if hours per day is greater than 6
		if (hoursPerDay > 6) {
			this.salary += 5;
		}
	}

	// Get method to return salary
	public int getSalary() {
		return this.salary;
	}
}
