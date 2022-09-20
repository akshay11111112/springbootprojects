package com.example.dasboot;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.dasboot.model.Shipwreck;
import com.example.dasboot.repository.ShipwreckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(DasbootApplication.class)
public class ShipwreckRepositoryIntegrationTest {
	@Autowired
	private ShipwreckRepository shipwreckrepository; 
	
	
@Test
public void FindAll() {
	List<Shipwreck> wrecks=shipwreckrepository.findAll();
	assertThat(wrecks.size(),is(greaterThanOrEqualTo(0)));
}
	
}
