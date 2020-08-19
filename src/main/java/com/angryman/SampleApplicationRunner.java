package com.angryman;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SampleApplicationRunner implements ApplicationRunner {
    @Value("${test.name}")
    private String testName;

    @Value("${test.age}")
    private int testAge;

    @Value("${test.full.name}")
    private String testFullName;

    @Override
    public void run(final ApplicationArguments args) {
        System.out.println(String.format("foo : %b", args.containsOption("foo")));
        System.out.println(String.format("bar : %b", args.containsOption("bar")));

        // application.properties는 같은 이름으로 4군데 둘 수 있으며 우선순위가 높게 설정된 값으로 덮어씀
        // 1순위 : file:./config/application.properties
        // 2순위 : file:./application.properties
        // 3순위 : classpath:./config/application.properties
        // 4순위 : classpath:./application.properties
        System.out.println(String.format("testName : %s", this.testName));
        System.out.println(String.format("testAge : %d", this.testAge));
        System.out.println(String.format("testFullName : %s", this.testFullName));
    }
}
