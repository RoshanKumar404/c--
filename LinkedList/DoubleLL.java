public  class DoubleLL {
    // In this only the node.prev i sneing added
     /*
      for eg node.next= head;
      head.prev= node;
      node.prev=null;
      node= head;
      just it
      it is only benefitial in backward traversal

     */

      private class  Node {
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
      
        
      }
}
