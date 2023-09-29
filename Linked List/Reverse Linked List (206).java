class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            if(next == null)
              break;
            prev = curr;
            curr = next;  
        }
        return curr;
    }
}