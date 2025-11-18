package zohosalem;

public class rev {
    public static void main(String[] args) {
        String a[] = {"dhoni","kohli","rahul","bumrah"};

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                ans.append(a[i]);
            } else {
                ans.append(new StringBuilder(a[i]).reverse());
            }
            if(i != a.length - 1) ans.append(" "); // separate words
        }

        System.out.println(ans); // Output: "inohd kohli luhar harmub"
    }
}
