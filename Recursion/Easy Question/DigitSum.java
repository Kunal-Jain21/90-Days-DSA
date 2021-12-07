package com.company.easy;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digit(12123));
    }

    static int digit(int n) {
        if(n < 10) {
            return n;
        }

        int num = n%10;
        return num + digit(n/10);
    }
}
