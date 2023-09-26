package com.ohgiraffers.section01.method;

public class Calculator {
    public int minNumberOf(int first, int second) {
        return (first > second)? second : first;    //삼항연산자
    }
    public static int maxNumberOf(int first, int second) {
        return (first > second)? first : second;
    }

}
