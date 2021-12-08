package com.company.easy;

public class sum1toN {
    public static void main(String[] args) {
        int ans =  sum(5);
        System.out.println(ans);
    }

    static int sum(int n) {

        if(n < 2) {
            return n;
        }
        return n + sum(n-1);
    }
}
