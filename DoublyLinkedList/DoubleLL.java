
public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    //print dll

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.err.print(temp.data + "<->");
            temp = temp.next;
        }
        System.err.println("null");
    }
    //remove
    public int removeFirst(){
        if (head==null ) {
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //reverse dll
    public void reverseDll(){
        if (head==null || head.next==null) {
            return;
        }
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null) { 
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.print();
        // dll.removeFirst();
        // dll.print();
        dll.reverseDll();
        dll.print();
    }
}
