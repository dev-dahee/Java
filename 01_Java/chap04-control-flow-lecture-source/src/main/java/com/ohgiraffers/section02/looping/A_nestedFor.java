package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
<<<<<<< HEAD
    /* for문 안에 for문을 이용할 수 있다. */
    public void printGugudanFromTwoToNine() {

        /* 2단부터 단을 1씩 증가시키는 반복문 */
        for(int dan = 2; dan < 10; dan++) {
            for(int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
=======

    /* for문 안에 for문을 이용할 수 있다. */
    public void printGugudanFromTwoToNine() {


        /* 2단부터 단을 1씩 증가시키는 반복문 */
        for(int dan = 2; dan < 10; dan++){

            for(int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

>>>>>>> ae1b6fb05877ab993ddb9c4e07419ac8152ca904
            System.out.println();
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {
<<<<<<< HEAD
        for(int dan = 2; dan < 10; dan++) {
=======

        for(int dan = 2; dan < 10; dan++){

>>>>>>> ae1b6fb05877ab993ddb9c4e07419ac8152ca904
            printGugudanOf(dan);
            System.out.println();
        }
    }

<<<<<<< HEAD
    public void printGugudanOf(int dan) {
=======
    public void printGugudanOf(int dan){

>>>>>>> ae1b6fb05877ab993ddb9c4e07419ac8152ca904
        for(int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStarInputRowTimes() {
<<<<<<< HEAD
        /* 키보드로 정수를 하나 입력 받아 해당 정수 많큼 한 행에 "*"를 5개씩 출력하세요 */
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) { //행으로 잡고
        //    System.out.println("*");
            for(int j=1; j<6; j++) {    //열로 잡는다.(우리가 정함)
                System.out.println("*");    // *****
            }
            System.out.println();
        }
    }
    public void printTrinagleStars() {
        /*
            키보드로 정수를 입력받아 해당 정수만큼 한 행에 "*"을 행의 번호개씩 출력하세요.

            에)
            정수를 입력하세요 : 5
            *
            **
            ***
            ****
            *****
         */
        System.out.println("풀력할 줄 수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.println("*");
=======

        /* 키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*"를 5개씩 출력하세요 */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        /* 입력한 행 만큼 반복 */
        for(int i = 1; i <= row; i++){

           for(int j = 1; j < 6; j++) {
               System.out.print("*");  // *****
           }
            System.out.println();
        }
    }

    public void printTrinagleStars() {

        /*
        * 키보드로 정수를 입력받아 해당 정수만큼 한 행에 "*"을 행의 번호개씩 출력하세요
        *
        * 정수를입력하세요 : 5
        * *
        * **
        * ***
        * ****
        * *****
        * */

        System.out.print("출력할 줄 수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
>>>>>>> ae1b6fb05877ab993ddb9c4e07419ac8152ca904
            }
            System.out.println();
        }
    }
<<<<<<< HEAD
=======










>>>>>>> ae1b6fb05877ab993ddb9c4e07419ac8152ca904
}
