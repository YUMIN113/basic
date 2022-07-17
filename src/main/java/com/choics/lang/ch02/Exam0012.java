// 타입간의 변환방법

// 1) 문자와 숫자간의 변환
//    - 숫자 + '0' = '숫자' (숫자가 문자로 변환)
//    - '숫자' - '0' = 숫자 (문자에서 숫자로 변환)

// 2) 문자열로의 변환
//    - 숫자 + "" = "숫자" (숫자가 문자열로 변환)
//    - '숫자' + "" = "숫자" (문자가 문자열로 변환)

// 3) 문자열을 숫자로 변환
//    예시) - Integer.parseInt("3") => 숫자 3으로 변환
//          - Double.parseDouble("3.4") => 숫자 3.4로 변환

// 4) 문자열을 문자로 변환
//    예시) "3" -> '3'
//    - "3".charAt(0) => 문자 3으로 변환

package com.choics.lang.ch02;

public class Exam0012 {
	public static void main(String[] args) {

		String str = "3";

		System.out.println('3' - '0'); // 숫자 3 출력
		System.out.println('3' - '0' + 1); // 숫자 4 출력
		System.out.println(Integer.parseInt("3") + 1); // 숫자 4 출력
		System.out.println("3" + 1); // 문자열 "31" 출력
		System.out.println(3 + '0'); // 문자 '51' 출력 , 형변환 하지 않으면 '0' = 숫자로 48이라 3+48이 되어 51 출력됨
		System.out.println((char)(3 + '0')); // 문자'3' 출력 (형변환)
		System.out.println(str.charAt(0) - '0'); // 숫자 3 출력
	}
}
