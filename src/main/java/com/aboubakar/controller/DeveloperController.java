/**
 * 
 */
package com.aboubakar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aboubakar.dao.DeveloperDao;
import com.aboubakar.model.Developer;

/**
 * @author Aboubakar
 *
 */
@RestController
public class DeveloperController {
	
	@Autowired
	private DeveloperDao developerDao;
	
	@GetMapping("/devs")
	public List<Developer> getAllDevelopers(){
		return developerDao.getAllDevelopers();
	}
	
	@GetMapping("/dev/{id}")
	public Developer getDeveloper(@PathVariable(value="id") int id) {
		
		return  developerDao.getDeveloper(id);
	}

	@PostMapping("/dev")
	public void createUser(@RequestBody Developer dev) {
		developerDao.addDevelopper(dev);
	}
	
	@DeleteMapping("/dev/{id}")
	public void deleteDeveloper(@PathVariable(value="id") int id) {
		developerDao.deleteDeveloper(id);
	}
}
