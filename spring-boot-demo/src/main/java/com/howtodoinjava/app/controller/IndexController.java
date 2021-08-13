package com.howtodoinjava.app.controller;

import java.util.Map;
import com.howtodoinjava.app.controller.web.View;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
@Controller
public class IndexController {

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("message", "Spring Boot application that uses JSP With Embedded Tomcat");
        return View.HOME.getPath();
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
