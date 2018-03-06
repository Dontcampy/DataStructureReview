package Tree.Parents_describing;

/*
    Parents-describing
 */
public class Node {
    private Node parent;
    private Node firstChild;
    private Node rightSib;
    private int data;

    public Node(Node parent, Node firstChild, Node rightSib, int data) {
        this.parent = parent;
        this.firstChild = firstChild;
        this.rightSib = rightSib;
        this.data = data;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
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

    public Node getRightSib() {
        return rightSib;
    }

    public void setRightSib(Node rightSib) {
        this.rightSib = rightSib;
    }
}
