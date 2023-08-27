class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        
        int size = 0;
        ListNode curr = head;
        //size of  linked list
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return head;
        }
        //searching for the previous node of the nth node
        int index = size - n;
        ListNode prTarget = head;
        int i = 1;
        while(i<index){
            prTarget = prTarget.next;
            i++;
        }
        //deleting the nth node from the list by making it's node pointing towards the (n+1)th node
        prTarget.next = prTarget.next.next;
        return head;
    }
}
