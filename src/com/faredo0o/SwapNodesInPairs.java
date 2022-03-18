package com.faredo0o;


public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));
        System.out.println(swapPairs(head));

    }
    public static ListNode swapPairs(ListNode head) {


        if(head==null) return null;
        if(head.next==null) return head;
        ListNode current=head;
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;
       return next;
    }
}
