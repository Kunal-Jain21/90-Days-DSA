public class MinAndMax {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 3, -5, -4, 8, 6};
        int min = arrayMin(array);
        int max = arrayMax(array);
        System.out.print("Minimun: " + min + "\nMaximum: " + max);
    }

    static int arrayMin(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        else {
            int[] a = new int[arr.length-1];
            for (int i=1; i< arr.length; i++) {
                a[i-1] = arr[i];
            }
            int m = arrayMin(a);
            if(arr[0] < m) {
                return arr[0];
            }
            return m;
        }
    }

    static int arrayMax(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        else {
            int[] a = new int[arr.length-1];

            for (int i=1; i< arr.length; i++) {
                a[i-1] = arr[i];
            }
            int m = arrayMax(a);
            if(arr[0] > m) {
                return arr[0];
            }
            return m;
        }
    }
}
