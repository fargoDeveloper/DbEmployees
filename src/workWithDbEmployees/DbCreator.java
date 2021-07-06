package workWithDbEmployees;

import java.util.ArrayList;
import java.util.List;

public class DbCreator {

    static ArrayList<Employee> listEmployees(){
        String fileName = "C://WorkTasks//DbEmployees//fileFromDb.txt";
        ReadFromFile readFromFile = new ReadFromFile();
        LineConverter lineConverter = new LineConverter();
        EmployeeGenerator employeeGenerator = new EmployeeGenerator();
        ArrayList<Employee> employee = new ArrayList<>();
        ArrayList<Employee> listEmployees = new ArrayList<>();

        ArrayList<String> linesFromFile = readFromFile.loadFromFile(fileName);

        for (String line : linesFromFile) {
            if (!line.isEmpty()) {
                List<String> listValuesFieldsEmployees = lineConverter.extractValues(line);
                listEmployees.add(employeeGenerator.generateEmployees(listValuesFieldsEmployees));
            }
        }
        return listEmployees;
    }
}
