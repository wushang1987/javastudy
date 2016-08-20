package com.listTest.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	/**
	 * 乘装学生类型对象
	 * 
	 * @param args
	 */
	public Map<Integer, Student> students;

	/**
	 * 再构造器中初始化students
	 */

	public MapTest() {
		this.students = new HashMap<Integer, Student>();
	}
	
	/**
	 * 测试添加： 输入学生ID，判断是否被占用
	 * 若未被占用，则输入姓名，创建新学生对象，
	 * 并且添加到students中
	 * @param args
	 */
	public void testPut() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (i<3) {
			System.out.println("请输输入学生ID：");
			int studentId = Integer.valueOf(scanner.next());
			System.out.println("输入的ID为"+studentId);
			Student newStudent =  students.get(studentId);
			if (newStudent == null) {
				System.out.println("请输输入学生的姓名：");
				String name = scanner.next();
				Student kk = new Student(studentId, name);
				students.put(studentId, kk);
				System.out.println("添加了学生"+students.get(studentId).getName());
				i++;
			}else {
				System.out.println("这个学生的ID已经被添加");
				continue;
			}
		}
	}
	/**
	 * 测试map的keySet方法
	 */
	
	public void testkeySet() {
		Set<Integer> keyset = students.keySet();
		
		for (Integer stuid : keyset) {
			Student student = students.get(stuid);
			if (student != null) {
				System.out.println(student.getName());
			}
		}
	}
	
	/**
	 * 测试删除方法
	 * @param args
	 */
	public void removeClass() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要删除的学生ID");
		while (true) {
			int id = Integer.valueOf(scanner.next());
			Student student = students.get(id);
			if (student == null) {
				System.out.println("要删除的学生不存在,请重新输入学生ID");
			}else {
				System.out.println("这个学生存在可以删除");
				students.remove(id);
				System.out.println("已经成功删除这个学生"+student.getName());
				System.out.println("-----现有的对象：--------");
				break;
			}
		}
	}
	
	/**
	 * 修改对象
	 * @param args
	 */
	public void testChange () {
		System.out.println("输入你想修改的学生ID");
		Scanner scanner = new Scanner(System.in);
		int id = Integer.valueOf(scanner.next());
		Student student = students.get(id);
		if (student == null) {
			System.out.println("你要修改的学生不存在");
		}else {
			System.out.println("这个学生是存在的可以修改，请输入你要改成的名字");
			String name = scanner.next();
			student.setName(name);
			System.out.println("----看一下现在还有哪些东西:-----");
		}
	}

	public static void main(String[] args) {
		MapTest mapTest = new MapTest();
		mapTest.testPut();
		mapTest.testkeySet();
		mapTest.removeClass();
		mapTest.testkeySet();
		mapTest.testChange();
		mapTest.testkeySet();
	}

	
}
