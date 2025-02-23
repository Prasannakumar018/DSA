/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
 
        ListNode dummy = head;  
        ListNode dummy2 = head; 

       
        while (dummy != null && dummy2 != null && dummy2.next != null) {
            dummy = dummy.next;          
            dummy2 = dummy2.next.next;   

            if (dummy == dummy2) {      
                return true;
            }
        }

        return false;  
    }
}