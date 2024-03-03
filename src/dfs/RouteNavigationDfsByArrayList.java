package dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

이 풀이법은 기존 인접행렬보다 속도면에서 우월하다.
2차원 그래프를 사용해서
정점마다 다른곳으로 갈 수 있는 모든 정점을 갖고 있는 것이 핵심이다.
 */
public class RouteNavigationDfsByArrayList {

    public static List<List<Integer>> graph;

    public static int n;
    public static int m;
    public static int answer = 0;

    public static int[] checked;
    public static void DFS(int v) {

        if (v == n) answer++;
        else {
            //이차원 그래프에서 정점 v에서 다른 정점으로 가는 데이터들을 뽑는다.
            for(int nv: graph.get(v)) {
                if (checked[nv] == 0) {
                    checked[nv] = 1;
                    DFS(nv);
                    checked[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의 수
        m = sc.nextInt(); //간선의 수
        checked = new int[n+1];
        checked[1] = 1;
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            //이중 ArrayList 초기화
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            //간선 입력 받기
            int k = sc.nextInt();
            int v = sc.nextInt();
            //k정점에서 v정점으로 가는 간선
            graph.get(k).add(v);
        }

        DFS(1);
        System.out.println(answer);
    }
}
