package com.example.dasboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dasboot.controller.Homecontroller;

@SpringBootTest
class DasbootApplicationTests {

	@Test
	public void  apptest() {
		Homecontroller hc=new Homecontroller();
		String result=hc.home();
	assertEquals(result,"Das Boot, reporting for Duty!");
	}

}
