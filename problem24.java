public class problem24 {

   
    public ListNode swapPairs(ListNode head) {
        // Ek dummy node banate hain taaki head ke pichhe ka connection handle ho sake
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode point = dummy;

        // Loop chalega jab tak aage 2 nodes mil rahe hain
        while (point.next != null && point.next.next != null) {
            ListNode first = point.next;
            ListNode second = point.next.next;

            // Swapping logic
            first.next = second.next;
            second.next = first;
            point.next = second;

            // Point ko do kadam aage badhao agle pair ke liye
            point = first;
        }

        return dummy.next;
   
}
    
}
