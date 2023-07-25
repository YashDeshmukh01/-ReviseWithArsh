package com.yash.Day23;

public class LLRemoveFromEnd {
    public class ListNode {
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode f = dummyHead;
        ListNode s = dummyHead;

        for(int i = 1; i <= n; ++i)
            f = f.next;

        while(f.next!=null){
            f=f.next;
            s=s.next;
        }

        s.next = s.next.next;
        return dummyHead.next;
    }
}
