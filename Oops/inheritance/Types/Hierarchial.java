package Oops.inheritance.Types;

import org.w3c.dom.ls.LSOutput;

// multilevel
class Science{
    void sub()
    {
        System.out.println("Science is the Super subject bro ");
    }
}

class Physics extends Science
{
    void Dynamics()
    {
        System.out.println("Dynamics is easy");
    }
}
class Equation extends Science{
    String a="Hi Equation ";
    void answer()
    {
        System.out.println("Answer find");
    }
}

// new diff class

class social extends Science {  // super class only extends
    String a="Hi hello Hierarchical";

}



public class Hierarchial {
    public static void main(String[] args) {
        social ob1=new social();
        System.out.println(ob1.a);


// this is combination of Hierarchical and Multilevel
    }
}
