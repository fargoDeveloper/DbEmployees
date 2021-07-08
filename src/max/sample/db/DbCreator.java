package max.sample.db;

import max.sample.db.load.ValuesExtractor;
import max.sample.db.load.FromFileReader;

import java.util.ArrayList;
import java.util.List;

/**
 * This is class create list of employees
 */
public class DbCreator {
    public ArrayList<Employee> listEmployees(String fileName){
        FromFileReader readFromFile = new FromFileReader();
        ValuesExtractor lineConverter = new ValuesExtractor();
        EmployeeGenerator employeeGenerator = new EmployeeGenerator();
        ArrayList<Employee> listEmployees = new ArrayList<>();

        List<String> linesFromFile = readFromFile.loadFromFile(fileName);

        for (String line : linesFromFile) {
            if (!line.isEmpty()) {
                List<String> listValuesFieldsEmployees = lineConverter.extractValues(line);
                listEmployees.add(employeeGenerator.generateEmployee(listValuesFieldsEmployees));
            }
        }
        return listEmployees;
    }
}
