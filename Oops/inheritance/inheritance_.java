package Oops.inheritance;
class laptop{
    String name="DELL";
    public int num(int k)
    {
        System.out.println("Number is "+k);
        return k;
    }

}
class Animal extends  laptop{
    String animal="dog";

}
public class inheritance_ {
    public static void main(String[] args) {
    Animal ob1=new Animal();
        System.out.println(ob1.animal);
        System.out.println(ob1.name);
        System.out.println(ob1.num(155));
    }
}
