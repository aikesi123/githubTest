package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo100 {

	public static void main(String[] args){
		
		
//		System.out.println(isLeapYear(2100));
		
		sum();
		
//		sumAny(1, 2);
		
//		outPutImg();
		
//		calculatePI();
		
//		printPyramid(5);
		
//		calculateArray();
		
//		statisticScoreUnderAverage();
		
//		statisticScoreForStudent();
		
//		primeNumber();
		
//		arrayListTest();
		
		
		
	}
	
/*	1. 随机产生 20 个整数(10以内的)，放入一个ArrayList中， 用迭代器遍历这个ArrayList 
	2. 并删除其中为 5 的数  
	3. 再产生 3 个整数，插入到位置 4 处 
	4. 把所有值为 1 的数都变成 10 */
	public static void arrayListTest(){// 对元素的add，remove，set由iterator操作
		ArrayList<Integer> numArray = new ArrayList<>();
		for(int i = 0; i < 10; ++i){
			int num = (int) (Math.random() * 10);
			numArray.add(Integer.valueOf(num));
			
			System.out.println(num);
		}
		
		System.out.println("--------");
		ListIterator<Integer> iterator = numArray.listIterator();
		while(iterator.hasNext()){
			int num = iterator.next();
			if(num == 5){
				iterator.remove();
			}
			
		}
		
		ListIterator<Integer> iteratora = numArray.listIterator();
		while(iteratora.hasNext()){
			System.out.println(iteratora.next());
		}
	}
	
	
	
//	判断随机整数是否是素数  产生100个0-999之间的随机整数，然后判断这100个随机整数哪些是素数，哪些不是？
	public static void primeNumber(){
		int[] primes = new int[100];
		for(int i = 0; i < 100; ++i){
			int prime = (int) (Math.random() * 1000);
			primes[i] = prime;
			System.out.print(prime + "\t");
			if((i+1) % 10 == 0){
				System.out.println();
			}
		}
		
		
		// 提取方法：
		
	}
	
//	约梭芬杀人法:   把犯人围成一圈，每次从固定位置开始算起，杀掉第7个人，直到剩下最后一个
	public static void assassinatePeople(){
		
	}
	
	
	
	
	/*定义一个20*5的二维数组，用来存储某班级20位学员的5门课的成绩；
	这5门课    按存储顺序依次为：core C++，coreJava，Servlet，JSP和EJB。    
		（1）循环给二维数组的每一个元素赋0~100之间的随机整数。  
		（2）按照列表的方式输出这些学员的每门课程的成绩。     
		（3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。   
		（4）要求编写程序求所有学员的某门课程的平均分。*/
	public static void statisticScoreForStudent(){
		int[][] marks = new int[20][5];
		for(int i = 0; i < 20; ++i){
			for(int j = 0; j < 5; ++j){
				int score = (int) (Math.random() * 100);
				marks[i][j] = score;
				System.out.print(score + " \t");
			}
			System.out.println();
		}
		
		int[] sums = new int[20];
		int sum = 0;
		for(int i = 0; i < 20; ++i){
			for(int j = 0; j < 5; ++j){
				sum += marks[i][j];
			}
			sums[i] = sum;
			sum = 0;
			System.out.println("第" + (i+1) + "个同学成绩为 : " + sums[i]);
		}
	}
	
	
	
	/*定义一个int型的一维数组，包含40个元素，用来存储每个学员的成绩，循环产生40个0~100之间的随机整数，
	将它们存储到一维数组中，然后统计成绩低于平均分的学员的人数，并输出出来。*/
	public static void statisticScoreUnderAverage(){
		int[] scores = new int[40];
		double sum = 0.0;
		double average = 0.0;
		
		ArrayList<Integer> smallScore = new ArrayList<>();
		
		for(int i = 0;i < scores.length; ++i){
			int score = (int) (Math.random() * 100);
			scores[i] = score;
			sum += score;
			System.out.println("i:" + i + ": " + score);
		}
		
		average = sum / scores.length;
		
		System.out.println("------average : -------" + average);
		
		for(int j = 0; j < scores.length; ++j){
			if(average - scores[j] > 0){
//				smallScore.add(scores[j]);
				System.out.println(scores[j]);
			}
		}
		
		
	}
	
	
	
	/*定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
	然后求出所有元素的最大值，  最小值，平均值，和值，并输出出来*/
	public static void calculateArray(){
		int[] numArray = new int[10];
		for(int i = 0;i < 10; ++i){
			int randonNum = (int) (Math.random() * 100);
			numArray[i] = randonNum;
			System.out.println(numArray[i]);
		}
		
		int max = numArray[0];
		int min = numArray[0];
		double average = 0;
		double sum = 0;
		for(int i = 0; i < numArray.length;++i){
			if((i+1) < numArray.length){
				if((numArray[i+1] - max) > 0){
					max = numArray[i+1];
				}
				if((numArray[i+1] - min) < 0){
					min = numArray[i+1];
				}
			}
			
			sum += numArray[i];
		}
		
		average = sum/numArray.length;
		
		System.out.println("max : " + max + " \n min:" + min 
				+ "\n sum : " + sum + "\n average : " + average);
	}
	
	/*在屏幕上打印出n行的金字塔图案，如，若n=5,则图案如下：         
			*        
		   ***       
	      *****      
	     *******     
	    *********
	*/
	public static void printPyramid(int num){
		
		for(int i = 1;i <= num; ++i){// 行处理
			for(int k = 0; k < num - i; ++k){ // 列处理
				System.out.print(" ");
			}
			for(int j = 0;j < 2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	计算圆周率   PI＝4－4/3+4/5-4/7.......    打印出第一个大于 3.1415小于 3.1416的值
	public static void calculatePI(){// 常量与变量的关系：一个量有相关连的变化可以使用一个存储单元
		
		double PI = 0;
		double fenMu = 1;
		double fenZi = 4;
		while(!(PI > 3.1415 && PI < 3.1416)){// 数字类型"+-"的变化:*(-1)
			PI += (fenZi / fenMu);
			fenZi = fenZi * (-1.0);
			fenMu += 2;
			
			System.out.println(PI + "fenzi:" + fenZi + "fenMu:" + fenMu);
		}
		
		System.out.println("end : " + PI);
	}
	
	
	
	/*利用程序输出如下图形:    
		*    
		* * *   
		* * * * *    
		* * * * * * *    
		* * * * *   
		* * * 
		*
	*/
	public static void outPutImg(){ // for 中的条件确定重复的次数
		
		for(int i = 1; i <= 13; i += 2){ // 确定要显示的行数
			for(int j = 1; j <= i && j + i <= 14; ++j){ // 每行显示的个数
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
		
	/*求  a+aa+aaa+.......+aaaaaaaaa=?        
	其中a为1至9之中的一个数，项数也要可以指定*/
	public static void sumAny(int a,int b){
		
		int sum = 0;
		
		int al = a;
		for(int i = 0;i < b;++i){
			sum += a;
			a = a * 10 + al;
		}
		
		System.out.println("sum : " + sum);
	}
	
	
	
	
	public static void sum(){
		int sum = 0;
		for(int i = 0;i <= 100; ++i){
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
	
	
	public static boolean isLeapYear(int year){
		
		if(year > 0 && year < 3000){
			System.out.println("输入的年份不合法");
		}
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			return true;
		}
		
		return false;
	}
	
	
}
