package com.angryman;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties("sample")
@Component
public class SampleProperties {
    private String name;
    private int age;
    private String fullName;
}
