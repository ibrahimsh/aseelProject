package com.example.demo.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.userDao;
import com.example.demo.models.user;

@Service
@Transactional
public class userService {

	@Autowired
	private userDao repos;
	
	public user addUser(user usr)	{
		return repos.save(usr);
	}
	
	 public Collection<user> getAllUser(){
		return repos.findAll(); 
	 }
	 
	 public user loginUser(String email,String password)
	 {
		 return repos.checkUser(email, password);
	 }
		
	 public void deleteUser(user u) {
		 repos.delete(u);
	 }
	 
	 public user updateUser (user u) {
		 return repos.save(u);
	 }

	public user saveUser(user u) {
		 return repos.save(u);
	}
	 
	}
	 

