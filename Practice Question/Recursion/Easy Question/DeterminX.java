// Question
// Write a recursive function for given n and a to determine x:
// n = a ^ x
// a = 2, 3, 4
// (2 ^ -31) <= n <= (2 ^ 31) - 1

public class DeterminX {
    public static void main(String[] args) {
        System.out.print(findX(64, 4));
    }

    static int findX (int n, int a) {
        return helper(64, 4, 0);
    }

    static int helper(int n, int a, int i) {
        int ans = (int) Math.pow(a,i);

        if (n == ans) {
            return i;
        }
        if (n > ans) {
            return helper(n, a, i+1);
        }
        return -1;
    }
}
