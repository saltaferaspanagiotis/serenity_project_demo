package demo.config;

import lombok.Data;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@TestConfiguration
@ComponentScan(basePackages = "demo")
@Data
public class TestConfig {
    private String url;
}
