package com.example.workflow;

import java.util.HashMap;
import java.util.Map;
import org.camunda.bpm.engine.ProcessEngines;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Map<String,Object> variables = new HashMap<>();
    variables.put("customer", "John Doe");
    variables.put("version", "1.0");
    ProcessEngines.getDefaultProcessEngine()
        .getRuntimeService()
        .startProcessInstanceByKey("xslt-process", variables);
  }
}