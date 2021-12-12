// Question Link
// https://leetcode.com/problems/power-of-four/

public class PowerOf4 {
    public static void main(String[] args) {
        System.out.print(isPowerOfFour(63));
    }

    static Boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n%4 != 0 || n == 0) {
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
