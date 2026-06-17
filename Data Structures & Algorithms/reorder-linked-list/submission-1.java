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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode list1 = head;
        ListNode slowPrev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next !=null){
            slowPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slowPrev.next = null;
        ListNode list2 = reverseLinkedList(slow);

        merge(list1,list2);

    }

    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
        //1,2,3,4,5
        //10,9,8,7
      public void merge(ListNode list1 ,ListNode list2){
        while(list1 != null){
            ListNode temp1 = list1.next; //2,3,4,5
            ListNode temp2 = list2.next; //9,8,7
            
            list1.next = list2; //10,9,8 (1,10,9,8)

            if(temp1 == null) break;

            list2.next = temp1; //2,3,4,5 (1,10,2,3,4,5)
            list1 = temp1; //2,3,4,5 (1,10,2,3,4,5)
            list2 = temp2 ; // 9,8,7 (9,8,7)
        }
    }
}
