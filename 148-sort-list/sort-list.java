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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);

        int i =0;
        ListNode output = head;
        while(output != null){
            output.val = arr[i];
            output = output.next;
            i++;
        }
        return head;

    }
}