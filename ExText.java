package com.ex.ex1;

import java.util.Scanner;

public class ExText {
	
	public static void main(String[] args) {
//		�� �ڷ����� ������ ����� �ʱ�ȭ�� �� �� ���� ����ϴ� �ڵ带 �ۼ��� ����.
//	 	- ������ 100(int),10000(long), �Ǽ� 234.567(float), 567.12356 (double)   
//	      ���� A(char), ���ڿ� Hello world(String), �� true(boolean)
		
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
//		�ڽ��� �Ż������� ������ ������ ����� ������ ������ ����, ����ϴ� ���α׷��� �ۼ��ϼ���.
//		 - �̸�, ����, ����, �ּ�, ��ȭ��ȣ, �̸���
//		�ۼ��� ������ Ȱ���� �� ģ���� �Ż������� �ٽ� ������ ���� ����ϴ� ���α׷����� �����ϼ���.
		 Scanner sc = new Scanner(System.in);
		 System.out.println("=== �Ż����� �Է� ���α׷� ===");
		 System.out.println("�̸��� �Է��ϼ���.");
		 String name = sc.next();
		 System.out.println("���̸� �Է��ϼ���.");
		 int age = sc.nextInt();
		 System.out.println("������ �Է��ϼ���.");
		 String gender = sc.next();
		 sc.nextLine();
		 System.out.println("�ּҸ� �Է��ϼ���.");
		 String addr = sc.nextLine();
		 System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
		 String phone = sc.next();
		 System.out.println("�̸����� �Է��ϼ���.");
		 String email = sc.next();
		 System.out.println(name+", "+age+", "+gender+", "+addr+", "+phone+", "+email);
		  
	}

	public void ex02() {
//		�ڽ��� �̸�(String), ����(int), �ּ�(String), Ű(double), ������(double), ����(char)��
//		�Է¹ް� ����ϴ� ���α׷��� �ۼ��ϼ���.
//		  *�����Դ� ù°�ڸ����� ���, Ű�� ������ ��ȯ�Ͽ� ���
		 Scanner sc = new Scanner(System.in);
		 System.out.println("�̸��� �Է��ϼ���.");
		 String name = sc.next();
		 System.out.println("���̸� �Է��ϼ���.");
		 int age = sc.nextInt();
		 sc.nextLine();
		 System.out.println("�ּҸ� �Է��ϼ���.");
		 String addr = sc.nextLine();
		 System.out.println("Ű�� �Է��ϼ���.");
		 double height = sc.nextDouble();
		 System.out.println("�����Ը� �Է��ϼ���.");
		 double weight = sc.nextDouble();
		 System.out.println("������ �Է��ϼ���.");
		 char gender = sc.next().charAt(0);
		 System.out.printf("�̸�: %s, ����: %d, �ּ�: %s, Ű: %d, ������: %.1f, ����: %c",name, age, addr, (int)height, weight, gender);
		
	}
	
}
