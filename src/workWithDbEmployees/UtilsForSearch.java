package workWithDbEmployees;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
    Creating UtilsForSearch class which will declare methods
    for searching the database.
 */

public class UtilsForSearch {

    // Searching by Id employee
    public List<Employee> searchById(Integer id, List<Employee> listEmployees) {

        List<Employee> searchEmployee = new ArrayList<>();

        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getId(), id)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    // Searching by name employee
    public List<Employee> searchByName(String name, List<Employee> listEmployees) {

        List<Employee> searchEmployee = new ArrayList<>();

        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getName(), name)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    // Searching by surname employee
    public List<Employee> searchBySurname(String surname, List<Employee> listEmployees) {

        List<Employee> searchEmployee = new ArrayList<>();

        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getSurname(), surname)) {
//                if (employee.getSurname() != null && employee.getSurname().equals(surname)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    // Searching by position employee
    public List<Employee> searchByPosition(String position, List<Employee> listEmployees) {

        List<Employee> searchEmployee = new ArrayList<>();

        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getPosition(), position)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    // Searching by salary employee
    public List<Employee> searchBySalary(Integer salary, List<Employee> listEmployees) {

        List<Employee> searchEmployee = new ArrayList<>();

        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getSalary(), salary)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }
}

