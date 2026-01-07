public class llPractice {
    private Node head;
    private Node tail;
    private int size;

    public  llPractice(){
        this.size=0;
    }
    //adding a node element at the start
    public void Insertstart(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if (tail==null) {
            tail=head;
        }
        size += 1;
    }
    // adding the element to the last

    public void Insertend(int val){
        if (tail==null) {
            Insertstart(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail= node;
        size++;
    }
    // inserting the element in bw or specific index
    public void Insertbw(int val, int index){
        // first chek the index is valid or not
        if (index<0||index>size) {
            System.out.println("enter valid index");
            return ;

        }
        if (index==0) {
            Insertstart(val);
            return;

        }
        if (index== size) {
            Insertend(val);
            return;
        }
        // here im trying to travese till the index
        Node temp= head;
        for (int i = 1; i < index; i++) {
            temp= temp.next;
        }
        Node node= new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.value +  " -> ");
            temp= temp.next;
        }
        System.out.println("done");
    }


// this is how we create a node element
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        
        }
        public Node(int value,Node next){
            this.value=value;
            this.next= next;
        }
    }
    
}
