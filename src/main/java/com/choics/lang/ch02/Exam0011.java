// 정수형의 오버플로우

// 최대값 + 1 = > 최소값
// 최소값 - 1 + > 최대값

package com.choics.lang.ch02;

public class Exam0011 {
	public static void main(String[] args) {

		short sMin = -32768, sMax = 32767; // 부호 있는 정수
		char cMin = 0, cMax = 65535;       // 부호 없는 정수

		System.out.println("sMin = " + sMin);
		System.out.println("sMin - 1 = " + (short)(sMin - 1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = " + (short)(sMax + 1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin - 1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax + 1 = " +(int)++cMax);
	}
}
