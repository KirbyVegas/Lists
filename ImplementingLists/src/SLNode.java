public class SLNode<T> {
    //creates a node to be singly linked
    //has a head initialized to null to start with
    public SLNode next;
    public Object data;

    public SLNode(T b) {
        data = b;
        next = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }


    //use while loop to print info about each node

}
