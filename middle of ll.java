class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode turtle = head;
        ListNode hare = head;
        while(hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return turtle;
    }
}
