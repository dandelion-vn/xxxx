package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldTests {

  @Test
  public void testGetMessage() {
    HelloWorld subject = new HelloWorld();
    assertEquals("Hello World!", subject.getMessage(false));
  }
}
