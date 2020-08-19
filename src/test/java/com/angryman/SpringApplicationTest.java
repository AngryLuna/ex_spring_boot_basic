package com.angryman;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringApplicationTest {
    @Autowired
    private Environment environment;

    @Test
    public void contextLoads() {
        Assertions.assertThat(this.environment.getProperty("test.name")).isEqualTo("TestAngryMan");
        Assertions.assertThat(this.environment.getProperty("test.age")).isEqualTo("300");
    }
}
