package LinkedList;
class Node{
    int data;
    Node next;

    Node (int data)
    {
        this.data=data;
    }
}
class LinkedList{

    Node head,tail;
    public void insert(int data)
    {
        Node n=new Node(data);

        if(head==null){// first node
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }

    public void display()
    {
        if(head==null) {
            System.out.println("Empty da ");
        }else{
            Node t = head;
            while (t != null) {
                System.out.println(t.data);
                t = t.next;
            }
        }
    }

    public void insertBeg(int val)
    {
        Node n=new Node(val);
        n.next=head;
        head=n;
    }

    public void  insertAtPosition(int pos, int data)
    {
        Node n=new Node(data);

        if(pos==0){
            n.next=head;
            head=n;
            return;
        }


        Node temp=head;
        for(int i=0;i<pos-1 && temp!=null;i++)
        {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("odra");
            return;
        }

        n.next=temp.next;
        temp.next=n;


    }

    public void deletebeg()
    {
        head=head.next;

    }
    public void deleteEnd()
    {
        Node temp= head;
        while(temp!=tail)
        {
            temp=temp.next;

        }
        temp.next=null;
        tail=null;
    }

}
public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList ob1=new LinkedList();
        ob1.insert(10);
        ob1.insert(20);
        ob1.insert(30);
        ob1.insertBeg(50);
        ob1.display();
        ob1.insertAtPosition(2,99);
        System.out.println("Hi bro");

        ob1.deletebeg();
        ob1.display();

        ob1.deleteEnd();


    }
}
