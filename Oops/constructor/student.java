package Oops.constructor;

public class student {
    int marks;
    String name;
    public student()
    {
        System.out.println("Hello constructor is called ");
    }
    public student(int mark,String name)
    {
        this.marks=mark;
        this.name=name;

    }
    public static void main(String[] args) {
        System.out.println(" constructor ");
        student ob1=new student();
        System.out.println(ob1.marks);
        System.out.println(ob1.name);

        student ob2=new student(15,"Vijay");
        System.out.println(ob2.marks);
        System.out.println(ob2.name);
    }
}
