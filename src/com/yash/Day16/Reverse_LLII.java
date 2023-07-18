package com.yash.Day16;

public class Reverse_LLII {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode Leftprev = dummy;
        ListNode curr = head;
        for(int i = 0; i < left-1; i++){
            Leftprev = curr;
            curr = curr.next;
        }
        ListNode prev = null;
        for(int i=0; i < right-left+1; i++){
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        Leftprev.next.next = curr;
        Leftprev.next = prev;
        return dummy.next;
    }
}
