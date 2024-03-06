class Solution {
    public ListNode deleteDuplicates(ListNode head) {
          
        ListNode curr = head;  //curr points head

        while(curr != null && curr.next != null){  //while cond
            if(curr.val == curr.next.val){   //current.value == current.next.value(Duplicate)
                curr.next = curr.next.next;  //skip that node and .next.next
            }

            else{
                curr = curr.next;  //othercase no same value move .next
            }
        }

        return head; //return head after removing duplicate nodes
    }
}
