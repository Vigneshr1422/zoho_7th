package Zoho.Experience.ZohoPreviousSet.DriveSet.Set20;

public class Server_connect {
    public static void main(String[] args) {
        int [][]arr1={
                {1,0},
                {1,1}
        };
        int [][]arr2={
                {1, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        ServerFunction(arr1);
        ServerFunction(arr2);
    }
    public static  void ServerFunction(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        int []r=new int[n];
        int []c=new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1){
                    r[i]++;
                    c[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1 &&  (r[i]>1 || c[j]>1) ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
/*'
Sure da 😎, ippo unga **Server_connect** program-ku proper **input example** kuduren, row-by-row **Thanglish** explanation-um kudhuren.

---

## 🔹 Example 1 (2×2 grid)

```java
int [][]arr1 = {
    {1, 0},
    {1, 1}
};
```

**Matrix view:**

|    | C0 | C1 |
| -- | -- | -- |
| R0 | 1  | 0  |
| R1 | 1  | 1  |

### Step-by-step:

1. **Row counts:**

   * Row0 = 1
   * Row1 = 2

2. **Column counts:**

   * Col0 = 2
   * Col1 = 1

3. **Check communication:**

   * (0,0) → row0=1, col0=2 → communicates ✅
   * (0,1) → 0 → skip
   * (1,0) → row1=2, col0=2 → communicates ✅
   * (1,1) → row1=2, col1=1 → communicates ✅

**Output:**

```
3
```

---

## 🔹 Example 2 (4×4 grid)

```java
int [][]arr2 = {
    {1, 1, 0, 0},
    {0, 0, 1, 0},
    {0, 0, 1, 0},
    {0, 0, 0, 1}
};
```

**Matrix view:**

|    | C0 | C1 | C2 | C3 |
| -- | -- | -- | -- | -- |
| R0 | 1  | 1  | 0  | 0  |
| R1 | 0  | 0  | 1  | 0  |
| R2 | 0  | 0  | 1  | 0  |
| R3 | 0  | 0  | 0  | 1  |

### Step-by-step:

1. **Row counts:**

   * R0=2, R1=1, R2=1, R3=1

2. **Column counts:**

   * C0=1, C1=1, C2=2, C3=1

3. **Check communication:**

   * (0,0) → row>1 ✅
   * (0,1) → row>1 ✅
   * (1,2) → col>1 ✅
   * (2,2) → col>1 ✅
   * (3,3) → alone ❌

**Output:**

```
4
```

---

### 🔹 Summary Table

| Grid       | Communicating Servers |
| ---------- | --------------------- |
| `arr1` 2x2 | 3                     |
| `arr2` 4x4 | 4                     |

---

If you want, I can make **Scanner input version**, so **user can type any grid at runtime**, instead of hardcoding arr1/arr2.

Do you want me to do that?

 */