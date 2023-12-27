package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int a=s.nextInt();
		System.out.print("두번째 숫자: ");
		int b=s.nextInt();
		
		if(a>b) {
			System.out.println("몫: "+a/b);
			System.out.println("나머지: "+a%b);
		}else {
			System.out.println("몫: "+b/a);
			System.out.println("나머지: "+b%a);	
		}
		s.close();

	}

}
