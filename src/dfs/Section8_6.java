package dfs;

import java.util.Scanner;

public class Section8_6 {
    public static int n = 0;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n+1];
        dfs(1);
    }
    public static void dfs(int k) {
        if (k == n+1) return;
        arr[k] = 1;
        dfs(k+1);
        for (int i = 1 ; i <= n; i++) {
            if (arr[i] == 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        arr[k] = 0;
        dfs(k+1);
    }
}
