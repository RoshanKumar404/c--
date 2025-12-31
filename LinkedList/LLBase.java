public class LLBase {
    private Node head;
    private Node tail;
    private int size;

    public LLBase() {
        this.size = 0;
    }

    //this is how we add a node at start of the list
    public void InsertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head= node;

        if (tail==null) {
            tail=head;
        }
        size+=1;

    }
    public void display(){
      Node temp=head;
      while (temp!=null) {
        System.out.print(temp.value + " -> ");
       temp=temp.next;
      }
      System.out.println("done");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
