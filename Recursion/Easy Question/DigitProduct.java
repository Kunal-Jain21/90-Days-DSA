package com.company.easy;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.print(prod(5036));
    }

    static int prod(int n) {
        if(n < 10) {
            return n;
        }

        return (n%10) * prod(n/10);
    }
}
