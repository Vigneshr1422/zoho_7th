package set7;

public class phone_combinatin {
    public static void main(String[] args) {
        String num="13";
        function(num,0,"");
    }

 
    

    public static void function(String str,int index,String ans){
      String []map={
            "","","ABC","DEF",
            "GHI","JKL","MNO",
            "PQRS","TUV","WXYZ"
        };
        if(index==str.length()){
            System.out.println(ans);
            return;
        }

        int x=str.charAt(index)-'0';

        if(map[x].isEmpty()){
            function(str, index+1, ans);
        }else{
        for(char c:map[x].toCharArray() ){
            function(str, index+1, ans+c);
        }
    }
}



    }
    

