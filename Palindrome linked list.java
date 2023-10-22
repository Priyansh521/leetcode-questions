class Solution {
    public ListNode reverse(ListNode head){
          ListNode prev = null;
          ListNode curr = head;
          while(curr != null){
              ListNode next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }
          return prev;
    }
    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        if(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
       if(head == null || head.next == null){
           return true;
       }
       ListNode middle = findMiddle(head);
       ListNode secondHalf = reverse(middle.next);
       ListNode firstHalf = head;
       while(secondHalf != null){
           if(firstHalf.val != secondHalf.val){
               return false;
           }
           firstHalf = firstHalf.next;
           secondHalf = secondHalf.next;
       }
       return true;
    }
}
