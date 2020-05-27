/**
 * 
 */
package com.aboubakar.model;

/**
 * @author Aboubakar
 *
 */
public class Developer {

	private int id;
	private String name;
	private String Techno;
	
	public Developer() {
		
	}
	public Developer(int id, String name, String techno) {
		this.id = id;
		this.name = name;
		Techno = techno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechno() {
		return Techno;
	}
	public void setTechno(String techno) {
		Techno = techno;
	}
	
	
}
