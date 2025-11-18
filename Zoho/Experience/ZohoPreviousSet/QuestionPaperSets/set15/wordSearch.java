package set15;
import java.util.*;
public class wordSearch {
    
    public static void main(String[] args) {
        String a="zohonxholoveorise";
        int row=4;
        int col=4;

        char [][]arr=new char[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=a.charAt(i*col+j);
            }
        }

        for(char [] ax:arr){
            for(char c: ax){
                System.out.print(c+" ");
            }
            System.out.println();
        }


      String[] word = {"van", "zoho", "love", "are", "is"};
    
      HashSet<String>ans=searchfunction(arr,word,row,col);
      System.out.println(ans);

    }
    public static HashSet<String> searchfunction(char [][]arr,String []diction , int r, int c){
        HashSet<String> ans=new HashSet<>();
        
        HashSet<String>dictionary=new HashSet<>();

        for(String k:diction){
            dictionary.add(k);
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){


                StringBuilder right=new StringBuilder();
                // right directionm 

                for(int k=j;k<c;k++){
                    right.append(arr[i][k]);
                    if(dictionary.contains(right.toString())){
                        ans.add(right.toString());
                    }
                }

                // left direction 
                StringBuilder down=new StringBuilder();
                  for(int k=i;k<r;k++){
                    down.append(arr[k][j]);
                    if(dictionary.contains(down.toString())){
                        ans.add(down.toString());
                    }
                }

            }
        }
        return ans;
    }
}
/*
public static HashSet<String> searchfunction(char [][]arr,String []diction , int r, int c){
    HashSet<String> ans = new HashSet<>();
    HashSet<String> dictionary = new HashSet<>(Arrays.asList(diction));

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            // right direction
            StringBuilder sb = new StringBuilder();
            for(int k=j;k<c;k++){
                sb.append(arr[i][k]);
                if(dictionary.contains(sb.toString())){
                    ans.add(sb.toString());
                }
            }

            // down direction
            sb.setLength(0);
            for(int k=i;k<r;k++){
                sb.append(arr[k][j]);
                if(dictionary.contains(sb.toString())){
                    ans.add(sb.toString());
                }
            }
        }
    }
    return ans;
}


 */