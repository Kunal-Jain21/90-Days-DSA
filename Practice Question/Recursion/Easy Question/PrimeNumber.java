// Question Link
// https://www.geeksforgeeks.org/recursive-program-prime-number/

public class PrimeNumber{
    public static void main(String[] args) {
        if (isPrime(13)) {
            System.out.print("Number is Prime.");
        }
        else {
            System.out.print("Number is not Prime.");
        }
    }

    static Boolean isPrime (int n) {
        if (n <= 2)
            return n == 2;
        return helper(n, 2);
    }

    static Boolean helper (int n, int i) {

        if (i * i > n) {
            return true;
        }

        if (n%i == 0) {
            return false;
        }
        return helper(n, i+1);
    }
}
