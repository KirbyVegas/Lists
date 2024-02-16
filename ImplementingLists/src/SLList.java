public class SLList<T> {
    public static SLNode head;
    public SLList() {
        //creates an empty SLList
        head = null;
    }

    public void listAdd(T p) {
        SLNode newNode = new SLNode(p);
        SLNode current = head;

        //if there is no head already, make the newnode the head
       if(head == null) {
           head = newNode;
       }

       else {
           while(current.next != null) {
               current = current.next;
           }
           current.next = newNode;
       }
    }
    public static void listRemove(int pos) {
        if(head == null || pos < 0) {
            return;
        }
        SLNode current = head;
        //
        for(int i = 0; current != null && i< pos; i++){
            current = current.next;
            if(current == null) {
                return;
            }
        }
        if(current.next == null) {
            return;
        }
        //now, current is the one before the one we are going to delete
        if(current.next.next == null) {
            current.next = null;
        }
        else {
            current.next = current.next.next;
        }

    }

    public String toString() {
        //should return a string containing all elements in the SLList
        String result = " ";
        SLNode current = head;
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
