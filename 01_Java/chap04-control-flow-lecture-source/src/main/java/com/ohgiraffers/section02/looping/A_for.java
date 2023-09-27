package com.ohgiraffers.section02.looping;

public class A_for {

    /*
    * [for문 표현식]
    *
    * for(초기식; 조건식; 증감식) {
    *       조건을 만족하는 경우 수행할 구문(반복할 구문);
    * }
    * */

    public void testSimpleForStatement() {
        /* 1부터 10까지 1씩 증가시키면서  i값을 출력하는 기본 반복문 */
        for(int i = 1; i <= 10; i++) {

            System.out.println(i);
        }
    }

}
