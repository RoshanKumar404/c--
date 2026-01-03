public class LLBase {
    private Node head;
    private Node tail;
    private int size;

    public LLBase() {
        this.size = 0;
    }
    // this is how we insert at a specific  index
    public void InsertSpecif(int val, int index){
        if(index<0||index>size){
            System.out.println("enter the the index bw the range\n  i.e 0 and " +size);
            return;
        }
        if (index==0) {
            InsertFirst(val);
            return;
        }
        if (index==size) {
            Insertlst(val);
            return;     
        }
        
        Node temp = head;
        for(int i=1;i<index;i++){
          temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
        
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
    // this is how we insert the elment at the end of the list
    // or the next to tail
    public void Insertlst(int val){
        if (tail==null) {
            InsertFirst(val);
            return;
            
        }
        Node node= new Node(val);
        tail.next=node;
        tail =node;
// if (tail==null) {
//     head=tail;
    
// }
        size++;
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
