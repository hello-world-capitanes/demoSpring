package com.helloworld.demomvc.services.implementation;

import com.helloworld.demomvc.services.GreetingService;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getHello() {
        return "¡Hola mundo!";
    }
}
