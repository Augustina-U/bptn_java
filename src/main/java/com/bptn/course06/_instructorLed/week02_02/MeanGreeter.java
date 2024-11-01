package com.bptn.course06._instructorLed.week02_02;

class MeanGreeter extends Greeter {
	   
    @Override
    public String greet() {
        return "Go Away";
    }
}

class SpanishGreeter extends Greeter {
    @Override
    public String greet() {
        return "Hola";
    }
}