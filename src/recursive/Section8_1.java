package recursive;

import java.util.Scanner;

public class Section8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursive(n);
    }
    public static void recursive(int n) {
        if (n == 0) {
            return;
        }

        recursive(n / 2);
        System.out.print(n % 2 + " ");
    }
}
