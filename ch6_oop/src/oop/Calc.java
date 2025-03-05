package oop;

// 사칙연산

public class Calc {

    long add(long num1, long num2) {
        return num1 + num2;
    }

    long subtract(long num1, long num2) {
        return num1 - num2;
    }

    long multiply(long num1, long num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        return num1 / num2;
    }

    long max(long num1, long num2) {
        return num1 > num2 ? num1 : num2;
        // if (num1 > num2) {
        // return num1;
        // } else {
        // return num2;
        // }
    }

    long min(long num1, long num2) {
        return num1 > num2 ? num2 : num1;
        // if (num1 > num2) {
        // return num2;
        // } else {
        // return num1;
        // }
    }

}
