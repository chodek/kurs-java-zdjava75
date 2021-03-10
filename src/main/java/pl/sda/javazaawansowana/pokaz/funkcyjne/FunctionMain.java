package pl.sda.javazaawansowana.pokaz.funkcyjne;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {

        Function<Employee, String> employeeToString = (employee) -> employee.getName();

        List<Employee> employees = Arrays.asList(new Employee("jeden"), new Employee("dwa"));

        showEmployee(employees, employeeToString);

    }

    private static void showEmployee(List<Employee> employees, Function<Employee, String> employeeToString) {
        for (Employee employee : employees) {
            System.out.println(employeeToString.apply(employee));
        }
    }


    private static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
