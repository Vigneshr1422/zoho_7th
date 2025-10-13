package Pdf110;
import java.util.*;
public class No_80_relation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("No of member ");
        int n=in.nextInt();
        in.nextLine();

        String [][]arr=new String[n][2];

        for(int i=0;i<n;i++){
            String[] str=in.nextLine().split(" ");
            arr[i][0]=str[0];
            arr[i][1]=str[1];

        }

        String target=in.nextLine();
        String []s=target.split(" ");
        String tar=s[0];
        int level;
        if(s.length==2){
            level=Integer.parseInt(s[1]);
        }else{
            level=2;
        }

        Map<String,List<String>>map=new HashMap<>();

        for(String [] k:arr){
            String parent=k[0];
            String child=k[1];

            if(!map.containsKey(parent)){
                map.put(parent,new ArrayList<>());
            }
            map.get(parent).add(child);
        }

        Queue<String>qu=new LinkedList<>();
        qu.add(tar);
        int cl=0;

        while(!qu.isEmpty()&& cl<level){
            int size=qu.size();

            for(int i=0;i<size;i++){
                String parent=qu.poll();
                List<String>child=map.get(parent);
                if(child!=null){
                    qu.addAll(child);
                }
            }
            cl++;
        }

        System.out.println(qu);
        System.out.println(qu.size());
    }

}
