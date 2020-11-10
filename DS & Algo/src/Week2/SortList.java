//https://leetcode.com/problems/sort-list/

package Week2;

import Week1.*;

public class SortList {

    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }


        ListNode mid = getMid(head);
        ListNode first = sortList(head);
        ListNode second = sortList(mid);

        return merge(first,second);

    }

    public ListNode getMid(ListNode head){

        if(head==null || head.next==null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        return mid;

    }

    public ListNode merge(ListNode a1,ListNode a2){

        ListNode newNode = new ListNode(0);
        ListNode curr = newNode;

        while(true){
            if(a1==null){
                curr.next = a2;
                break;
            }

            else if(a2==null){
                curr.next = a1;
                break;
            }

            if(a1.val<=a2.val){
                curr.next = a1;
                a1 = a1.next;
            }

            else{
                curr.next = a2;
                a2 = a2.next;
            }
            curr = curr.next;
        }

        return newNode.next;
    }
}
