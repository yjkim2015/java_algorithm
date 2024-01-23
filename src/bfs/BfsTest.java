package bfs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class BfsTest {

    public static void main(String[] args) {

        System.out.println(new BfsTest().Bfs(5, 14));
    }

    public int Bfs(int start, int end) {
        int numbers[] = {1,-1,5};
        int checked[] = new int [10001];
        int len = 0;
        checked[start] = 1;
        Queue<Integer> queue = new LinkedList();
        queue.add(start);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur == end) {
                    return len;
                }
                for (int j = 0; j < numbers.length; j++) {
                    int next = cur + numbers[j];
                    if (next >=1 && next <= 10000 & checked[next] == 0) {
                        checked[next] = 1;
                        queue.add(next);
                    }
                }
            }
            len++;
        }

        return len;
    }

}
