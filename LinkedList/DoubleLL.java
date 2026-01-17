public class DoubleLL {
    // In this only the node.prev i sneing added
    /*
     * for eg node.next= head;
     * head.prev= node;
     * node.prev=null;
     * node= head;
     * just it
     * it is only benefitial in backward traversal
     * 
     */

    Node head;
    Node tail;

    // lets try to insert at the first

    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;
        //here updating the tail after adding the node
        if (tail == null) {
            tail = head;
        }
    }

    // lets try to insert at the last
    public void insertLLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        // connecting the current tail to new node
        tail.next = node;

        // this is setting th current tail as previous node
        node.prev = tail;

        tail = node;
    }
    // if the tail is not provided and asked to add at last 
    // so travers to second last node and add at that node 
    // ***lets insert to next to the given node ******
    public void InsernextTo(int val,int index){
        Node node= new Node(val,index);
        node.next=next.index;
        next.next= node;
        while (node.next!=null) {
            node.next =node;
        }
        node.prev= next.index;

    }

    public void display() {
        Node node = head;
        Node last = null;
        System.out.println("printing  normally");

        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("Null");
        System.out.println(
                "printing reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;

        }
        System.out.print("start");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
