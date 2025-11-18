package Oops.Polymorphism;
class overload{
    void sum()
    {
        System.out.println("cmethod overloading \n" +
                "Compile time polymorphism          ");
        System.out.println("Jumkalakka");
    }
    void sum(int a,int b)
    {
        System.out.println("Sum "+a+b);

    }
    void sum(int a)
    {
        System.out.println("Squre"+a*a);
    }
}
public class methodoberloading
{
    public static void main(String[] args) {
        overload ob1=new overload();
        ob1.sum();
        ob1.sum(9);
        ob1.sum(25,55);
    }
}


