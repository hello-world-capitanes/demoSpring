package com.helloworld.demomvc.services.implementation;

import java.util.Calendar;
import java.util.List;

import com.helloworld.demomvc.daos.GreetingConfigDao;
import com.helloworld.demomvc.models.GreetingConfig;
import com.helloworld.demomvc.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingConfigDao dao;

    @Override
    public String getHello() {
        List<GreetingConfig> rows = dao.getConfig();
        String fullGreetingPattern = "¡%s, mundo!";
        String fullGreeting = "";
        Calendar now = Calendar.getInstance();
        int currentHour = now.get(Calendar.HOUR_OF_DAY);
        for (GreetingConfig greetingConfig : rows) {
            if(greetingConfig.getHourInit() <= currentHour && greetingConfig.getHourEnd() > currentHour){
                fullGreeting = String.format(fullGreetingPattern, greetingConfig.getGreeting());
                break;
            }
        }
        return fullGreeting;
    }
}
