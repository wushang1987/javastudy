package com.listTest.study;

/**
 * 课程类
 * @author WWD
 *
 */
public class Course {
	private int id;
	private String name;
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
	public Course(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Course() {
		super();
	}
}
