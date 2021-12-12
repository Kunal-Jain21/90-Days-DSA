// Question Link
// https://www.geeksforgeeks.org/product-2-numbers-using-recursion/

public class ProductOf2Numbers {
    public static void main(String[] args) {
        System.out.print(product(125, 7));
    }

    static int product(int x, int y) {
        if (y == 0) {
            return 0;
        }
        if (x < y) {
            return product(y , x);
        }

        return x + product(x , y-1);
    }
}
