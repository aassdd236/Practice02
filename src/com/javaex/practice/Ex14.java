package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("사번(정수)를 입력해 주세요");
		System.out.print("사번: ");
		int num=s.nextInt();

		if(num>=0){
			if(num%3==0) {
				System.out.println("A팁입니다");
			}else if(num%3==1) {
				System.out.println("B팁입니다");
			}else {
				System.out.println("c팀입니다");
			}
		}else {
			System.out.println("잘못 입력하셨습니다");
		}

		s.close();

	}

}
