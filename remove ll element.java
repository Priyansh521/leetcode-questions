class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        while(head != null && head.val == val){
            head = head.next;
            if(head == null){
                return null;
            }
        }
        ListNode pointer = head;
        while(pointer.next != null){
            if(pointer.next.val == val){
                pointer.next = pointer.next.next;
            }
            else{
                pointer = pointer.next;
            }
        }
        return head;
    }
}
