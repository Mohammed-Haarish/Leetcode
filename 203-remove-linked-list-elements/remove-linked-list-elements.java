class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Remove nodes at the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode newnode = head;

        while (head != null && head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return newnode;
    }
}
