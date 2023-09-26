package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args){

        /*
        * java.util.Scanner를 이용한 다양한 자료형 값 입력 받기
        * */

        /* 1. Scanner 객체 생성 */
//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        //                       System.out , System.err
        Scanner sc = new Scanner(System.in);

        /* 2. 자료형별 값 입력받기
        *
        * 입력받을 때 안내문구는 별도로 출력해주지 않으니 우리가 직접 작성해주어야한다.
        * -->자주 하는 혼동상황
        * */

        /* 문자열 입력 받기
        * nextLine() : 입력받은 값을 문자열로 반환해준다.
        * */
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        /*
        * 정수형 값 입력 받기
        * nextInt() : 입력받은 값을 int형으로 반환한다.
        *
        * nextByte()/nextShort()는 생략한다.
        *
        * 매개변수로 사용할 수 있는 radix는 진법을 지정할 수 있다.
        *
        * 숫자가 아닌 값을 입력하게 되면 InputMismatchException이 발생한다.
        * int 범위를 초과한 값을 입력받게 되면 역시나 InputMismatchException이 발생한다.
        * */
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");

        /*
        * nextLong() : 입력받은 값을 long형으로 반환한다.
        * */
        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + "원 입니다.");
    }
}
