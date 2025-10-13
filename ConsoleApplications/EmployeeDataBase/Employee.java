package ConsoleApplications.EmployeeDataBase;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private String department;
    private Employee manager;

    public Employee(String name, int age, String designation, String department, Employee manager) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.department = department;
        this.manager = manager;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public Employee getManager() { return manager; }
    public void setManager(Employee manager) { this.manager = manager; }

    @Override
    public String toString() {
        return String.format("%-15s %-3d %-15s %-12s %-15s",
                name, age, designation, department,
                manager != null ? manager.getName() : "None");
    }
}
/*
Sample Input

We’ll create 5 employees for demonstration:

Name	Age	Designation	Department	Manager
Ramesh	50	CEO	Management	None
Suresh	40	Manager	IT	Ramesh
Anita	42	Manager	HR	Ramesh
Vijay	25	Developer	IT	Suresh
Kiran	28	Tester	IT	Suresh
Step 1: Show all records (Option 1)

Input:

1


Output:

Name            Age Designation     Department   Manager
---------------------------------------------------------------------------
Ramesh          50  CEO             Management  None
Suresh          40  Manager         IT          Ramesh
Anita           42  Manager         HR          Ramesh
Vijay           25  Developer       IT          Suresh
Kiran           28  Tester          IT          Suresh

Step 2: Search employee (Option 2)

Input:

2
Search by field: name
Operator: contains
Enter value: vi


Output:

Vijay          25  Developer       IT          Suresh


Then add/update prompt → Skip for now.

Step 3: Get employees under manager Suresh (Option 4)

Input:

4
Manager Name: Suresh


Output:

Vijay          25  Developer       IT          Suresh
Kiran          28  Tester          IT          Suresh

Step 4: Show designation count (Option 5)

Input:

5


Output:

CEO -> 1
Manager -> 2
Developer -> 1
Tester -> 1

Step 5: Show department count (Option 6)

Input:

6


Output:

Management -> 1
IT -> 3
HR -> 1

Step 6: Show manager and employee count (Option 7)

Input:

7


Output:

None -> 1
Ramesh -> 2
Suresh -> 2

Step 7: Show hierarchy (Option 8)

Input:

8
Enter top manager name: Ramesh


Output:

Ramesh
    Suresh
        Vijay
        Kiran
    Anita

Step 8: Remove employee or replace manager (Option 3)

Input:

3
Enter employee name to remove or replace manager: Kiran
1


Output:

Kiran removed successfully

Step 9: Exit

Input:

0


✅ This demonstrates all main features:

Show table

Flexible search

Hierarchy display

Counts by designation, department, manager

Remove / replace manager

If you want, I can also prepare a full interactive session screenshot-style input/output with Add, Update, Search combined, showing string & numeric operators like >, <, contains, between, etc., so you can test it exactly like Zoho LLD style.

Do you want me to do that?

ChatGPT can make mistakes.
 */