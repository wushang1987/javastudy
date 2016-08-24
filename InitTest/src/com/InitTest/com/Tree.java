package com.InitTest.com;

import java.util.jar.Attributes.Name;

/**
 * 演示一下方法过载
 * @author WWD
 *
 */
public class Tree {
	int height;
	String treeName;
	
	public void sayTreeHeight() {
		System.out.println(treeName+"树有多高："+height);
	}

	public Tree() {
		treeName = "苹果树";
		height = 10;
	}

	public Tree(int i) {
		height = i;
	}
	
	public Tree(String name,int i) {
		height = i;
		treeName = name;
	}
	

}
