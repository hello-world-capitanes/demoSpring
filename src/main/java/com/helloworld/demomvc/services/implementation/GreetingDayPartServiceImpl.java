package com.helloworld.demomvc.services.implementation;

import java.util.Calendar;
import com.helloworld.demomvc.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("dayPart")
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
