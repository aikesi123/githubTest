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
	
/*	1. ������� 20 ������(10���ڵ�)������һ��ArrayList�У� �õ������������ArrayList 
	2. ��ɾ������Ϊ 5 ����  
	3. �ٲ��� 3 �����������뵽λ�� 4 �� 
	4. ������ֵΪ 1 ��������� 10 */
	public static void arrayListTest(){// ��Ԫ�ص�add��remove��set��iterator����
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
	
	
	
//	�ж���������Ƿ�������  ����100��0-999֮������������Ȼ���ж���100�����������Щ����������Щ���ǣ�
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
		
		
		// ��ȡ������
		
	}
	
//	Լ���ɱ�˷�:   �ѷ���Χ��һȦ��ÿ�δӹ̶�λ�ÿ�ʼ����ɱ����7���ˣ�ֱ��ʣ�����һ��
	public static void assassinatePeople(){
		
	}
	
	
	
	
	/*����һ��20*5�Ķ�ά���飬�����洢ĳ�༶20λѧԱ��5�ſεĳɼ���
	��5�ſ�    ���洢˳������Ϊ��core C++��coreJava��Servlet��JSP��EJB��    
		��1��ѭ������ά�����ÿһ��Ԫ�ظ�0~100֮������������  
		��2�������б�ķ�ʽ�����ЩѧԱ��ÿ�ſγ̵ĳɼ���     
		��3��Ҫ���д������ÿ��ѧԱ���ܷ֣����䱣��������һ��һά�����С�   
		��4��Ҫ���д����������ѧԱ��ĳ�ſγ̵�ƽ���֡�*/
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
			System.out.println("��" + (i+1) + "��ͬѧ�ɼ�Ϊ : " + sums[i]);
		}
	}
	
	
	
	/*����һ��int�͵�һά���飬����40��Ԫ�أ������洢ÿ��ѧԱ�ĳɼ���ѭ������40��0~100֮������������
	�����Ǵ洢��һά�����У�Ȼ��ͳ�Ƴɼ�����ƽ���ֵ�ѧԱ�������������������*/
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
	
	
	
	/*����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�һЩ���������
	Ȼ���������Ԫ�ص����ֵ��  ��Сֵ��ƽ��ֵ����ֵ�����������*/
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
	
	/*����Ļ�ϴ�ӡ��n�еĽ�����ͼ�����磬��n=5,��ͼ�����£�         
			*        
		   ***       
	      *****      
	     *******     
	    *********
	*/
	public static void printPyramid(int num){
		
		for(int i = 1;i <= num; ++i){// �д���
			for(int k = 0; k < num - i; ++k){ // �д���
				System.out.print(" ");
			}
			for(int j = 0;j < 2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	����Բ����   PI��4��4/3+4/5-4/7.......    ��ӡ����һ������ 3.1415С�� 3.1416��ֵ
	public static void calculatePI(){// ����������Ĺ�ϵ��һ������������ı仯����ʹ��һ���洢��Ԫ
		
		double PI = 0;
		double fenMu = 1;
		double fenZi = 4;
		while(!(PI > 3.1415 && PI < 3.1416)){// ��������"+-"�ı仯:*(-1)
			PI += (fenZi / fenMu);
			fenZi = fenZi * (-1.0);
			fenMu += 2;
			
			System.out.println(PI + "fenzi:" + fenZi + "fenMu:" + fenMu);
		}
		
		System.out.println("end : " + PI);
	}
	
	
	
	/*���ó����������ͼ��:    
		*    
		* * *   
		* * * * *    
		* * * * * * *    
		* * * * *   
		* * * 
		*
	*/
	public static void outPutImg(){ // for �е�����ȷ���ظ��Ĵ���
		
		for(int i = 1; i <= 13; i += 2){ // ȷ��Ҫ��ʾ������
			for(int j = 1; j <= i && j + i <= 14; ++j){ // ÿ����ʾ�ĸ���
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
		
	/*��  a+aa+aaa+.......+aaaaaaaaa=?        
	����aΪ1��9֮�е�һ����������ҲҪ����ָ��*/
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
			System.out.println("�������ݲ��Ϸ�");
		}
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			return true;
		}
		
		return false;
	}
	
	
}
