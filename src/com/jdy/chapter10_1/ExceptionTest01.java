package com.jdy.chapter10_1;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//			int a = 10;
//			int sum = a / 0;
//			
//			System.out.println(sum);
//			
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("0나누기 에러발생");
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//			System.out.println("Null값을 가르키는 에러발생");
//		}
		
		try {
			int a = 10;
			int sum = a / 0;
			
			System.out.println(sum);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러발생");
			e.printStackTrace();  // error code를 console창에 출력
		} finally {
			System.out.println("DB와 연결된 connection을 닫아주는 코드 입력해야함");
			// 에러와 상관없이 실행됨.
		}
	}

}
