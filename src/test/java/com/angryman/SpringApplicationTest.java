package com.angryman;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest(properties = "test.name=TestAngryMan2")
public class SpringApplicationTest {
    @Autowired
    private Environment environment;

    @Test
    public void contextLoads() {
        // 테스트용 properties에 값이 등록되어 있으나 @SpringBootTest에 설정된 값이 우선순위가 높기 때문에 properties 설정은 무시됨
        Assertions.assertThat(this.environment.getProperty("test.name")).isEqualTo("TestAngryMan2");

        Assertions.assertThat(this.environment.getProperty("test.age")).isEqualTo("300");

        // 테스트용 properties에 값이 등록되어있지 않아 실제 properties 값을 가져옴
        // 하지만 테스트용 properties의 test.name 값이 오버라이딩 되었기 때문에 test.full.name은 바뀜
        Assertions.assertThat(this.environment.getProperty("test.full.name")).isEqualTo("TestAngryMan2 Full");
    }
}
