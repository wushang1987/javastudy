package com.listTest.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> courses;

	public SetTest() {
		this.courses = new ArrayList<Course>();
	}

	public void testAdd() {
		// 创建一个课程对象，并通过add 方法添加到list中
		Course cr1 = new Course(1, "java基础");
		courses.add(cr1);
		Course temp = (Course) courses.get(0);
		System.out.println("插入了一条数据" + temp.getId() + temp.getName());

		Course cr2 = new Course(2, "c语言");
		courses.add(0, cr2);
		Course temp2 = (Course) courses.get(0);
		System.out.println("插入了一条数据" + temp2.getId() + temp2.getName());
	}

	public void testForeach() {
		for (Object object : courses) {
			Course course = (Course) object;
			System.out.println("查询foreach的数据" + course.getId() + course.getName());
		}
	}

	public void testForeachSet(Student student) {
		System.out.println("看看选了啥");
		for (Course course : student.course) {
			System.out.println("选择了课程" + course.getId() + course.getName());
		}
	}

	public static void main(String[] args) {
		SetTest setTest = new SetTest();
		setTest.testAdd();
		setTest.testForeach();

		// 创建学生对象
		Student student = new Student(1, "小明");
		System.out.println("欢迎学生" + student.getName() + "选课");

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程ID");
			String scannerId = scanner.next();
			System.out.println(scannerId);
			System.out.println(setTest.courses);
			for (Course course : setTest.courses) {
				int courseId = course.getId();

				String kk = String.valueOf(courseId);
				String courseName = course.getName();
				if (kk.equals(scannerId)) {
					student.course.add(course);
				}

			}

		}
		// 打印输入学生所选课程

		setTest.testForeachSet(student);
	}

}
