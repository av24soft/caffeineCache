package com.avsoft.demo.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhetherController {

	@GetMapping("/getWhether/{city}")
	@Cacheable("mycache")
	public ResponseEntity getWhether(@PathVariable("city") String city) {
		
		System.out.println("calling getWhether service");

		return ResponseEntity.ok(city + " = 30");

	}
	
}
