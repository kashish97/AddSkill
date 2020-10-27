package Week1;

public class RemoveLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {

        //Check if head not equals null
        if(head!=null){
            if(head.val==val){
                //moving head to next till the value is equal to the target
                while(head!=null && head.val==val){
                    head = head.next;
                }
            }
            //assigning traversing node to the head
            ListNode current = head;

            while(current!=null){
                // if value is same and next of next not equals null so as to keep next
                if(current.next!=null && current.next.val==val && current.next.next!=null){
                    current.next = current.next.next;
                }
                //if value is same and next of next equals null so we can make next as null
                else if(current.next!=null && current.next.val==val && current.next.next==null){
                    current.next = null;
                }
                //else moving to the next node
                else{
                    current = current.next;
                }
            }

            return head;
        }
        // if head equals null return null
        else{
            return null;
        }
    }
}