package recursive;

import java.util.Scanner;

public class Section8_4 {
    public static int n = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(recursive(i) + " ");
        }
    }

    public static int recursive(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else {
            return recursive(n -2 ) + recursive(n - 1);
        }
    }
}
