package com.example.demo;

import org.junit.Test;

public class HelloWorldTests {

  @Test
  public void testGetMessage() {
    HelloWorld subject = new HelloWorld();
    System.out.println(subject.getMessage(false));
  }
}
