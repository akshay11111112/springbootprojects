package com.example.dasboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dasboot.model.Shipwreck;
import com.example.dasboot.repository.ShipwreckRepository;

@RestController
@RequestMapping("api/v1")
public class Shipwreckontroller {

     @Autowired
     private ShipwreckRepository shipwreckrepository;
	@GetMapping("/shipwrecks")
	public List<Shipwreck> list(){
		return shipwreckrepository.findAll();
	}
	@RequestMapping(value="shipwrecks", method=RequestMethod.POST)
	//@PostMapping("/shipwrecks")
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		return shipwreckrepository.saveAndFlush(shipwreck);
		
	}
	
//	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.GET)
	@GetMapping("/shipwrecks/{id}")
	public Optional<Shipwreck> get(@PathVariable long id) {
		return shipwreckrepository.findById(id);		
	}
	
	
		//	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.PUT)
	@PutMapping("/shipwrecks/{id}")
	public Shipwreck update(@PathVariable long id,@RequestBody Shipwreck shipwreck) {
		Optional<Shipwreck> existingShipwreck=shipwreckrepository.findById(id);
		BeanUtils.copyProperties(shipwreck, existingShipwreck);
		return shipwreckrepository.saveAndFlush(shipwreck);
	}
	
			
	//		@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.DELETE)
			@SuppressWarnings("deprecation")
			@DeleteMapping("/shipwrecks/{id}")
			public Optional<Shipwreck> delete(@PathVariable long id) {
				Optional<Shipwreck> existingShipwreck=shipwreckrepository.findById(id);
				shipwreckrepository.deleteById(id);
				return existingShipwreck;
			}
}
