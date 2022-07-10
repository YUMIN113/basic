// 리터럴의 타입과 접미사

package com.choics.lang.ch02;

public class Exam0004 {
  public static void main(String[] args) {

    byte b = 128; 
    System.out.println(b);
    // byte 범위는 -128 ~ 127까지임. 에러. byte 와 short 에는 리터럴이 없기 때문에 int literal 저장 가능. 단, 각 타입 범위 이내에서만 가능

    int oct = 0100; // 8진수
    int hex = 0x100; //16진수
    System.out.println(oct);
    System.out.println(hex);
    // println() 은 십진수로만 표현 됨. 8진수 또는 16진수로 나타내고 싶다면 printf() 사용해야 함.

    long l = 100; // 100에 접미사로 L이 없기 때문에 100은 int이다. int보다 long의 범위가 더 넓기 때문에 int 값이 long에 저장될 수 있다.
    System.out.println(l);

    long a = 10_000_000_000L; // 반드시 접미사로 L 넣어야 함. 100억은 int로 나타낼 수 없기 때문이다.
    System.out.println(a);

    System.out.println(10.); // 10.0 (double)
    System.out.println(.10); // 0.1 (double)
    System.out.println(10f); // 10.0f , 실제 f 가 출력되지는 않음.
    System.out.println(1e3); // 1000.0 (double) , 'e' 가 포함되면 실수형 literal.

    // 변수와 리터럴의 타입 불일치

    long c = 3.14f ;
    System.out.println(c); // long은 8byte, float은 4byte이지만, 실수형의 범위가 정수형의 범위보다 넓어서 에러 발생. long < float
    
    float f = 3.14; 
    System.out.println(f); // 3.14 접두사가 생략됐다면 double. float < double 이기에 에러 발생.

    boolean power = true; // boolean 은 true 와 false 만 가능.
    System.out.println(power);
    
  }
}
