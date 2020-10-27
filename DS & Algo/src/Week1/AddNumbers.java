//https://leetcode.com/problems/add-two-numbers/submissions/
package Week1;

public class AddNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Carryforward variable to be added if sum is greater than 9
        int carryForward = 0;
        //New number formed after adding
        ListNode l3 = new ListNode();
        //head of new number linked list
        ListNode curr = l3;

        while(l1!=null && l2!=null){

            //adding and getting unit digit of number to the new list
            l3.val = (l1.val+l2.val+carryForward)%10;
            // tens digit got to the carryforward
            carryForward = (l1.val+l2.val+carryForward)/10;
            //traversing 1 step ahead of both the lists
            l1 = l1.next;
            l2 = l2.next;
            //if any list is not reached towards end creating new node at the end of the new list
            if(l1!=null || l2!=null){
                l3.next = new ListNode();
                l3 = l3.next;
            }
        }

        // if 1st list was not reached till end repeat the same above procedure with it
        if(l1!=null){
            while(l1!=null){
                l3.val = (l1.val+carryForward)%10;
                carryForward = (l1.val+carryForward)/10;
                l1 = l1.next;

                if(l1!=null){
                    l3.next = new ListNode();
                    l3 = l3.next;
                }
            }
        }

        // if 2nd list was not reached till end repeat the same process
        else if(l2!=null){
            while(l2!=null){
                l3.val = (l2.val+carryForward)%10;
                carryForward = (l2.val+carryForward)/10;
                l2 = l2.next;

                if(l2!=null){
                    l3.next = new ListNode();
                    l3 = l3.next;
                }
            }
        }

        //if carryforward is greater than 0 create a new node and add the carryforward to it
        if(carryForward>0){
            l3.next = new ListNode(carryForward);
        }

        //return the head of the new list
        return curr;
    }
}
