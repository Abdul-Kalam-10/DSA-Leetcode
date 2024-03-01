class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return null; //when head is null
        
        ListNode dummy = new ListNode(-1); //dummy node created
        dummy.next = head;  //dummy before head

        ListNode curr = dummy; //curr pointer points dummy

        while(curr.next != null){  //till it reaches null
            if(curr.next.val == val){   //curr.next matches val
                curr.next = curr.next.next;  //skip 1 node
            }
            else{
                curr = curr.next;  //.next 1x
            }

        }
        return dummy.next;  //dummy.next linked list without val
    }
}
