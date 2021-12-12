// Question Link
// // https://leetcode.com/problems/power-of-three/

public class PowerOf3 {
    public static void main(String[] args) {
        System.out.print(isPowerOfThree(0));
    }

    static Boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n%3 != 0 || n == 0) {
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
