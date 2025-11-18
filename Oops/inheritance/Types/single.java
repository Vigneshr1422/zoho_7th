package Oops.inheritance.Types;
// One super class one subclass single inheritance
class vehicle
{
    void types()
    {
        System.out.println("There are two types ");
    }

}

class bike extends  vehicle
{
    void model()
    {
        System.out.println("This is DIO Ultra fast ");
    }
}
public class single {
    public static void main(String[] args) {
    bike ob1=new bike();
    ob1.types();
    ob1.model();
    }
}
