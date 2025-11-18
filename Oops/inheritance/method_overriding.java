package Oops.inheritance;

class parent
{
    void show()
    {
        System.out.println("Parent");
    }
}
class child extends  parent{
    void show()
    {
        System.out.println(" over ride the parent method ");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        child ob1=new child();
        ob1.show();
        System.out.println("Method overriding\n" +
                "runtime polymorphism");
    }
}
