package com.helloworld.demomvc.services.implementation;

import com.helloworld.demomvc.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("regular")
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getHello() {
        return "¡Hola mundo!";
    }
}
