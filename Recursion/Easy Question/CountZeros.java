package com.company.easy;

public class CountZeros {
    public static void main(String[] args) {
        System.out.print((count(150650)));
    }

    static int count(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0) {
            if(c == 0) {
                return 1;
            }
            return c;
        }

        int rem = n%10;
        if(rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
