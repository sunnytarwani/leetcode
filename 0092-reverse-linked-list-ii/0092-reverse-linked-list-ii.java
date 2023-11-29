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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        for(int i = 1 ; i < left ; i++){
            prev = curr;
            curr = curr.next;
        }

        ListNode point = prev ;
        ListNode tail = curr;

        for(int i = left ; i <= right ; i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        if(point == null){
            head = prev;
        }
        else{
            point.next = prev;
        }

        tail.next = curr;

        return head;
    }
}