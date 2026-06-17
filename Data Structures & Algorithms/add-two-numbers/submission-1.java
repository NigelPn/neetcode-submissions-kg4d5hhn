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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode();
        ListNode sum = prev;
        int carryForward = 0;
        while (l1 != null || l2 != null || carryForward > 0){
            int num1 = 0;
            int num2 = 0;

            if(l1== null){
                num1 = 0;
            }else{
                num1 = l1.val;
            }

            if(l2 == null){
                num2 = 0;
            }else{
                num2 = l2.val;
            }

            int addition = num1 + num2 + carryForward;
            carryForward = addition / 10;
            int val  = addition % 10;
            

            sum.next = new ListNode(val);
            sum = sum.next;

            if (l1 != null){
                l1 = l1.next;
            }
            
            if (l2 != null){
                l2 = l2.next;
            }
            
        }

        return prev.next;
    }
}
