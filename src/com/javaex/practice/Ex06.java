package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이: ");
		int age=s.nextInt();
		
		if(age>=19&&age<65) {
			System.out.println("1번 그룹입니다");
		}else {
			System.out.println("2번 그룹입니다");
		}
		
		s.close();
	}

}
