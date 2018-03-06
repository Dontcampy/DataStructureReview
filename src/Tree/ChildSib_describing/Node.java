package Tree.ChildSib_describing;

/*
    ChildSib-describing, use a binary tree structure to describe a tree.
 */
public class Node {
    private int data;
    private Node firstChild;
    private Node nextSib;

    public Node(int data, Node firstChild, Node nextSib) {
        this.data = data;
        this.firstChild = firstChild;
        this.nextSib = nextSib;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(Node firstChild) {
        this.firstChild = firstChild;
    }

    public Node getNextSib() {
        return nextSib;
    }

    public void setNextSib(Node nextSib) {
        this.nextSib = nextSib;
    }
}
