package com.InitTest.main;

import com.InitTest.com.C1;
import com.InitTest.com.Tree;

public class Main {
	public static void main(String[] args) {
		//演示构建器
		for (int i = 0; i < 10; i++) {
			new C1();
		}
		//演示方法过载
		Tree tree1 = new Tree();
		Tree tree2 = new Tree("梨树",12);
		tree1.sayTreeHeight();
		tree2.sayTreeHeight();
	}
}
