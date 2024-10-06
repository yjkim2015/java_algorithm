package dfs;

import common.Node;

public class Section8_5 {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.setLt(new Node(2));
        root.setRt(new Node(3));
        root.getLt().setLt(new Node(4));
        root.getLt().setRt(new Node(5));
        root.getRt().setLt(new Node(6));
        root.getRt().setRt(new Node(7));
        dfs(root);
    }

    public static void dfs(Node root) {
        if (root == null) return;
        System.out.print(root.getVal() + " ");
        dfs(root.getLt());
        dfs(root.getRt());
    }
}
