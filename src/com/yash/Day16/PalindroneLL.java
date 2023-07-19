package com.yash.Day16;

import com.yash.Day13.removeduplicatesfromLL;

public class PalindroneLL {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, removeduplicatesfromLL.ListNode next) {
            this.val = val;
            //this.next = next;
        }

        public static void main(String[] args) {

        }

        public boolean isPalindrome(ListNode head) {
            //find mid
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            if (fast != null)
                slow = slow.next;
            ListNode reverseHead = reverse(slow);

            while (reverseHead != null) {
                if (reverseHead.val != head.val) return false;
                else {
                    reverseHead = reverseHead.next;
                    head = head.next;
                }
            }
            return true;
        }

        public ListNode reverse(ListNode pres) {
            ListNode prev = null;
            while (pres != null) {
                ListNode next = pres.next;
                pres.next = prev;
                prev = pres;
                pres = next;
                if (next != null) {
                    next = next.next;
                }
            }
            return prev;
        }
    }
}

