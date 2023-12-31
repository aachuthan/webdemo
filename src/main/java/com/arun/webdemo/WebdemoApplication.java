package com.arun.webdemo;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.arun.controller"})
public class WebdemoApplication  implements CommandLineRunner {

  @Autowired
  ApplicationContext applicationContext;

  @GetMapping("/welcome")
  public String  welcome(){
    return "Hello World";
  }

  public static void main(String[] args) {
    SpringApplication.run(WebdemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    String[] beanNames = applicationContext.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    Arrays.stream(beanNames).forEach(s -> System.out.println(s));
  }
}
