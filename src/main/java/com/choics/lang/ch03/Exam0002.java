// 증감 연산자
// 1) 증가 연산자 : (++) , 피연산자의 값을 1 증가시킨다.
// 2) 감소 연산자 : (--) , 피연산자의 값을 1 감소시킨다.

// 증가 연산자
// 전위형 : j = ++i; (값이 참조되기 전에 증가시킨다.) 
// 후위형 : j = i++; (값이 참조된 후에 증가시킨다.)

// 전위형과 후위형의 차이
// ++i; , i++; 처럼 독립적으로 사용된 경우, 전위형과 후위형의 차이가 없다.
// j = ++i; , j = i++; 일 경우, 차이 발생 한다.

// 부호 연산자
// '-'는 피연산자의 부호를 반대로 변경
// '+'는 아무런 일도 하지 않는다. (실제 사용X)

package com.choics.lang.ch03;

public class Exam0002 {
  public static void main(String[] args) {

		int i = 5, j = 0;

		// 후위형
		// j = i;
		// i++;
		j = i++; 
		System.out.println("j=i++ 실행 후, i = " + i + " , j = " + j); // i = 6 , j = 5

		i = 5;  // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j = 0;

		// 전위형
		// ++i;
		// j = i;
		j = ++i;
		System.out.println("j=++i 실행 후, i = " + i + " , j = " + j); // i = 6 , j = 6

		// 부호 연산자
		int a = -10;
		    a = +a;

    System.out.println(a); // -10 출력

		a = -10;
		a = -a;
		
		System.out.println(a); // 10 출력

 	}	
}
