package Oops.Encapsulation;
//class demo
//{
//    int age=23;
//
//}

//public class Encapsu_ {
//    public static void main(String[] args) {
//        demo ob1=new demo();
//        System.out.println(ob1.age);
//        ob1.age=55;
//        System.out.println(ob1.age);
//
//    }
//}
class encaps{
    private int num=25;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        System.out.println("Changed");
    }
}


public class Encapsu_ {
    public static void main(String[] args) {
        encaps ob1=new encaps();
//        ob1.num=15;
        ob1.setNum(15);
        ob1.getNum();


    }
}
