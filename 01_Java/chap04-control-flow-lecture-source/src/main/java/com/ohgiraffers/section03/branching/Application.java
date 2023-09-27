package com.ohgiraffers.section03.branching;

public class Application {
<<<<<<< HEAD
    public static void main(String[] args) {
        A_break a = new A_break();
        //a.testSimpleBreakStatement();
        a.testSimpleBreakStatement2();
    }
=======

    public static void main(String[] args){

        A_break a = new A_break();
//        a.testSimpleBreakStatement();
        a.testSimpleBreakStatement2();
//        a.testJumpBreak();

        B_continue b = new B_continue();
//        b.testSimpleContinueStatement();
        b.testJumpContinue();
    }

>>>>>>> ae1b6fb05877ab993ddb9c4e07419ac8152ca904
}
