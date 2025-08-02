/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = new ListNode(-1);
        ListNode tail = curr;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null && temp2 != null){
            int val1 = temp1.val;
            int val2 = temp2.val;
            if(val1 <= val2){
                tail.next = temp1;
                temp1 = temp1.next;
            }else{
                 tail.next = temp2;
                 temp2 = temp2.next;
            }
            tail = tail.next;
        }
        if (temp1 != null) tail.next = temp1;
        if (temp2 != null) tail.next = temp2;

        return curr.next;
    }
}