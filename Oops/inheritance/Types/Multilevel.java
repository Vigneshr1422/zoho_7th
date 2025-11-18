package Oops.inheritance.Types;

// multilevel
class Maths{
    void maths()
    {
        System.out.println("Math is the Super subject bro ");
    }
}

class Trigonometry extends Maths
{
        void trigonometry()
        {
            System.out.println("Trigonometry is easy");
        }
}
class problem extends Trigonometry{
    String a="Hi problem ";
    void solu()
    {
        System.out.println("Solution find");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        problem ob1=new problem();
        ob1.trigonometry();
        ob1.maths();

    }
}
