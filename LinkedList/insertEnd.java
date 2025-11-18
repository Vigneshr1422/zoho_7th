//package LinkedList;
//
//import java.util.Scanner;
//
//public class insertEnd {
//
//    public  static  void main(String[] args) {
//        linkedList ob1 = new linkedList();
//      Scanner in=new Scanner(System.in);
//      for(int i = 0; i<6; i++)
//      {
//          int k=in.nextInt();
//          ob1.insert(k);
//      }
//      ob1.display();
//    }
//}
//    class Node{
//        int data;
//        Node next;
//        Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }
//    class linkedList{
//        Node head,tail;
//        public void insert(int data)
//        {
//            Node n=new Node(data);
//            if(head==null){
//                tail=head=n;
//            }else
//            {
//                tail.next=n;
//                tail=n;
//            }
//        }
//
//        public void display()
//        {
//            Node temp=head;
//            while(temp!=null){
//                System.out.println(temp.data);
//                temp=temp.next;
//            }
//        }
//    }
