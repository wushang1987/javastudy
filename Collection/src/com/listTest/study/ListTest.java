package com.listTest.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 被选课程类
 * 
 * @author WWD
 *
 */
public class ListTest {
	private List courseSelect;

	public List getCourseSelect() {
		return courseSelect;
	}

	public void setCourseSelect(List courseSelect) {
		this.courseSelect = courseSelect;
	}

	/*
	 * 用于存放被选课程的List
	 */
	public ListTest() {
		this.courseSelect = new ArrayList();
	}

	/*
	 * 用于向course select 中添加被选课程
	 */
	public void testAdd() {
		// 创建一个课程对象，并通过add 方法添加到list中
		Course cr1 = new Course(1, "java基础");
		courseSelect.add(cr1);
		Course temp = (Course) courseSelect.get(0);
		System.out.println("插入了一条数据" + temp.getId() + temp.getName());

		Course cr2 = new Course(2, "c语言");
		courseSelect.add(0, cr2);
		Course temp2 = (Course) courseSelect.get(0);
		System.out.println("插入了一条数据" + temp2.getId() + temp2.getName());
		// 以下方法会抛出异常
		// Course cr3 = new Course(3, "javascript");
		// courseSelect.add(3, cr3);
		// Course temp3 = (Course) courseSelect.get(0);
		// System.out.println("插入了一条数据"+temp3.getId()+temp3.getName());

		Course[] courses = { new Course(3, "html"), new Course(4, "css") };

		courseSelect.addAll(Arrays.asList(courses));

		Course temp3 = (Course) courseSelect.get(2);
		System.out.println("插入了一条数据" + temp3.getId() + temp3.getName());

		Course temp4 = (Course) courseSelect.get(3);
		System.out.println("插入了一条数据" + temp4.getId() + temp4.getName());

		Course[] courses2 = { new Course(5, "高等数学"), new Course(4, "大学英语") };

		courseSelect.addAll(2, Arrays.asList(courses2));

		Course temp5 = (Course) courseSelect.get(2);
		System.out.println("插入了一条数据" + temp5.getId() + temp5.getName());

		Course temp6 = (Course) courseSelect.get(3);
		System.out.println("插入了一条数据" + temp6.getId() + temp6.getName());

	}

	public void testGet() {
		int size = courseSelect.size();
		for (int i = 0; i < size; i++) {
			Course cr = (Course) courseSelect.get(i);

			System.out.println("查询出来的数据" + cr.getId() + cr.getName());
		}
	}

	/**
	 * 通过迭代器来遍历list
	 */

	public void testIterator() {
		Iterator iterator = courseSelect.iterator();
		while (iterator.hasNext()) {
			Course course = (Course) iterator.next();
			System.out.println("查询iterator的数据" + course.getId() + course.getName());
		}

	}

	/**
	 * 通过foreach
	 */

	public void testForeach() {
		for (Object object : courseSelect) {
			Course course = (Course) object;
			System.out.println("查询foreach的数据" + course.getId() + course.getName());
		}
	}

	/**
	 * 修改list中的元素
	 */
	public void testModify() {
		courseSelect.set(0, new Course(1, "电工电子"));
		System.out.println("------------------");
	}

	/**
	 * 删除list中的元素，删除指定ID
	 */

	public void testRemove() {
		courseSelect.remove(0);
		System.out.println("------------------");
	}

	/**
	 * 删除一个对象
	 */
	public void testRemoveObj() {
		Course course = (Course) courseSelect.get(2);
		String name = course.getName();
		courseSelect.remove(course);
		System.out.println("--------删除掉" + name + "---------");
	}

	public void testRemoveAllObj() {
		Course[] courses = { (Course) courseSelect.get(1), (Course) courseSelect.get(2) };
		courseSelect.removeAll(Arrays.asList(courses));

		System.out.println("--------删除掉高等数学html---------");
	}

	/**
	 * 删除所有
	 */
	public void testRemoveAll() {
		courseSelect.removeAll(courseSelect);
		System.out.println("---------删除掉就查不到了---------");
	}

	// public void testType() {
	// courseSelect.add("添加一些奇怪的方法");
	// }

}
