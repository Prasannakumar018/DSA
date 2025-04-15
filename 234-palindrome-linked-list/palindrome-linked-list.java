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
    public boolean isPalindrome(ListNode head) {
        // Edge case: if the list is empty or has only one element
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list (slow and fast pointer approach)
        ListNode slow = head;
        ListNode fast = head;
        
        // Move slow one step, fast two steps until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Step 3: Compare the first and second half
        ListNode firstHalf = head;
        ListNode secondHalf = prev;  // prev is now the head of the reversed second half
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;  // If values don't match, it's not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;  // If we went through all elements and found no mismatch
    }
}
