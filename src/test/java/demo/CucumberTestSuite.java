package demo;


import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.spring.SpringFactory;
import org.junit.platform.suite.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@SelectClasspathResource("/features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty,timeline:build/test-results/timeline")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "demo.stepdefinitions, demo.config")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@Test1")
//@SpringBootTest
//@ActiveProfiles("test")
public class CucumberTestSuite {
}
