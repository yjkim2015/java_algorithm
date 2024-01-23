package dfs;


import java.util.Scanner;

public class DfsTest {
    public static int[] checked = new int[6];
    public static int n = 5;

    public static int answer = 0;

    public static int[][] array = new int[6][6];
    public static void main(String[] args) {
        int l = 1;
        Scanner sc = new Scanner(System.in);
        array[1][2] = 1;
        array[1][3] = 1;
        array[1][4] = 1;
        array[2][1] = 1;
        array[2][3] = 1;
        array[2][5] = 1;
        array[3][4] = 1;
        array[4][2] = 1;
        array[4][5] = 1;

        checked[1]=1;
        new DfsTest().Dfs(l);
        System.out.println("answer " + answer);
    }

    public void Dfs(int v) {
        if (v == n)  {
            answer++;
            for (int i = 1; i <= n ; i++) {
                if (checked[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        else {
            for(int i = 1; i <= n; i++) {
                if (array[v][i] == 1 && checked[i] == 0) {
                    checked[i] = 1;
                    Dfs(i);
                    checked[i] = 0;
                }
            }
        }
    }
}