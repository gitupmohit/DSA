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

// class Solution {
//     public ListNode sortList(ListNode head) {
//         if (head == null || head.next == null) return head;

//         // Step 1: Split the list into halves
//         ListNode mid = getMiddle(head);
//         ListNode right = mid.next;
//         mid.next = null;

//         // Step 2: Sort both halves
//         ListNode leftSorted = sortList(head);
//         ListNode rightSorted = sortList(right);

//         // Step 3: Merge both sorted halves
//         return merge(leftSorted, rightSorted);
//     }

//     private ListNode getMiddle(ListNode head) {
//         ListNode slow = head, fast = head;

//         while (fast.next != null && fast.next.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         return slow;
//     }

//     private ListNode merge(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode(0), tail = dummy;

//         while (l1 != null && l2 != null) {
//             if (l1.val < l2.val) {
//                 tail.next = l1;
//                 l1 = l1.next;
//             } else {
//                 tail.next = l2;
//                 l2 = l2.next;
//             }
//             tail = tail.next;
//         }

//         tail.next = (l1 != null) ? l1 : l2;

//         return dummy.next;
//     }
// }
