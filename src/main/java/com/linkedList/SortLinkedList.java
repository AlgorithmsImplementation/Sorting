package com.linkedList;

public class SortLinkedList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeList(left, right);
    }

    public ListNode getMid(ListNode head){
        ListNode midPrev = null;

        while(head!=null && head.next!=null){
            midPrev = (midPrev==null) ? head : midPrev.next;
            head = head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;

        return mid;
    }

    public ListNode mergeList(ListNode left, ListNode right){
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;

        while(left!=null && right!=null){
            if(left.val < right.val){
                tail.next = left;
                left = left.next;
            }else{
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        tail.next = (left!=null) ? left : right;

        return dummyHead.next;
    }
}
