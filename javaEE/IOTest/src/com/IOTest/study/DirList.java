package com.IOTest.study;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 这个程序会检查一个特定目录下面的所有文件
 * 没有看的太明白的一个方法
 * @author WWD
 *
 */
public class DirList {
	public static void main(String[] args) {
		try {
			File path = new File("c:/");
			String[] list;
			if (args.length == 0)
				list = path.list();
			else
				list = path.list(new DirFilter(args[0]));
			
			//输出文件名
			for (int i = 0; i < list.length; i++)
				System.out.println(list[i]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * 
 * @author WWD
 *
 */
class DirFilter implements FilenameFilter {
	String afn;

	DirFilter(String afn) {
		this.afn = afn;
	}

	public boolean accept(File dir, String name) {
		// Strip path information:
		String f = new File(name).getName();
		return f.indexOf(afn) != -1;
	}
}
