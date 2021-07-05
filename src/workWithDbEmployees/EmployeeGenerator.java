package workWithDbEmployees;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class EmployeeGenerator {

    public TreeMap generateEmployees(int idEmployee, List<String> listValuesFieldsEmployees) {
        TreeMap<String, Employee> listEmployees = new TreeMap<>();
        String employee = "employee";

        listEmployees.put(employee + idEmployee, new Employee(
                Integer.parseInt(listValuesFieldsEmployees.get(0)),
                listValuesFieldsEmployees.get(1), listValuesFieldsEmployees.get(2),
                listValuesFieldsEmployees.get(3), Integer.parseInt(listValuesFieldsEmployees.get(4))));

        return listEmployees;
    }
}
