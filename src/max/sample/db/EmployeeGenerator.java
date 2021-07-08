package max.sample.db;

import java.util.List;

/**
 This is class using data from the list
 for Employee class fields and generate employee
 */
public class EmployeeGenerator {
    public Employee generateEmployee(List<String> listValuesFieldsEmployees) {
        Employee employee = new Employee(
                Integer.parseInt(listValuesFieldsEmployees.get(0)),
                listValuesFieldsEmployees.get(1),
                listValuesFieldsEmployees.get(2),
                listValuesFieldsEmployees.get(3),
                Integer.parseInt(listValuesFieldsEmployees.get(4)));
        return employee;
    }
}
