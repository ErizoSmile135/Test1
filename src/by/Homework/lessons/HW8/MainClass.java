package by.Homework.lessons.HW8;

import by.Homework.lessons.HW8.employees.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "FirstName1", "LastName1", 20, 3000);
        Employee employee2 = new Employee(2, "FirstName2", "LastName2", 21, 3100);
        Employee employee3 = new Employee(3, "FirstName3", "LastName3", 22, 3200);
        Employee employee4 = new Employee(4, "FirstName4", "LastName4", 23, 3300);
        Employee employee5 = new Employee(5, "FirstName5", "LastName5", 24, 3400);
        Employee employee6 = new Employee(6, "FirstName6", "LastName6", 25, 3500);
        Employee employee7 = new Employee(7, "FirstName7", "LastName7", 26, 3600);
        Employee employee8 = new Employee(8, "FirstName8", "LastName8", 27, 3700);

        Map<Employee, String> employeeMap = new HashMap<>();
        //Профессии: Кондитер, Инженер, Антрополог
        employeeMap.put(employee1, "Кондитер");
        employeeMap.put(employee2, "Инженер");
        employeeMap.put(employee3, "Инженер");
        employeeMap.put(employee4, "Антрополог");
        employeeMap.put(employee5, "Инженер");
        employeeMap.put(employee6, "Кондитер");
        employeeMap.put(employee7, "Инженер");
        employeeMap.put(employee8, "Инженер");

        System.out.println(employeeMap);
        raiseSalaryForProfession(employeeMap, 200, "Инженер");
        System.out.println(employeeMap);
        //да, выводит как выводит но зато суммы сравнить легко

        //1.6
        System.out.println("**************s");
        HashMap<String, Collection<Employee>> stringCollectionHashMap = reMap(employeeMap);
        for (Map.Entry<String, Collection<Employee>> entry: stringCollectionHashMap.entrySet()){
            System.out.println(entry.getKey());
            entry.getValue().forEach(System.out::println);
        }

    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease, String prof){
        for (Map.Entry<Employee, String> employee: employees.entrySet()){
            if (employee.getValue().equals(prof)) employee.getKey().setSalary(employee.getKey().getSalary() + amountOfIncrease);
        }
    }

    private static HashMap<String, Collection<Employee>> reMap(Map<Employee, String> employees){
        HashMap<String, Collection<Employee>> resultMap = new HashMap<>();
        for (Map.Entry<Employee, String> employee: employees.entrySet()){
            //if (resultMap.isEmpty()){
            String profKey = employee.getValue();
            if (!resultMap.containsKey(employee.getValue()))
                resultMap.put(profKey, new ArrayList<>());

            resultMap.get(profKey).add(employee.getKey());
        }

        return resultMap;
    }
}
