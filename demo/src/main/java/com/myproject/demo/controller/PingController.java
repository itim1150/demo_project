package com.myproject.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PingController {

	 @GetMapping("/ping")
	    public String ping() {
	        return "UP";
	    }
}
