package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController                          // This  class work for restpull services
@RequestMapping("/users")                // map the URL with controller class base in the re source
public class userController {
//  
	@GetMapping                         // To Trigger the Get request(mapping for get method)
	public String getUsers() {
	return "http GET request was send";
	}
	
	
	
	
	
	
	@PostMapping                         // To Trigger the Post request(mapping for post method)
	public String postUsers() {
	return "http post request was send";
	}
	@PutMapping                         // To Trigger the put request(mapping for put method)
	public String putUsers() {
	return "http put request was send";
	}
	@DeleteMapping                         // To Trigger the delete request(mapping for delete  method)
	public String deleteUsers() {
	return "http delete request was send";
	}
	
//	//Path parameter
//	@GetMapping(path="/{userID}")                         // To pass the path parameter To find the particular userID
//	public String getUsers1(@PathVariable String userID) { //here we need to use @PathVariable as an a rgument
//	return "http GET request was send for userID:"+ userID;
//	}
//	
	//Query parameter
//	@GetMapping                         // 
//	public String getUsers(@RequestParam(value="page")int pageno, @RequestParam(value="limit")int limitno) { //
//	return "http GET request was send for page:"+pageno+"and limet is:"+limitno;
//	}
	
}
