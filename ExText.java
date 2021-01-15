package com.ex.ex1;

import java.util.Scanner;

public class ExText {
	
	public static void main(String[] args) {
//		각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
//	 	- 정수형 100(int),10000(long), 실수 234.567(float), 567.12356 (double)   
//	      문자 A(char), 문자열 Hello world(String), 논리 true(boolean)
		
		int num1 = 100;
		long num2 = 10000L;
		float num3 = 234.567f;
		double num4 = 567.12356;
		char text1 = 'A';
		String text2 = "Hello world";
		boolean tf = true;
		System.out.println(""+num1+num2+num3+num4+text1+text2+tf);
		
	}
	
	public void ex01() {
//		자신의 신상정보를 저장할 변수를 만들고 정보를 변수에 대입, 출력하는 프로그램을 작성하세요.
//		 - 이름, 나이, 성별, 주소, 전화번호, 이메일
//		작성한 변수를 활용해 옆 친구의 신상정보를 다시 변수에 대입 출력하는 프로그램으로 수정하세요.
		 Scanner sc = new Scanner(System.in);
		 System.out.println("=== 신상정보 입력 프로그램 ===");
		 System.out.println("이름을 입력하세요.");
		 String name = sc.next();
		 System.out.println("나이를 입력하세요.");
		 int age = sc.nextInt();
		 System.out.println("성별을 입력하세요.");
		 String gender = sc.next();
		 sc.nextLine();
		 System.out.println("주소를 입력하세요.");
		 String addr = sc.nextLine();
		 System.out.println("전화번호를 입력하세요.");
		 String phone = sc.next();
		 System.out.println("이메일을 입력하세요.");
		 String email = sc.next();
		 System.out.println(name+", "+age+", "+gender+", "+addr+", "+phone+", "+email);
		  
	}

	public void ex02() {
//		자신의 이름(String), 나이(int), 주소(String), 키(double), 몸무게(double), 성별(char)을
//		입력받고 출력하는 프로그램을 작성하세요.
//		  *몸무게는 첫째자리까지 출력, 키는 정수로 변환하여 출력
		 Scanner sc = new Scanner(System.in);
		 System.out.println("이름을 입력하세요.");
		 String name = sc.next();
		 System.out.println("나이를 입력하세요.");
		 int age = sc.nextInt();
		 sc.nextLine();
		 System.out.println("주소를 입력하세요.");
		 String addr = sc.nextLine();
		 System.out.println("키를 입력하세요.");
		 double height = sc.nextDouble();
		 System.out.println("몸무게를 입력하세요.");
		 double weight = sc.nextDouble();
		 System.out.println("성별을 입력하세요.");
		 char gender = sc.next().charAt(0);
		 System.out.printf("이름: %s, 나이: %d, 주소: %s, 키: %d, 몸무게: %.1f, 성별: %c",name, age, addr, (int)height, weight, gender);
		
	}
	
}
