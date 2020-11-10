//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package Week1;

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {

        //checking if head equals null
        if(head!=null){
            //assigning the node to be traversed to the head
            ListNode current = head;

            while(current!=null){
                //if next value equals current and next of next is not null we just move the pointer to next of next
                if(current.next!=null && current.val == current.next.val && current.next.next!=null){
                    current.next = current.next.next;
                }
                //if next value equals current and next of next is null we just make next null
                else if(current.next!=null && current.val == current.next.val && current.next.next==null){
                    current.next = null;
                }
                //move to the next pointer
                else{
                    current = current.next;
                }

            }
            // returning head after changes
            return head;
        }
        // if head equals null return null
        else{
            return null;
        }
    }
}

