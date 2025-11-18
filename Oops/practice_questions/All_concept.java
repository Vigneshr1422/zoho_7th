package Oops.practice_questions;
class person
{
    private int age;
    private String name;

    person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public String getname()
    {
        return name;
    }
    public  void setName(String name)
    {
        this.name=name;
    }

    public void showDetails()
    {
        System.out.println(" Person name: "+name+" Age : "+age);
    }
}

class student extends person{
    private String dep;
    private int mark;

    public  student(String name,int age, String department , int mark)
    {
        super(age,name);
        this.dep=department;
        this.mark=mark;
    }

    public void showDetails()
    {
        System.out.println("Name"+getname()+"" +
                "Dept"+dep+" " +
                "Mark "+mark);
    }

}
public class All_concept {
    public static void main(String[] args) {
    person ob1=new person(21,"Vignesh");
    ob1.showDetails();
    student ob2=new student("Vignesh",22,"MCA",96);
    ob2.showDetails();
    }
}
