// Question Link
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class ReduceToZero {
    public static void main(String[] args) {
        System.out.print(numberOfSteps(123));
    }

    static int numberOfSteps (int num) {
        return helper(num, 0);
    }

    static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num%2 == 0) {
            return helper(num/2, count+1);
        }
        else {
            return helper(num-1, count+1);
        }
    }
}
