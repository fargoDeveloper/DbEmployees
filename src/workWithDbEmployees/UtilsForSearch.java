package workWithDbEmployees;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UtilsForSearch {

    public List<Employee> searchById(Integer id, List<Employee> listEmployees) {
        List<Employee> searchEmployee = new ArrayList<>();
        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getId(), id)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    public List<Employee> searchByName(String name, List<Employee> listEmployees) {
        List<Employee> searchEmployee = new ArrayList<>();
        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getId(), name)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    public List<Employee> searchBySurname(String surname, List<Employee> listEmployees) {
        List<Employee> searchEmployee = new ArrayList<>();
        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getId(), surname)) {
//                if (employee.getSurname() != null && employee.getSurname().equals(surname)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

    public List<Employee> searchByPosition(String position, List<Employee> listEmployees) {
        List<Employee> searchEmployee = new ArrayList<>();
        for (Employee employee : listEmployees) {
            if (Objects.equals(employee.getPosition(), position)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }

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

