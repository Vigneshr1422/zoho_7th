
import java.util.*;
public class relation {
    public static void main(String[] args) {
        HashMap<String , List<String>> map=new HashMap<>();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String [][]arr=new String[n][2];

        for(int i=0;i<n;i++)
        {
            String input=in.nextLine();
            String []part=input.split(",");
            arr[i][0]=part[0];
            arr[i][1]=part[1];
        }

        for(String []a:arr)
        {
            for(String x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
                    System.err.println("Target ");
                    String tar=in.nextLine();

                for(String []pair:arr){
                    String child=pair[0];
                    String parent=pair[1];


                    if(!map.containsKey(parent)){
                        map.put(parent, new ArrayList<>());
                    }
                    map.get(parent).add(child);
                }

            List<String>parentchild=map.get(tar);
                int count=0;

            if(!(parentchild==null)){
                for(String child:parentchild){
                    List<String>childparent=map.get(child);
                    if(!(childparent==null)){
                        for(String a:childparent){
                            System.out.print(a+" ");
                            count++;
                        }
                    }else{
                        System.out.println("null");
                    }
                }
            }else{
                System.out.println("null");
            }

            System.out.println("Count"+count);

    }
}
