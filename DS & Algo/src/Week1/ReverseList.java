package Week1;

public class ReverseList {

        static boolean flag = false;
        ListNode newNode = null;
        public ListNode reverseList(ListNode head) {

            if(head==null)
                return head;

            return returnList(head,head);
        }

        public ListNode returnList(ListNode head1,ListNode head){

            if(head.next == null){
                this.newNode = head;
                return head;
            }
            ListNode newHead = returnList(head1,head.next);
            newHead.next = head;
            newHead = newHead.next;
            if(newHead == head1){
                newHead.next = null;
                return this.newNode;
            }
            return newHead;
        }
    }

