package ktest.common;

import io.cucumber.spring.CucumberContextConfiguration;
import ktest.BasicApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BasicApplication.class })
public class CucumberSpingConfiguration {}
