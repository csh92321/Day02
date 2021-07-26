package day02_variable;

import java.util.Scanner;

public class Qiuz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name ;
		int kor, eng, mat ;
		System.out.print("당신의 이름은 무엇입니까? ");
		name = input.next();
		System.out.print(name + " 님의 국어 점수 : ");
		kor = input.nextInt();
		System.out.print(name + " 님의 영어 점수 : ");
		eng = input.nextInt();
		System.out.print(name + " 님의 수학 점수 : ");
		mat = input.nextInt();
		System.out.println();
		
		
		System.out.println("=============");
		System.out.println("이름 : " + name);
		System.out.println("=============");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("=============");
		System.out.println("합계 : " + (kor+eng+mat));
		System.out.println("=============");
				
		
	}

}
