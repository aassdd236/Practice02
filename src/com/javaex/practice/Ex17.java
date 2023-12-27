package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		int pro=s.nextInt();
		double tax=0;

		if(pro<0) {
				System.out.println("잘못 입력했습니다");
		}else {
			if(pro>=0&&pro<=1000) {
				tax=0.09*pro;
			}else if(pro>1000&&pro<=4000) {
				tax=1000*0.09+0.18*(pro-1000);
			}else if(pro>4000&&pro<8000) {
				tax=1000*0.09+3000*0.18+0.27*(pro-4000);
			}else if(pro>=8000) {
				tax=1000*0.09+3000*0.18+4000*0.27+0.36*(pro-8000);
			}

			System.out.println("소득세는 "+tax+"입니다.");
		}

		s.close();

	}

}
