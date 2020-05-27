/**
 * 
 */
package com.aboubakar.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aboubakar.model.Developer;

/**
 * @author Aboubakar
 *
 */
@Service
public class DeveloperDao {
	
	List<Developer> devs = new ArrayList<Developer>();
	
	Developer dev1 = new Developer(101,"Mike Tayson", "Java");
	Developer dev2 = new Developer(102,"Mohamed Ali", "PHP");
	Developer dev3 = new Developer(103,"Floyd Mayweather","C#");
	
	{
	devs.add(dev1);
	devs.add(dev2);
	devs.add(dev3);
	}
	
	// Method to get a single developer by Id
	public Developer getDeveloper(int id) {
		
		for(Developer dev: devs) {
			if(dev.getId()==id)
				return dev;
		}
		return new Developer(id,"No developer for this Id","No techno");
	}
	
	// Method to get all developers in the list
	public List<Developer> getAllDevelopers(){
		
		return devs;
	}
	
	// Method to add a new developer on the list
	public void addDevelopper(Developer dev) {
		devs.add(dev);
	}
	
	// Method for deleting developer on the list
	public void deleteDeveloper(int id) {	
		for(int i = 0; i<devs.size(); i++) {
			Developer dev = devs.get(i);
			if(dev.getId()==id) {
				devs.remove(dev);
				break; // Not recommanded
			}
			
		}
	}
	
}
