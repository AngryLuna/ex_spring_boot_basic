package com.angryman;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(final ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("==================");
        System.out.println("Application Stared");
        System.out.println("==================");
    }
}
