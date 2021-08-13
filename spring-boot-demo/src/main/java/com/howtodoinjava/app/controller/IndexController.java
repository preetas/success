package com.howtodoinjava.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication
@Controller
public class IndexController {

	@RequestMapping("/Index")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}
	
	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "next";
	}
public static void main(String[] args) {
        SpringApplication.run(IndexController.class, args);//run
    }

}
