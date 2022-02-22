package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@GetMapping
	public String hello() {
		return "Hello World";
	}

}
