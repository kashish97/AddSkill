package Week1;

public class AddNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryForward = 0;
        ListNode l3 = new ListNode();

        while(l1.next!=null && l2.next!=null){
            if(l1.val+l2.val<=9){
                l3.val = l1.val+l2.val;
            }
            else{
                l3.val = (l1.val+l2.val)%10;
                carryForward = (l1.val+l2.val)/10;
            }
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }

        return l3;
    }
}
