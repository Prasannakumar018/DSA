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
    public ListNode reverseList(ListNode head) {
        // If the list is empty or has only one node, return it as is
        if (head == null) {
            return head;
        }

        // Stack to hold all the nodes
        Stack<ListNode> stack = new Stack<>();

        // Push all nodes onto the stack
        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Pop the last node and make it the new head
        head = stack.pop();
        current = head;

        // Pop the remaining nodes and set their next pointers
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            current.next = node;  // Reverse the link
            current = node;  // Move to the next node
        }

        // Set the last node's next to null
        current.next = null;

        return head;  // Return the new head of the reversed list
    }
}
