package LinkedList;

public class InsertBeg {
    public static void main(String[] args) {
        lk ob1 = new lk();
        ob1.insert(15);
        ob1.insert(30);
        ob1.insert(45);
        ob1.insertBeg(1);
        ob1.display();
    }
}

class Nodee {
    int data;
    Nodee next;

    Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

class lk {
    Nodee head, tail;

    public void insert(int data) {
        Nodee n = new Nodee(data);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void insertBeg(int data) {
        Nodee n = new Nodee(data);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void display() {
        Nodee temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
