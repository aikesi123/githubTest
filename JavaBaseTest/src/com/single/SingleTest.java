package com.single;

public class SingleTest {
	
	private SingleTest(){}
	private static SingleTest single = null;
	public SingleTest getInstance(){
		if(single == null){
			synchronized (SingleTest.class) {
				if(single == null){
					single = new SingleTest();
				}
			}
		}
		return single;
	}
	
	public static void main(String[] args){
		
	}
	
	
	public static SingleTest singleTest01(){
		if(single == null){
			synchronized(single.getClass()){
				if(single == null){
					single = new SingleTest();
				}
			}
		}
		return single;
	}
	
	
}
