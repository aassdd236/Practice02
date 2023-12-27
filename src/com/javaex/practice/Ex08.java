package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해 주세요");
		System.out.print("키: ");
		int height=s.nextInt();
		System.out.print("몸무게: ");
		int weight=s.nextInt();
		double we=(height-100)*0.9;
		if(we<weight) {
			System.out.println("과체중입니다");
		}else if(we==weight) {
			System.out.println("표준입니다");
		}else {
			System.out.println("저체중입니다");
		}
		System.out.println("표준 체중: "+we);
		s.close();

	}

}
