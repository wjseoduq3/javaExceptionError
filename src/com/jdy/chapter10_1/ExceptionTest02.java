package com.jdy.chapter10_1;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwTest(10, 0);
		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
			System.out.println("0나누기 에러 발생");
		}
		
		

	}
	
	public static void throwTest(int a, int b) throws ArithmeticException {
		System.out.println(a/b);
	}
}
