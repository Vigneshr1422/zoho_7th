package Zoho.Others;

public class Petrol_Bunk {
    public static void main(String[] args) {
        int petrol=2;
        int []dis={1,5,3};
        int []cap={6,4,2};


        for(int i=0;i<dis.length;i++)
        {
            petrol-=dis[i];
            if(petrol<0)
            {
                System.out.println("Out of fuel ");
            }
            petrol+=cap[i];
        }
        System.out.println(petrol);
    }
}
