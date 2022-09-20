package com.example.dasboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
@RequestMapping("/")
public String home() {
	return "Das Boot, reporting for Duty!";
}
}
