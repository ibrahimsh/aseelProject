package com.example.demo.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.user;
import com.example.demo.service.userService;



@RestController
public class adminControl {

	@Autowired
	private userService uDao;
	
	@PostMapping(value= "admin/addUser", consumes= "application/json", produces= "application/json")
		public user  addUser(@RequestBody user usr)
		{
			
			user n = new  user();
			System.out.println(usr);
			n.setEmail(usr.getEmail());
			n.setFname(usr.getFname());
			n.setLname(usr.getLname());
			n.setPassword(usr.getPassword());
			uDao.saveUser(n);
		  
			 HttpHeaders httpHeaders = new HttpHeaders();
			 return n;
			
		}
		@GetMapping("/admin/getAll")
		public Collection<user>getAllUsers()
		{
			return uDao.getAllUser();
		}
	
		
		
		@RequestMapping("/admin/hi")
		@ResponseBody
		public String printHi()
		{
			return "hi";
		}

	
		@PostMapping("admin/login/{email}/{password}")
		public user login(@PathVariable(name="email") String email , @PathVariable(name="password") String password)
		{
			return uDao.loginUser(email, password);
		}
		
	}

