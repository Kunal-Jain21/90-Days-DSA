package com.company.easy;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.print(reverse(1824));
    }

    static int reverse(int n) {

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
