package com.listTest.study;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	/**
	 * 带有泛型的List
	 */
	public List<Course> courses;

	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	
	/**
	 * 测试增加方法
	 * @param args
	 */
	public void testAdd() {
		Course cr1 = new Course(1, "english");
		courses.add(cr1);
		//泛型集合中不能添加泛型规定的类型以外的对象，否则会报错
		//courses.add("dfadsf");
		
		Course cr2 = new Course(2, "java 基础");
		courses.add(cr2);
	}
	
	/**
	 * 测试循环遍历的方法
	 * @param args
	 */
	public void testForeach() {
		for (Course course : courses) {
			System.out.println("看一下里面添加了什么代码："+course.getName());
		}
	}
	
	/**
	 * 泛型方法可以添加泛型的子类型的对象实例
	 * @param args
	 */
	public void testChild() {
		ChildCourse childCourse =  new ChildCourse();
		childCourse.setId(1);
		childCourse.setName("我是子类型的实现");
		courses.add(childCourse);
	}
	
	/**
	 *泛型不能使用基本类型
	 * @param args
	 */
	public void testBasieType() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("基本类型包装类"+list.get(0));
	}

	public static void main(String[] args) {
		TestGeneric testGeneric = new TestGeneric();
		testGeneric.testAdd();
		testGeneric.testChild();
		testGeneric.testForeach();
		testGeneric.testBasieType();
	}
}
