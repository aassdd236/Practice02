package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이: ");
		int age=s.nextInt();
		
		if(age>=0&&age<=7) {
			System.out.println("취학전아동/무료입니다");
		}else if(age>=8&&13>=age) {
			System.out.println("초등학생/2000원입니다");
		}else if(age>=14&&age<=16) {
			System.out.println("중학생/3000원입니다");
		}else if(age>=17&&age<=19) {
			System.out.println("고등학생/4000원입니다");
		}else {
			System.out.println("성인/5000원입니다");
		}
	}

}
