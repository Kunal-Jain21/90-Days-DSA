// Question Link
// https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.print(sum(5));
    }

    static int sum (int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum(n-1);
    }
}
