package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("숫자 2개를 입력해 주세요");
		System.out.print("숫자1: ");
		int num1=s.nextInt();
		System.out.print("숫자2: ");
		int num2=s.nextInt();
		
		if(num1>num2) {
			System.out.println("큰수: "+num1+"\t 작은수: "+num2+"입니다");
		}else if(num1<num2) {
			System.out.println("큰수: "+num2+"\t 작은수: "+num1+"입니다");
		}else {
			System.out.println("큰수: "+num2+"\t 작은수: "+num1+"입니다");
		}
		
		
		
		s.close();

	}

}
