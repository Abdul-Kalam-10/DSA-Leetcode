public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;  //slow pointer
        ListNode fast = head;  //fast pointer
        while(fast != null && fast.next != null){ //fast&fast.next!= null
            slow = slow.next;  //1x
            fast = fast.next;  //2x
        if(slow == fast){  //slow pointer and fast pointer matched
          return true;     //true,it has cycle
           }    
        }
          return false;  //false,no cycle present
    }
}