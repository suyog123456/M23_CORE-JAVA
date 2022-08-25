package com.cg.lambdaexp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterlambda {

	public static void main(String[] args) {
		FileFilter filter=(File pathname) ->pathname.getName().endsWith(".pdf");
		File dir=new File("D:\\Documents");
		File contents[]=dir.listFiles(filter);
		//enhanced for loop
		/*if any particular extension file is open on your system then
		 *  you will get that in two times with one file will in $ sign*/
		for(File i:contents) {
			System.out.println(i);
		}

	}

}