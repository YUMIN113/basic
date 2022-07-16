// 화면으로부터 입력받기 - Scanner
// - Scanner is Class
// - import : import java.util.*;
// Scanner는 객체를 생성해야 함 : Scanner scanner = new Scanner(System.in)
// int num = scanner.nextInt(); ==> 화면에서 입력받은 정수를 num에 저장
// String input = scanner.nextLine() ==> 화면에서 입력받은 내용을 input에 저장
// int num = Integer.parseInt(input) ==> input의 문자열을 정수로 변환하여 num에 저장 

package com.choics.lang.ch02;

public class Exam0010 {
  public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int num = scanner.nextInt();
		System.out.println(num);

		String input = scanner.nextLine();
		int i = Integer.parseInt(input); // 위 두 문장을 합치면 int num = scanner.nextInt(); 이다.
		System.out.println(i);
	}	
}
