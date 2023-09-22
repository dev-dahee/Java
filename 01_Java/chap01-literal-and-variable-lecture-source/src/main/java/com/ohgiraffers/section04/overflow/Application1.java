package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args){

        /*
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킨다.
        * */
        byte num1 = 127;

        System.out.println("num1: " + num1);

        num1++;             // 1증가

        System.out.println("num1 overflow : " + num1);





    }
}
