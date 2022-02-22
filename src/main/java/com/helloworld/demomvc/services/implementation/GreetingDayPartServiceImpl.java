package com.helloworld.demomvc.services.implementation;

import java.util.Calendar;
import com.helloworld.demomvc.services.GreetingService;

public class GreetingDayPartServiceImpl implements GreetingService {

    @Override
    public String getHello() {
        
        // Creating a calendar
        Calendar now = Calendar.getInstance();
        int currentHour = now.get(Calendar.HOUR_OF_DAY);
        if(currentHour <= 13){
            return "¡Buenos días, mundo!";
        } else if (currentHour <= 21){
            return "¡Buenos tardes, mundo!";
        } else {
            return "¡Buenos noches, mundo!";
        }        
    }
}
