package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.Alien;

import java.util.*;


public interface AlienRepo extends JpaRepository<Alien, Integer> {

	
	List<Alien> findByAname(String aname);
	
	List<Alien> findByAidGreaterThan(int aid);
	
	
	@Query("from Alien order by aname")
	List<Alien> findByAnameSorted();
	
	
}
