public class DLNode<T> {

    DLNode next;
    DLNode prev;
    T data;

    public DLNode(T b) {
        data = b;
        next = null;
        prev = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
