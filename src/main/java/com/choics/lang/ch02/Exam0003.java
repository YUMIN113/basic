// 변수, 상수, 리터럴

package com.choics.lang.ch02;

public class Exam0003 {
  public static void main(String[] args) {
    
    int score = 100;
        score = 200;

    System.out.println(score);

    final int x = 100;
           // x = 200;  다른 값을 저장하려고 하면 에러 발생

    System.out.println(x);

              
  }
  
}

/* 상수(constant) : 한 번만 값을 저장 가능한 변수
   
   final int MAX = 100; // final : 상수 선언
             MAX = 200; // 에러                 */
   