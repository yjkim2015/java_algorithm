package common;

public class Node {
    private Node lt;
    private Node rt;
    private int val;

    public Node(int val) {
        this.val = val;
    }

    public Node getLt() {
        return lt;
    }

    public void setLt(Node lt) {
        this.lt = lt;
    }

    public Node getRt() {
        return rt;
    }

    public void setRt(Node rt) {
        this.rt = rt;
    }

    public int getVal() {
        return val;
    }
}
