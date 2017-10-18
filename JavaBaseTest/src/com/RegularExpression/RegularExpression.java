package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args){
//		demo();
		
//		checkQQ("123a454");
		
		patternTest("ming tian jiu yao fang jia le ,da jia¡£");
	}
	
	public static void patternTest(String str){
		String regex = "\\b[a-z]{4}\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.start() + "........" + m.end());
		}
	}
	
	
	public static void demo(){
		String str = "b23a23456789";
		String regex = "[a-zA-Z]//d*";
		
		boolean b = str.matches(regex);
		System.out.println(b);
	}
	
	public static void checkQQ(String qqNum){
		
		String regex = "[1-9]\\d{4,14}";
		boolean b = qqNum.matches(regex);
		
		if(b){
			System.out.println("qq success");
		}else{
			System.out.println("qq error");
		}
	}
	
}
