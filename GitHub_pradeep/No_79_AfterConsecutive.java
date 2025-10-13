package GitHub_pradeep;

import java.util.ArrayList;
import java.util.List;

public class No_79_AfterConsecutive {

        public static void main(String[] args) {
            int[] bits = {1,0,1,1,0,1,1,0,1,1,1,1};
            int K = 2;

            List<Integer> list = new ArrayList<>();
            for(int b : bits) list.add(b);

            int i = 0;
            while(i <= list.size() - K) {
                boolean allOnes = true;
                for(int j = 0; j < K; j++) {
                    if(list.get(i + j) != 1) {
                        allOnes = false;
                        break;
                    }
                }

                if(allOnes) {
                    list.add(i + K, 0); // insert 0 after K ones
                    i++; // move 1 step for overlapping
                }
                i++;
            }

            // print final list
            System.out.println(list);
        }
    }


