package com.web.controller.test;

import com.web.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

  @LocalServerPort private int port;

  @Autowired private TestRestTemplate restTemplate;

  @Autowired private HelloController helloController;

  @Test
  public void testHelloMessage() {
    assert (restTemplate
        .getForObject("http://localhost:" + port, String.class)
        .equals("Hello Docker World!"));
  }
}
