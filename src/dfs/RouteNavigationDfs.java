package dfs;

import java.util.Scanner;

public class RouteNavigationDfs {

    public static int[][] graph;
    public static int[] checked;
    public static int answer = 0;
    public static int n;
    public static void DFS(int v) {
        if (v == n) {
            answer++;
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                //1부터 갈 수 있는 모든 정점을 다 뒤져본다.
                if (graph[v][i] == 1 && checked[i] == 0) {
                    //v -> i 로 가는 값이 1이면 간선이 존재
                    //checked[i] == 0 가지 않았던 곳
                    checked[i] = 1;
                    DFS(i);
                    checked[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 정점의 수
        int m = sc.nextInt(); // 간선의 수

        checked = new int[n+1];
        graph = new int[n+1][n+1];
        for (int i = 1; i <= m; i++) {
            //간선의 수만큼 입력을 받아서 그래프를 인접그래프를 채워 넣는다.
            int k = sc.nextInt();
            int v = sc.nextInt();
            graph[k][v] = 1;
        }

        checked[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
