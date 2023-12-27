package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String op=s.next();
		System.out.print("숫자1: ");
		int a=s.nextInt();
		System.out.print("숫자2: ");
		int b=s.nextInt();

		switch(op){
		case "+":
			System.out.println("결과는 "+(double)(a+b));
			break;
		case "-":
			System.out.println("결과는 "+(double)(a-b));
			break;
		case "*":
			System.out.println("결과는 "+(double)(a*b));
			break;
		case "/":
			if(b!=0) {
				System.out.println("결과는 "+((double)a/b));
			}else {
				System.out.println("계산할 수 없습니다");
			}
			break;
		default:
			System.out.println("계산할 수 없는 기호입니다");
			break;
		}
		
		s.close();

	}

}
