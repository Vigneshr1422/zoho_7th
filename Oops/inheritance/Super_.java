package Oops.inheritance;
//class animal
//{
//        animal(String name)
//        {
//            System.out.println("Parent class  constructor");
//        }
//
//        void makeSound()
//        {
//            System.out.println("Hi da ");
//        }
//}
//class dog extends animal{
//    dog()
//    {
//        super("dog");
//        super.makeSound();
//        System.out.println("Child class constructor");
//    }
//}



class person{

    String name;
    person(String name)
    {
        this.name=name;
        System.out.println(name);
    }
}
class Employee extends person{
    Employee()
    {
        super("Vignesh");



    }
}

public class Super_ {
    public static void main(String[] args) {
//        dog ob1=new dog();
        Employee ob1=new Employee();




    }
}