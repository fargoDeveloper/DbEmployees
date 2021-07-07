package workWithDbEmployees;

import java.util.ArrayList;
import java.util.List;


public class DbCreator {

    /*
        Creating the database of employees.
     */

    private static final String FILE_NAME = "C://WorkTasks//DbEmployees//fileFromDb.txt";

    public ArrayList<Employee> listEmployees(){

        ReadFromFile readFromFile = new ReadFromFile();
        LineConverter lineConverter = new LineConverter();
        EmployeeGenerator employeeGenerator = new EmployeeGenerator();
        ArrayList<Employee> listEmployees = new ArrayList<>();

        ArrayList<String> linesFromFile = readFromFile.loadFromFile(FILE_NAME);

        for (String line : linesFromFile) {
            if (!line.isEmpty()) {
                List<String> listValuesFieldsEmployees = lineConverter.extractValues(line);
                listEmployees.add(employeeGenerator.generateEmployees(listValuesFieldsEmployees));
            }
        }
        return listEmployees;
    }
}
