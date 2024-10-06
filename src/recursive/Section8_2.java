package recursive;

import java.util.Scanner;

public class Section8_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        recursive(n);
    }
    public static void recursive(int n) {
        if (n == 0) return;

        recursive(n / 2);
        System.out.println(n % 2 + " ");
    }
}
