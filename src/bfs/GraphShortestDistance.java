package bfs;

import java.util.*;

/*
입력 값
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 */
public class GraphShortestDistance {

    public static List<List<Integer>> graph;
    public static int[] checked;
    public static int n;
    public static int m;
    public static int[] dis; // 정점 1에서 정점 N 까지의 거리를 표시하는 배열

    public static void BFS(int v) {
        dis[1] = 0;
        checked[1] = 1;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for(int nv: graph.get(cv)) {
                if (checked[nv] == 0) {
                    checked[nv] = 1;
                    queue.add(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        dis = new int[n+1];
        checked = new int[n+1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0 ; i < m; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            graph.get(k).add(v);
        }

        BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(dis[i]);
        }
    }
}

