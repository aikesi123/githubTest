package com.createFiledir;

import java.io.File;

public class MakeFileDir {

	public static void main(String[] args){
//		mkDir();
		
	}

	
	
	
	private static void mkDir() {
		File file = new File("D:\\BaiduYunDownload\\java\\黑马32期\\e3商城\\代码");
		
//		if(file.isDirectory()){
//			boolean flag = file.delete();
//			System.out.println("delete ok!" + flag);
//		}
		
		
		
		for(int i = 1; i <= 14; ++i){
			String path = file.getAbsolutePath();
			
			System.out.println(path);
			
			path = path + "\\" + i;
			
			System.out.println(path);
			
			File destFile = new File(path);
			destFile.mkdir();
		}
	}
	
	
	
	
}
