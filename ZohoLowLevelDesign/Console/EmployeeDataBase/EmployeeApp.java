package ZohoLowLevelDesign.Console.EmployeeDataBase;
import java.util.*;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        Map<Employee, String> pendingManagers = new HashMap<>();

        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Designation: ");
            String desig = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Manager Name (leave blank if none): ");
            String mgrName = sc.nextLine();

            Employee emp = new Employee(name, age, desig, dept, null);
            service.addEmployee(emp);
            if (!mgrName.isEmpty()) pendingManagers.put(emp, mgrName);
        }

        // Link managers
        for (var entry : pendingManagers.entrySet()) {
            Employee emp = entry.getKey();
            Employee mgr = service.getEmployee(entry.getValue());
            if (mgr != null) emp.setManager(mgr);
        }

        // Main menu
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Show all records");
            System.out.println("2. Search / Update / Add records");
            System.out.println("3. Remove employee / Replace manager");
            System.out.println("4. Get records by manager");
            System.out.println("5. Show designation count");
            System.out.println("6. Show department count");
            System.out.println("7. Show manager and his employee count");
            System.out.println("8. Show hierarchy");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> service.printAllEmployees();
                case 2 -> handleSearchUpdateAdd(service, sc);
                case 3 -> handleRemoveReplace(service, sc);
                case 4 -> {
                    System.out.print("Manager Name: ");
                    String mgr = sc.nextLine();
                    List<Employee> list = service.getEmployeesUnderManager(mgr);
                    for (Employee e : list) System.out.println(e);
                }
                case 5 -> service.printCountByField("designation");
                case 6 -> service.printCountByField("department");
                case 7 -> service.printCountByField("manager");
                case 8 -> {
                    System.out.print("Enter top manager name: ");
                    String mgr = sc.nextLine();
                    Employee manager = service.getEmployee(mgr);
                    if (manager != null) service.printHierarchy(manager, "");
                    else System.out.println("Manager not found");
                }
                case 0 -> { sc.close(); return; }
                default -> System.out.println("Invalid option");
            }
        }
    }

    private static void handleSearchUpdateAdd(EmployeeService service, Scanner sc) {
        System.out.println("Search by field (name/age/designation/department/manager): ");
        String field = sc.nextLine();
        System.out.println("Operator: ");
        String op = sc.nextLine();

        if (field.equalsIgnoreCase("age")) {
            System.out.print("Enter number (or two numbers for between): ");
            String[] nums = sc.nextLine().split("\\s+");
            int[] values = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
            List<Employee> result = service.searchNumberField(field, op, values);
            result.forEach(System.out::println);
        } else {
            System.out.print("Enter value: ");
            String val = sc.nextLine();
            List<Employee> result = service.searchStringField(field, op, val);
            result.forEach(System.out::println);
        }

        System.out.println("Do you want to update/add? (update/add/no)");
        String action = sc.nextLine();
        if (action.equalsIgnoreCase("add")) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Designation: ");
            String desig = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Manager Name: ");
            String mgrName = sc.nextLine();
            Employee mgr = service.getEmployee(mgrName);
            service.addEmployee(new Employee(name, age, desig, dept, mgr));
        } else if (action.equalsIgnoreCase("update")) {
            System.out.print("Enter employee name to update: ");
            String name = sc.nextLine();
            Employee emp = service.getEmployee(name);
            if (emp != null) {
                System.out.print("New Age (enter to skip): ");
                String ageStr = sc.nextLine();
                if (!ageStr.isEmpty()) emp.setAge(Integer.parseInt(ageStr));
                System.out.print("New Designation (enter to skip): ");
                String desig = sc.nextLine();
                if (!desig.isEmpty()) emp.setDesignation(desig);
                System.out.print("New Department (enter to skip): ");
                String dept = sc.nextLine();
                if (!dept.isEmpty()) emp.setDepartment(dept);
                System.out.print("New Manager (enter to skip): ");
                String mgrName = sc.nextLine();
                if (!mgrName.isEmpty()) emp.setManager(service.getEmployee(mgrName));
            }
        }
    }

    private static void handleRemoveReplace(EmployeeService service, Scanner sc) {
        System.out.print("Enter employee name to remove or replace manager: ");
        String name = sc.nextLine();
        Employee emp = service.getEmployee(name);
        if (emp == null) { System.out.println("Not found"); return; }

        System.out.println("1. Remove employee");
        System.out.println("2. Replace manager");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) service.removeEmployee(name);
        else if (choice == 2) {
            System.out.print("Enter new manager name: ");
            String mgrName = sc.nextLine();
            Employee mgr = service.getEmployee(mgrName);
            if (mgr != null) emp.setManager(mgr);
        }
    }
}
