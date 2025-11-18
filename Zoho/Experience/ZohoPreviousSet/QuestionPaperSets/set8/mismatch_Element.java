package set8;

public class mismatch_Element {
    public static void main(String[] args) {
     String[] arr1 = {"a","b","c","d","e","f","g","h","i"};
     String[] arr2 = {"ab","de","eg","gi","i"};

     for(String s1:arr1){
        boolean match=true;

        for(String s2:arr2){
            if(s2.contains(s1)){
                match=false;
                break;
            }
            
        }
        if(match){
                System.out.print(s1+" ");
            }

     }
    }
    
}
