package Zoho.Others;

import java.util.*;

/*
✅ Start the Program
You see the menu:

markdown
Copy
Edit
1. Put
2. Get
3. Display
4. Exit
👇 Step-by-Step Inputs and Outputs
➤ Input 1:
yaml
Copy
Edit
1
Enter key: 1
Enter value: 100
➤ Input 2:
yaml
Copy
Edit
1
Enter key: 2
Enter value: 200
(Repeat this up to key 10...)

➤ Input 10:
yaml
Copy
Edit
1
Enter key: 10
Enter value: 1000
✅ Now the cache has these 10 key-value pairs:

rust
Copy
Edit
1 -> 100
2 -> 200
3 -> 300
...
10 -> 1000
➤ Now display:
Copy
Edit
3
Output:

vbnet
Copy
Edit
Current Cache
Key 1 Value 100
Key 2 Value 200
...
Key 10 Value 1000
🔥 Add one more key → triggers LRU eviction
➤ Input:
yaml
Copy
Edit
1
Enter key: 11
Enter value: 1100
➡ Cache size is now more than 10, so it removes least recently used, which is key 1.

➤ Now display again:
Copy
Edit
3
Output:

vbnet
Copy
Edit
Current Cache
Key 2 Value 200
Key 3 Value 300
...
Key 10 Value 1000
Key 11 Value 1100
✔️ Key 1 is removed. Key 11 added.

👀 Let’s test access (Get):
➤ Input:
vbnet
Copy
Edit
2
Enter key to access: 3
Output:

makefile
Copy
Edit
Value: 300
Now key 3 becomes most recently used.

➤ Add another key:
yaml
Copy
Edit
1
Enter key: 12
Enter value: 1200
Now the least recently used is key 2 (since we accessed 3), so key 2 will be removed.

➤ Display:
Copy
Edit
3
Output:

vbnet
Copy
Edit
Current Cache
Key 4 Value 400
Key 5 Value 500
...
Key 11 Value 1100
Key 3 Value 300
Key 12 Value 1200
✅ Key 2 is gone. Key 3 stayed because we accessed it.
 */
public class LruCache {
    private final int capacity=10;
    private LinkedHashMap<Integer,Integer> cache;

    public LruCache()
    {
        cache = new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry eldest)
            {
                return size()>capacity;
            }
        };
    }

    public int get(int key)
    {
        return cache.getOrDefault(key,-1);
    }
    public void put(int key , int value)
    {
        cache.put(key,value);
    }

    public void display()
    {
        System.out.println("Current Cache");
        for(Integer k:cache.keySet())
        {
            System.out.println("Key "+k+" Value "+cache.get(k));
        }
    }

    public static void main(String[] args) {
        LruCache ob=new LruCache();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Put\n2. Get\n3. Display\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int key = sc.nextInt();
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    ob.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter key to access: ");
                    int getKey = sc.nextInt();
                    int result = ob.get(getKey);
                    if (result != -1)
                        System.out.println("Value: " + result);
                    else
                        System.out.println("Key not found!");
                    break;

                case 3:
                    ob.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

