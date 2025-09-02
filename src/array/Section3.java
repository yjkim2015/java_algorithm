package array;

import java.util.Scanner;

public class Section3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int before = 0;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x > before) {
                System.out.println(x);
            }
            before = x;
        }

    }
}
