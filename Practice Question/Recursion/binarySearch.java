public class binarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,3,5,9,12};
        System.out.print(binary(arr, 0));
    }

    static int binary(int[] nums, int target) {
        return solution(nums, 0, nums.length-1, target);
    }

    static int solution(int[] arr,int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return solution(arr, low, mid - 1, target);
            } else {
                return solution(arr, mid + 1, high, target);
            }
        }
        return -1;
    }
}
