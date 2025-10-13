package LinkedList;

public class InsertPos {
    public static void main(String[] args) {
        linkedL ob1=new linkedL();
        ob1.insert(15);
        ob1.insert(30);
        ob1.insert(45);

        ob1.insertPos(2,50);
        System.out.println("Display");
        ob1.display  ();
        ob1.deletebeg();
        System.out.println("After delete");
        ob1.display();
        System.out.println("Delete 2nd");
        ob1.deletePos(2);
        ob1.display();


    }
}
class Node_{
    int data;
    Node_ next;

    Node_(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class linkedL{
    Node_ head,tail;
    public void insert(int data)
    {
        Node_ n=new Node_(data);
        if(head==null)
        {
            tail=head=n;
        }else
        {
            tail.next=n;
            tail=n;
        }
    }

    public void display()
    {
        Node_ temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public  void insertPos(int pos, int data)
    {
        Node_ n=new Node_(data);

        Node_ temp=head;

        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }


    public void deletebeg()
    {
        head=head.next;
    }
    public void deletePos(int pos)
    {
        Node_ t =head;
        for(int i=0;i<pos-1;i++)
        {
            t=t.next;
        }
       // System.out.println(t.data);
        t.next=t.next.next;

    }
}
