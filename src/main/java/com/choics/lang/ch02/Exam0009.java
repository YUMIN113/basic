// printf를 이용한 출력
// printf( format , argument )

package com.choics.lang.ch02;

public class Exam0009 {
	public static void main(String[] args) {

//  1) println() 단점 1.
		System.out.println(10.0/3); // 3.33333... 으로 출력 , 실수의 자리수 조절 불가

//  2) println() 단점 2.
    System.out.println(0x1A); // 26 출력 , 10진수로만 출력됨
		
//  printf()로 출력형식 지정 가능
    System.out.printf("%.2f\n", 10.0/3); // 3.33 출력 , 의미 : 소수점 둘째자리까지 출력

		System.out.printf("%d\n", 0x1A); // 26 출력 , 의미 : 10진수로 출력
		System.out.printf("%x\n", 0x1A); // 1A 출력 , 의미 : 16진수로 출력

// 지시자
//  1) %b : boolean
//  2) %d : decimal 
//  3) %o : octal
//  4) %x , %X : hexa-decimal
//  5) %f : floating-point
//  6) %e , %E : exponent
//  7) %c : character
//  8) %s : string

	  System.out.printf("age : %d  year : %d\n", 14, 2017); // \n or %n : 개행문자

		System.out.printf("%d\n", 15);  // 15 출력
		System.out.printf("%o\n", 15); // 17 출력 
		System.out.printf("%x\n", 15); // f 출력
		System.out.printf("%s\n", Integer.toBinaryString(15)); // 1111 출력, 2진수 표현 방법(문자열)

// 8진수와 16진수에 접두사 붙이기
// - %o, %x 형식을 사용하면 접두사는 출력되지 않는다.
// - # 붙이면 접두사도 함께 출력된다.
    System.out.printf("%#o\n", 15); // 017 출력
		System.out.printf("%#x\n", 15); // 0xf 출력
		System.out.printf("%#X\n", 15); // 0Xf 출력

    float f = 123.4567890f;
		System.out.printf("%f\n", f); // 123.456787 출력 , 정밀도로 7자리수까지만 정확하고 87은 의미없는 수
		System.out.printf("%e\n", f); // 1.234568e+02 출력

// %g는 간략한 형식으로 출력
		System.out.printf("%g\n", 123.456789); // 123.457 출력 , 소수점 포함 7자리 출력
		System.out.printf("%g\n", 0.00000001); // 1.00000e-08

    System.out.printf("%5d\n", 10); // [   10] 출력 , 3개의 빈칸 생성
		System.out.printf("%5d\n", 1234567); // [1234567] 출력 , 지정한 수보다 큰 수일 경우 값을 버리진 않는다.
		System.out.printf("%-5d\n", 10); // [10   ] 출력 , 3개의 빈칸 생성
		System.out.printf("%05d\n", 10); // [00010] 출력

// %전체자리.소수점아래자리f
    System.out.printf("%14.10f\n", 1.23456789); // [  1.2345678900] 출력 , 
		                                                            // 소수점 위의 빈자리는 공백 , 소수점 아래 빈자리 0으로 채움

		String str = "www.codechobo.com";
		System.out.printf("[%s]\n", str); // [www.codechobo.com] 출력
		System.out.printf("[%20s]\n", str); // [   www.codechobo.com] 출력
		System.out.printf("[%-20s]\n", str); // [www.codechobo.com   ] 출력
		System.out.printf("[%.8s]\n", str); // [www.code] 출력 , ' .8 ' 의미 : 8자리만 출력																														
 	}
}
