class Solution {
    public void deleteNode(ListNode node) {

        node.val = node.next.val;   //curr node value matches next node val 
        node.next = node.next.next;  //node.next connects with node.next.next by 2x

    }
}
