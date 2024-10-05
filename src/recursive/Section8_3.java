package recursive;

import java.util.Scanner;

public class Section8_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recursive(n));

    }

    public static int recursive(int n) {
        if (n == 1) {
            return 1;
        }

       return n * recursive(n-1);
    }
}
