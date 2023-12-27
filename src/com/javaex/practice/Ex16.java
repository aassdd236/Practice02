package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num=s.nextInt();
		double result;
		
		if(num<=0) {
			result=num*num*num-num*9+2;
		}else {
			result=num*7+2;
		}
		
		System.out.println("계산 결과는 "+result+"입니다");

		s.close();
	}

}
