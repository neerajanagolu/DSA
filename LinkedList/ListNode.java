package LinkedList;

class ListNode {
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data=data;
        this.next=null;
    }

}
class LinkedList
{
    ListNode head;


    public void insertAtHead(int data)
    {
        ListNode newNode=new ListNode(data);
       // newNode.next=head;
        if(head==null)
        {
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;

        return;
    }
    public void insertAtEnd(int data)
    {
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
            return;

        }
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;

    }
    void deleteByValue(int data)
    {
        if(head==null)
            return;
        if(head.data==data)
        {
            System.out.println(head.data+"deleted...!");
            head=head.next;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null)
        {   if(temp.next.data==data)
            {
                System.out.println(temp.next.data+" deleted...!");

                temp.next=temp.next.next;
                return;


             }
             temp=temp.next;


        }
        System.out.println(data+" Not found");
        return;

    }
    public void traversePrint()
    {
        if(head==null)
        {
            System.out.println("head is null");
            return;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

        return;
    }
    public void searchEle(int data)
    {
        if(head==null)
        {
            System.out.println("head is null");
            return;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                System.out.println(data+"  is found..!");
                return;
            }
            temp=temp.next;
        }
        System.out.println(data+"  is  not found..!");
        return;

    }

    public static void main(String [] args)
    {
        LinkedList l=new LinkedList();
        l.insertAtHead(10);
        l.insertAtHead(20);
        l.traversePrint();
      //  System.out.println();
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(50);
        l.traversePrint();
       // System.out.println();

        l.deleteByValue(40);
        l.traversePrint();
       // System.out.println();
        l.searchEle(100);
        l.traversePrint();
        ListNode h=reverseList(l.head);
      ListNode temp=h;
      while(temp!=null)
      {
          System.out.print(temp.data+" ");
          temp=temp.next;
      }
        ListNode hh= reverseRecursion(l.head);


    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; // store next
            curr.next = prev;              // reverse link
            prev = curr;                   // move prev
            curr = nextNode;               // move curr
        }
        return prev; // new head
    }
    public static ListNode reverseRecursion(ListNode head)
    {
        if(head==null || head.next==null)
            return head;


        ListNode newHead=reverseRecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }


}
