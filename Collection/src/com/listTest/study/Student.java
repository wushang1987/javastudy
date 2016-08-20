package com.listTest.study;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 * @author WWD
 *
 */
public class Student {
	private int id;
	private String name;
	public Set<Course> course;
	
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


	
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.course = new HashSet<Course>();
	}
}
