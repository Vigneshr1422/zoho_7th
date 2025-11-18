package Oops.Abstraction;
abstract  class vehicle{
 abstract  void speed();
 void brand()
 {
     System.out.println("this is not abstract");
 }

}

class bike extends vehicle{
    void speed()
    {
        System.out.println("25kmpr");
    }

}

class car extends  vehicle{
    @Override
    void speed() {

    }
}
public class abstract_ {
    public static void main(String[] args) {

    }
}
