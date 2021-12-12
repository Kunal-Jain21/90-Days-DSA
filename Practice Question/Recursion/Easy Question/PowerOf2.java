// Question Link
// https://leetcode.com/problems/power-of-two/

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.print(isPowerOfTwo(2));
    }

    static Boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n%2 != 0 || n == 0) {
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
