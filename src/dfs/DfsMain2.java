package dfs;

public class DfsMain2 {
    static int n;
    static int[] ch;

    public void DFS(int L) {

        if (L == n+1) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        DfsMain2 dfsMain2 = new DfsMain2();
        n = 3;
        ch = new int[n+1];

        dfsMain2.DFS(1);
    }
}
