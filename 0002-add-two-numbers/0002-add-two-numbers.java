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
        ListNode ans = new ListNode(0);
        ListNode s = l1;
        ListNode e = l2;
        ListNode curr = ans;
        int carry = 0;

        while(l1!=null || l2!=null){
           int x;
           int y;
           if(l1!=null){
               x = l1.val; 
           }
           else {
               x = 0;
           }

           if(l2!=null){
               y = l2.val;
           }
           else{
               y = 0;
           }


           int sum = carry + x + y;
           carry = sum/10;
           curr.next = new ListNode (sum%10);
           curr = curr.next;
            if(l1!=null){
               l1 = l1.next; 
           }
            if(l2!=null){
               l2 = l2.next; 
           }

        }

        if(carry!=0){
            curr.next = new ListNode(carry);
        }

        return ans.next;

    }
}