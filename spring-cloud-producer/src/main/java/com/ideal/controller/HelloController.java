package com.ideal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

  @Value("${yaloo.test}")
  private String value;

  @RequestMapping("/hello")
  public String index(@RequestParam String name) {
    return "hello "+name + value +"，this is first messge";
  }
}
