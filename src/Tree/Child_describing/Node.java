package Tree.Child_describing;

/*
    Child-describing
 */
public class Node {
    private int no;
    private Node next;

    public Node(int no, Node next) {
        this.no = no;
        this.next = next;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
