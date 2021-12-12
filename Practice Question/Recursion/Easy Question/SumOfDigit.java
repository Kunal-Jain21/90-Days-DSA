// Question Link
// https://www.geeksforgeeks.org/sum-digit-number-using-recursion/

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.print(sum(1003));
    }

    static int sum(int n) {
        if(n == n%10) {
            return n;
        }

        return ((n%10) + sum(n/10));
    }
}
