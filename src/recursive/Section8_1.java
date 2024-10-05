package recursive;

import java.util.Scanner;

public class Section8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursive(n);
    }
    public static void recursive(int n) {
        if (n < 1) {
            return;
        }

        recursive(n - 1);
        System.out.print(n + " ");
    }
}
