public class DLList<T> {

    public static Object[] data;
    public static DLNode head;
    public static DLNode tail;

    public void DLList() {
        head = null;
        tail = null;

    }

    public void listAdd(T p) {
        //creates a new node with book data
        DLNode newNode = new DLNode(p);
        //if there is no head already, make the newnode the head
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public static void listRemove(int pos) {

        //if there are no nodes in the list or a not valid index
        if(head == null || pos < 0) {
            return;
        }
        DLNode current = head;
        //update pointers for each element in the list until you are at the last one
        for(int i = 0; current !=null && i<pos; i++) {
            current = current.next;
            if(current == null) {
                return;
            }
        }
        //update next pointers as long as there is one behind it
        if(current.prev != null ) {
            current.prev.next = current.next;
        }
        else {
            head = current.next;
        }
        //update prev pointers as long as there is one in front of it
        if(current.next != null) {
            current.next.prev = current.prev;
        }

    }

    public String toString() {
        String result = " ";
        DLNode current = head;
        if(current == null) {
            return " ";
        }

        while(current != null) {
            result = result + current.toString() + "\n";
            current = current.next;
        }
        return result;
    }

}
