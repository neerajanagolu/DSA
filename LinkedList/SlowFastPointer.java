package LinkedList;

public class SlowFastPointer {
    public static void remove_loop(ListNode head,ListNode fast)
    {
        ListNode slow=head;
        while(fast.next!=slow.next)
        {
            slow=slow.next;
            fast=fast.next;

        }
        fast.next=null;
    }

    public static boolean flyods_cycle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!= null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {

                remove_loop(head,fast);
                return true;
            }
        }

        return false;
    }
    public static ListNode findMiddle(ListNode head)
    {
        if(head==null)
            return head;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!= null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
    return slow;

    }
    public static void main(String [] args)
    {
        LinkedList l=new LinkedList();
        l.insertAtHead(10);
        l.insertAtHead(20);


        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(50);
        ListNode mid = findMiddle(l.head);
        System.out.println(mid.data);
        System.out.println(flyods_cycle(l.head));

        //System.out.println(findMiddle(l.head));


    }
}
