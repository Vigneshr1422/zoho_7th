    package set17;
    import java.util.*;
    class cache<k,v> extends LinkedHashMap<k,v>{
        private final int capacity;

        public cache(int capacity){
            // true = access-order (not insertion order)
            super(capacity,0.75f,true);
            this.capacity=capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<k,v> eldest){
            // if size exceeds capacity → remove eldest entry
            return size()>capacity;
        }
    }


    public class lru_cache {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();   // cache size (capacity)
        cache<Integer,String> ob1=new cache(n);
        in.nextLine(); // to consume \n

        // put n entries into cache
        for(int i=0;i<n;i++){
            ob1.put(i,in.nextLine());
        }

        System.out.println(ob1); // print cache

        // accessing keys changes their "recently used" order
        ob1.get(5);
        ob1.get(4);
        System.out.println(ob1);

        ob1.get(3);
        ob1.put(11, "paradise"); // new insert, so eldest entry removed
        System.out.println(ob1);
    } 
    }
