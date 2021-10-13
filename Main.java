package btvn_b4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CEO ceo = new CEO(10000.0);
        Manager manager = new Manager(7000.0);
        Employee employee1 = new Employee(2500.0);
        Employee employee2 = new Employee(2500.0);

        double totalSalary = ceo.getSalary() + manager.getSalary();

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        for (Employee emp : employees) {
            totalSalary += employee1.getSalary() + employee2.getSalary();
        }

        System.out.println("Total of salary in company: " + totalSalary);

    }
}
