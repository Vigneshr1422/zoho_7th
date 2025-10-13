package ConsoleApplications.EmployeeDataBase;
import java.util.*;

public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    private final Map<String, Employee> nameToEmp = new HashMap<>();
    /*
    nameToEmp map use panradhoda reason:

👉 Quick search by name.

List irundhaalum, oru employee name ku search panna full loop pannanum (O(n)).

Map la key = name, value = Employee store pannalum → get(name) kudutha immediate-aa kidaikum (O(1) average).

So nameToEmp map is just for fast lookup by employee name, nothing else. ✅
     */

    public void addEmployee(Employee e) {
        employees.add(e);
        nameToEmp.put(e.getName().toLowerCase(), e);
    }

    public void removeEmployee(String name) {
        Employee emp = nameToEmp.remove(name.toLowerCase());
        if (emp != null) {
            employees.remove(emp);
        }
    }

    public Employee getEmployee(String name) {
        return nameToEmp.get(name.toLowerCase());
    }

    public void printAllEmployees() {
        System.out.printf("%-15s %-3s %-15s %-12s %-15s%n",
                "Name", "Age", "Designation", "Department", "Manager");
        System.out.println("---------------------------------------------------------------------------");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    // Flexible search
    public List<Employee> searchStringField(String field, String operator, String value) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            String fValue = switch (field.toLowerCase()) {
                case "name" -> e.getName();
                case "designation" -> e.getDesignation();
                case "department" -> e.getDepartment();
                case "manager" -> e.getManager() != null ? e.getManager().getName() : "";
                default -> "";
            };

            boolean match = switch (operator.toLowerCase()) {
                case "equals" -> fValue.equalsIgnoreCase(value);
                case "notequals" -> !fValue.equalsIgnoreCase(value);
                case "contains" -> fValue.toLowerCase().contains(value.toLowerCase());
                case "notcontains" -> !fValue.toLowerCase().contains(value.toLowerCase());
                case "startswith" -> fValue.toLowerCase().startsWith(value.toLowerCase());
                case "endswith" -> fValue.toLowerCase().endsWith(value.toLowerCase());
                default -> false;
            };

            if (match) result.add(e);
        }
        return result;
    }

    public List<Employee> searchNumberField(String field, String operator, int... values) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            int fValue = switch (field.toLowerCase()) {
                case "age" -> e.getAge();
                default -> Integer.MIN_VALUE;
            };

            boolean match = switch (operator.toLowerCase()) {
                case "=" -> fValue == values[0];
                case "!=" -> fValue != values[0];
                case ">" -> fValue > values[0];
                case "<" -> fValue < values[0];
                case "between" -> fValue >= values[0] && fValue <= values[1];
                default -> false;
            };
            if (match) result.add(e);
        }
        return result;
    }

    public List<Employee> getEmployeesUnderManager(String managerName) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getManager() != null && e.getManager().getName().equalsIgnoreCase(managerName)) {
                result.add(e);
            }
        }
        return result;
    }

    public void printHierarchy(Employee manager, String indent) {
        System.out.println(indent + manager.getName());
        for (Employee e : getEmployeesUnderManager(manager.getName())) {
            printHierarchy(e, indent + "    ");
        }
    }

    public void printCountByField(String field) {
        Map<String, Integer> countMap = new HashMap<>();
        for (Employee e : employees) {
            String key = switch (field.toLowerCase()) {
                case "designation" -> e.getDesignation();
                case "department" -> e.getDepartment();
                case "manager" -> e.getManager() != null ? e.getManager().getName() : "None";
                default -> "";
            };
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }

        for (var entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
