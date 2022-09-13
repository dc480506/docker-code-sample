package com.sample.api.controller;
// Importing required classes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
  
// Annotation
@Controller
// Main class
public class DemoController {
  @RequestMapping("/")
  @ResponseBody
  public String availableAPI(){
    return "Available API:\n /hello";
  }

    @RequestMapping("/hello")
    @ResponseBody
  
    // Method
    public String hello()
    {
        return "Hello World";
    }
}
