// Question Link
// https://www.hackerrank.com/challenges/30-recursion/problem

public class Factorial {
    public static void main(String[] args) {
        System.out.print(fact(3));
    }

    static int fact (int n) {
        if (n < 2) {
            return 1;
        }

        return n * fact(n-1);
    }
}
