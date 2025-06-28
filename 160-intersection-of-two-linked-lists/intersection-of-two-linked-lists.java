/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slow = headA;
        ListNode fast = headB;

        HashSet<ListNode> map = new HashSet<>();

        while(slow != null){
            map.add(slow);
            slow = slow.next;
        }

        while(fast != null){
            if(map.contains(fast)){
                return fast;
            }
            fast = fast.next;
        }
        return null;
    }
}