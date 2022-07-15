// 문자, 문자열 리터럴, 문자열 결합

package com.choics.lang.ch02;

public class Exam0005 {
	public static void main(String[] args) {

	  String s1 = "A";
		String s2 = "";

		System.out.println(s1);
		System.out.println(s2);

		int i = 'A'; 
		System.out.println(i); // 65 출력

		//    에러
		//    1) char ch = ''; (빈 문자)
		// 	  2) char ch = 'AB'; (문자열)

		System.out.println("A" + "B"); // "AB" 출력

		System.out.println("" + 7); // "7" 출력
		System.out.println("" + 7 + 7); // "77" 출력
	  System.out.println(7 + 7 + ""); // "14" 출력
	}
}
