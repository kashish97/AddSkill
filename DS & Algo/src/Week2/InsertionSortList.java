//https://leetcode.com/problems/insertion-sort-list/

package Week2;

import Week1.*;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {

        if(head==null){
            return null;
        }

        ListNode newNode = new ListNode(head.val);
        newNode.next = null;
        ListNode curr = head.next;
        ListNode l1 = newNode;
        l1.next = null;

        while(curr!=null){

            if(curr.val<=newNode.val){
                ListNode no = new ListNode(curr.val);
                no.next = l1;
                newNode = no;
            }

            else if(l1!=null && l1.next==null){
                l1.next = new ListNode(curr.val);
            }

            else if(l1!=null && l1.next!=null){

                while(l1!=null && l1.next!=null && l1.next.val<curr.val){
                    l1 = l1.next;

                }

                ListNode temp = new ListNode(curr.val);
                temp.next = l1.next;
                l1.next = temp;

            }

            curr = curr.next;
            l1 = newNode;
        }

        return newNode;

    }
}
