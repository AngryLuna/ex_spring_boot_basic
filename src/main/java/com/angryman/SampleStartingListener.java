package com.angryman;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class SampleStartingListener implements ApplicationListener<ApplicationStartingEvent> {
    // ApplicationStartingEvent는 ApplicationContext 생성 이전에 실행되기에 @Component 사용해서 bean으로 등록하는 의미가 없음

    @Override
    public void onApplicationEvent(final ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("====================");
        System.out.println("Application Starting");
        System.out.println("====================");
    }
}
