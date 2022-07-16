// 두 변수의 값 교환하기

package com.choics.lang.ch02;

public class Exam0006 {
  public static void main(String[] args) {

		int x = 4 , y = 2;
    int tmp;

		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
