package com.helloworld.demomvc.models;

public class GreetingConfig {
    
    private String greeting;
    private int hourInit;
    private int hourEnd;
    
    public GreetingConfig(String greeting, int hourInit, int hourEnd) {
        this.greeting = greeting;
        this.hourInit = hourInit;
        this.hourEnd = hourEnd;
    }

    public String getGreeting() {
        return greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    public int getHourInit() {
        return hourInit;
    }
    public void setHourInit(int hourInit) {
        this.hourInit = hourInit;
    }
    public int getHourEnd() {
        return hourEnd;
    }
    public void setHourEnd(int hourEnd) {
        this.hourEnd = hourEnd;
    }

    
}
