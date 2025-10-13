package Pdf110;

import java.util.*;

public class No_41_AfterConsecutive {

        public static void main(String[] args) {
            int[] bits = {1,0,1,1,0,1,1,0,1,1,1,1};
            int k = 2;

            List<Integer> result = new ArrayList<>();
            for(int b : bits) result.add(b);

            int count=0;
            for (int bit : bits) {
                result.add(bit);
                if (bit == 1) {
                    count++;
                    if (count == k) {
                        result.add(0);  // insert 0 after K consecutive 1s
                        count = 0;      // reset counter
                    }
                } else {
                    count = 0;  // reset if 0 found
                }
            }

            // print final list
            System.out.println(result);
        }
    }


