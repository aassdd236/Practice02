package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("숫자 3개를 입력해 주세요");
		System.out.print("숫자1: ");
		int a=s.nextInt();
		System.out.print("숫자2: ");
		int b=s.nextInt();
		System.out.print("숫자3: ");
		int c=s.nextInt();

		if(a>b&&a>c) {
			System.out.println("가장 큰수는 "+a+"입니다.");
		}else {
			if(b>c) {
				System.out.println("가장 큰수는 "+b+"입니다.");
			}else {
				System.out.println("가장 큰수는 "+c+"입니다.");
			}
		}

		s.close();
	}

}
