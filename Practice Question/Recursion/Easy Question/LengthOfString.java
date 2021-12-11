public class LengthOfString {
    public static void main(String[] args) {
        String str ="GeeksforGeeks";
        System.out.println(length(str));
    }

    static int length(String str) {
        if (str.equals("")) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
}
