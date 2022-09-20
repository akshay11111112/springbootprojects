package com.example.dasboot;


import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.dasboot.controller.Shipwreckontroller;
import com.example.dasboot.repository.ShipwreckRepository;

public class shipwreckcontrollertest {

	@InjectMocks
private Shipwreckontroller sc;
	
	@Mock
	private ShipwreckRepository shipwreckrepository;
	
	
	@Before(value = "gettest()")
	public void init () {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void gettest() {
		
	}
}
