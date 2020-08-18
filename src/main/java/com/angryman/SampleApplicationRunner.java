package com.angryman;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SampleApplicationRunner implements ApplicationRunner {
    @Override
    public void run(final ApplicationArguments args) {
        System.out.println(String.format("foo : %b", args.containsOption("foo")));
        System.out.println(String.format("bar : %b", args.containsOption("bar")));
    }
}
