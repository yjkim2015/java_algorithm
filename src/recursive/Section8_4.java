package recursive;

import java.util.Scanner;

public class Section8_4 {
    public static int n = 0;
    static int[] fibo;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        fibo = new int[n+1];

        /*for (int i = 1; i <= n; i++) {
            System.out.print(recursive(i) + " ");
        }*/
        fibonachi(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public static int recursive(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else {
            return recursive(n -2 ) + recursive(n - 1);
        }
    }

    public static int fibonachi(int n) {
        if(fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[1] = 1;
        else if (n == 2) return fibo[2] = 1;
        else {
            return fibo[n] = fibonachi(n -2 ) + fibonachi(n - 1);
        }
    }
}
