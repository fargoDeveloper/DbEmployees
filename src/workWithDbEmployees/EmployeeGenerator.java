package workWithDbEmployees;

import java.util.List;

public class EmployeeGenerator {

    /*
        Creating Employee using data from the input file
        for Employee class fields
     */

    public Employee generateEmployees(List<String> listValuesFieldsEmployees) {

        Employee employee = new Employee(
                Integer.parseInt(listValuesFieldsEmployees.get(0)),
                listValuesFieldsEmployees.get(1),
                listValuesFieldsEmployees.get(2),
                listValuesFieldsEmployees.get(3),
                Integer.parseInt(listValuesFieldsEmployees.get(4)));

        return employee;
    }
}
