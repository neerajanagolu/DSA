package LinkedList;

class DoubleListNode {

    int data;
    DoubleListNode next;
    DoubleListNode prev;
    DoubleListNode(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}
class DoubleLinkedList
{
    private DoubleListNode head;
    private DoubleListNode tail;

    public void insertAtHead(int data)
    {
        DoubleListNode newNode=new DoubleListNode(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            return;
        }
       newNode.prev=head;
        newNode.next=head.next;
        head=newNode;
        return;
    }

    public void insertAtTail(int data)
    {
        DoubleListNode newNode=new DoubleListNode(data);

        if(head==null)
        {

            head=newNode;
            tail=newNode;
            return;

        }
       newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;

        return;
    }
public void deleteByVal(int data)
{
    DoubleListNode temp=head;
    while(temp.next!=null)
    {
        if(temp.data==data)
        {
            System.out.println(data+" is deleted");
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            return;
        }
        temp=temp.next;

    }
    System.out.println(data+"  not found for deletion");
    return;
}
public void traversePrint()
{
    DoubleListNode temp=head;
    if(head==null)
    {
        System.out.println("empty head");
        return;
    }
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
    DoubleListNode temp=head;
    if(head==null)
    {
        System.out.println("empty head");
        return;
    }
    while(temp.next!=null)
    {
        if(temp.data==data)
        {
            System.out.println(data+" is found");
            return;
        }
        temp=temp.next;
    }
    System.out.println(data+" Not found..!");
    return;

}

    public static void main(String [] args)
    {
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.insertAtHead(10);
       // dl.insertAtHead(11);
        dl.insertAtTail(20);
        dl.insertAtTail(2);
        dl.insertAtTail(210);
        dl.insertAtTail(90);
        dl.insertAtTail(140);
        dl.traversePrint();
        dl.deleteByVal(120);
        dl.traversePrint();
        dl.searchEle(90);


    }
}
