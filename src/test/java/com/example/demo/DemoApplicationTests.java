package com.example.demo;

import org.junit.jupiter.api.Test;
/*import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;*/
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
//@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
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
