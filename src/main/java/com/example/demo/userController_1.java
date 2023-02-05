package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController_1 {
	
// for path variable
	@GetMapping(path="/{userID}")
	public String getUser(@PathVariable String userID)
	{
		return "http Get Requesr was send for userId "+ userID;
	}
	
	
	
	
	
	
	
	// for Query paramater
	@GetMapping
	public String getUser(@RequestParam(value="page") int pageno, @RequestParam(value="limit")int limitno)
	{
		return "http Get Requesr was send for page:"+pageno+"and limit is:"+limitno;
	}
	
	
}
