package com.angryman;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot";
    }

    @Bean
    public ServletWebServerFactory servletFactory() {
        final TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

    private Connector createStandardConnector() {
        final Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080);
        return connector;
    }

    public static void main(final String[] args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .listeners(new SampleStartingListener()) // bean 등록 이전에 실행되는 Listener, 실행시 직접 등록 필요
                .banner((environment, sourceClass, out) -> { // 배너 설정을 하였으나 파일 설정이 우선시됨
                    out.println("===========");
                    out.println("Banner Test");
                    out.println("===========");
                })
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);
    }
}
