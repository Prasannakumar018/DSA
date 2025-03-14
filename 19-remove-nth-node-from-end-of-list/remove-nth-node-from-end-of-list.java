class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge case where head might be removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize both slow and fast pointers to the dummy node
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast pointer n steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both slow and fast one step at a time until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end by skipping it
        slow.next = slow.next.next;

        // Return the modified list starting from the real head
        return dummy.next;
    }
}
