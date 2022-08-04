package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

import java.util.*;

@Controller
public class AlienController {
	
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	
	@RequestMapping("/addAlien")
	public String add(Alien alien) {
		
		repo.save(alien);
		return "home.jsp";
	}
	
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> get() {
		
		return repo.findAll();
		
	}
	
	
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid")  int aid) {
		
		return repo.findById(aid);
		
	}
	
	
	

}
