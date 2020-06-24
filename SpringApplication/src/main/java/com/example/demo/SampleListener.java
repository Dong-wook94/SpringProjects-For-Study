package com.example.demo;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("=======================");
        System.out.println("Application started");
        System.out.println("=======================");
    }

//    @Override
//    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
//        System.out.println("=======================");
//        System.out.println("Application is starting");
//        System.out.println("=======================");
//    }
}
