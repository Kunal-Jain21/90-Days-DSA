// Question Link
// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/

public class ArraySorted {
    public static void main(String[] args) {
        int arr[] = { 20, 29, 23, 45, 78, 88 };
        int n = arr.length;
        System.out.print(arraySortedOrNot(arr, n));
    }

    static Boolean arraySortedOrNot (int[] arr, int n) {
        if (n ==1 || n == 0) {
            return true;
        }
        if (arr[n-1] < arr[n-2]) {
            return false;
        }

        return arraySortedOrNot(arr, n-1);
    }
}
