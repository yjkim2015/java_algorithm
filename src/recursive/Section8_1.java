package recursive;

import java.util.Scanner;

public class Section8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursive(1, n);
    }
    public static void recursive(int k, int n) {
        if (k > n) {
            return;
        }

        System.out.print(k + " ");
        recursive(k + 1, n);
    }
}
