import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5,6,7};
        printTriangle(a);
    }

    static void printTriangle(int[] arr) {
        int size = arr.length;

        if (size == 1) {
            System.out.println(Arrays.toString(arr));
        }
        else {
            int[] arr1 = new int [size-1];

            for (int i=0; i<size-1; i++) {
                arr1[i] += arr[i] + arr[i+1];
            }

            printTriangle(arr1);
            System.out.println(Arrays.toString(arr));
        }
    }
}
