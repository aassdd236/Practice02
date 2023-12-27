package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int birth=s.nextInt();
		int age=2023-birth;
		System.out.println("올해: 2023 \n태어난해: "+birth+"\n나이: "+age);
		System.out.println("========================================");

		if(age<20) {
			System.out.println("20살미만 건강검진 대상이 아님");
		}else {
			switch(age%2){
			case 1:
				System.out.println("20살이상 \n건강검진해 아님");
				break;
			case 0:
				if(age>=40) {
					System.out.println("20살이상 \n건강검진해 \n암 검사");
				}else {
					System.out.println("20살이상 \n건강검진해 \n암 검사X");
				}
			}
		}
		s.close();
	}

}
