package com.bptn.course06._instructorLed.week02_01;

public class Overtime {
	 private double payWithOvertime;

	 public Overtime(Pay p) {
	     payWithOvertime = p.getPay() * 1.5;
	 }

	 public double getOvertimePay() {
	     return payWithOvertime;
	 }
	}