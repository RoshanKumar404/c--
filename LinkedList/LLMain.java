public class LLMain {
     public static void main(String[] args) {
    LLBase list= new LLBase();

    list.InsertFirst(15);
    list.InsertFirst(32);
    list.InsertFirst(42);
     list.Insertlst(13);
    list.InsertFirst(23);
    list.InsertFirst(2);
   //  list.InsertSpecif(10,12);
   
    

    list.display();
   //  System.out.println(list.deleteFirst());
   //  System.out.println(list.deletelast());
   System.out.println(list.deleteSepcific(4));
    list.display();
   }
  
}
