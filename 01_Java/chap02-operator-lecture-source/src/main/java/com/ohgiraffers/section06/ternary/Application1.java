package com.ohgiraffers.section06.ternary;

public class Application1 {

    public static void main(String[] args){
        
        /*
        * 삼항 연산자 
        * 자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        * 항목이 3개이다 : (조건식)? 참일 때 사용할 값1 : 거짓일 때 사용할 값2
        * 
        * 조건식은 반드시 결과가 true 또는 false가 나오게끔 작성해야한다. 
        * 그래서 비교/논리연산자를 주로 사용
        * */

        int num1 = 10;
        int num2 = -10;

        String result1 = (num1 > 0)? "양수다": "양수가 아니다";
        String result2 = (num2 > 0)? "양수다": "양수가 아니다";
        System.out.println("num1은 " + result1);
        System.out.println("num2은 " + result2);

        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0)? "양수다": (num3 == 0)? "0이다": "음수다";
        String result4 = (num4 > 0)? "양수다": (num4 == 0)? "0이다": "음수다";
        String result5 = (num5 > 0)? "양수다": (num5 == 0)? "0이다": "음수다";

        System.out.println("num3은 " + result3);
        System.out.println("num4은 " + result4);
        System.out.println("num5은 " + result5);

    }
}
