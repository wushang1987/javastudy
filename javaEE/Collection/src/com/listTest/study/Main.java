package com.listTest.study;

public class Main {
	public static void main(String[] args) {

		ListTest kk = new ListTest();
		kk.testAdd();
		kk.testGet();
		kk.testIterator();
		kk.testForeach();

		// 测试修改
		kk.testModify();
		kk.testForeach();

		// 测试删除id
		kk.testRemove();
		kk.testForeach();

		// 测试删除对象
		kk.testRemoveObj();
		kk.testForeach();

		// 测试删除所有
		kk.testRemoveAllObj();
		kk.testForeach();

		// 测试删除所有
		kk.testRemoveAll();
		kk.testForeach();

		// kk.testType();
	}
}
