package com.company.easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print(palin(1221));
    }

    static boolean palin(int n) {
        return (n == rev(n));
    }

    static int rev(int n) {

        int digits = (int)(Math.log10(n));
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10  == n) {
            return n;
        }

        int rem = n%10;
        return rem * (int)(Math.pow(10,digits)) + helper(n/10, digits-1);
    }
}
