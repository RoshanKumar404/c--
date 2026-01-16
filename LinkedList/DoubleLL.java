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

    // lets try to insert at the first
    Node head;
    // Node tail;

    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;

    }
    public void display(){
        Node node= head;
        while (node!=null) {
            System.out.print(node.val +  " -> ");
            node=node.next;
        }
        System.out.println("Null");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
