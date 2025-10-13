package Pdf110;

public class No_111_sortedArrayMerge {
    public static void main(String[] args) {
    int []arr1={2,4,6,8,10,12};
    int []arr2={2,4,6,7,9,11,12};

    MergePrint(arr1,arr2);
    }

    public static void MergePrint(int []arr1,int []arr2){
        int n= arr1.length;
        int m=arr2.length;

        int i=0;
        int j=0;
        int merge=Integer.MIN_VALUE;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(arr1[i]!=merge){
                    System.out.print(arr1[i]+" ");
                    merge=arr1[i];
                }
                i++;

            }else if(arr1[i]>arr2[j]){

                if(arr2[j]!=merge){
                    System.out.print(arr2[j]+" ");
                    merge=arr2[j];
                }
                j++;
            }else
            {
                if(arr1[i]!=merge){
                    System.out.print(arr1[i]+" ");
                    merge=arr1[i];
                }

                i++;
                j++;
            }
        }

        while(i<n){
            if(arr1[i]!=merge){
                System.out.print(arr1[i]+" ");
                merge=arr1[i];
            }
            i++;
        }

        while(j<m){
            if(arr2[j]!=merge){
                System.out.print(arr2[j]+" ");
                merge=arr2[j];
            }
            j++;
        }
    }
}
