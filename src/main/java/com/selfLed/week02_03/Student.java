package com.selfLed.week02_03;

public class Student extends Person{
	private int id;
    public Student(String name, int id) {
       super(name);
       this.id = id;
    }
    public String toString() {
       return super.toString() + " " + id;
    }
}
