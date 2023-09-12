package com.bintybyte.sonarqubedemo;

import com.bintybyte.sonarqubedemo.service.MessageServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class SonarqubeDemoApplicationTests {

	@Autowired
	MessageServiceImpl messageService;

	@Test
	void contextLoads() {
	}

	@Test
	void testMethod1()  {
		assertThrows(NullPointerException.class, () -> {
			messageService.getMessage();
		});
	}

}
