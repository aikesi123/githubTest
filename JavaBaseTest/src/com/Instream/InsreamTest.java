package com.Instream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class InsreamTest {

	public static void main(String[] args){
		index4Str();
	}
	
	
	public static void index4Str(){
		String str = "abcsa;dlkj;f";
		int flag = str.indexOf(";", 8);
		
		System.out.println(flag);
		
	}
	
	public static void readFileInfo(File fileChild2) throws Exception{
		
		File file = new File(fileChild2.getName());
		
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for (File fileChild : files) {
				readFileInfo(fileChild);
			}
		}else if(file.isFile()) {
			FileReader fileReader = new FileReader(file);
			FileOutputStream fileOut = new FileOutputStream(file);
			
			int len = 0;
			byte[] writeBuf = new byte[1024];
			while((len = fileReader.read()) != -1){
				
				
//				fileOut.write(writeBuf, 0, len);
			}
		}
		
	}
	
	public static void compareStrFromFile(File file) throws Exception{
		FileInputStream fileIn = new FileInputStream(file);
		
		
	}
	
	
}
