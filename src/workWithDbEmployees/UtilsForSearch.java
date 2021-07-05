package workWithDbEmployees;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

public class UtilsForSearch {

    public TreeMap<Integer, TreeMap> searchByPosition(String position, TreeMap<Integer, TreeMap> listEmployees) {
        TreeMap<Integer, TreeMap> searchEmployee = new TreeMap<>();


        if (listEmployees.containsValue(position)) {
            searchEmployee.put(1, listEmployees.get(position));
        }

        return searchEmployee;
    }

//    public List<Employee> searchBySalary(Integer salary, List<Employee> listEmployees) {
//        List<Employee> searchEmployee = new ArrayList<>();
//        for (Employee employee : listEmployees) {
//            if (employee.getSalary().equals(salary)) {
//                searchEmployee.add(employee);
//            }
//        }
//        return searchEmployee;
//    }
//
//    public List<Employee> searchById(Integer id, List<Employee> listEmployees) {
//        List<Employee> searchEmployee = new ArrayList<>();
//        for (Employee employee : listEmployees) {
//            if (employee.getId().equals(id)) {
//                searchEmployee.add(employee);
//            }
//        }
//        return searchEmployee;
//    }
//
//    public List<Employee> searchByName(String name, List<Employee> listEmployees) {
//        List<Employee> searchEmployee = new ArrayList<>();
//        for (Employee employee : listEmployees) {
//            if (employee.getName() == name) {
//                searchEmployee.add(employee);
//            }
//        }
//        return searchEmployee;
//    }
//
    public List<Employee> searchBySurname(String surname, List<Employee> listEmployees) {
        List<Employee> searchEmployee = new ArrayList<>();
        for (Employee employee : listEmployees) {
//            if(Objects.equals(employee.getSurname(), surname))
            if (employee.getSurname().equals(surname)) {
//                if (employee.getSurname() != null && employee.getSurname().equals(surname)) {
                searchEmployee.add(employee);
            }
        }
        return searchEmployee;
    }
}

