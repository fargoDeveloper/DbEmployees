package workWithDbEmployees;

import java.util.List;
import java.util.TreeMap;

public class CreateDb {

    public TreeMap<Integer, TreeMap> listEmployees(){
        String fileName = "C://WorkTasks//DbEmployees//fileFromDb.txt";
        ReadFromFile readFromFile = new ReadFromFile();
        ConvertLine convertLine = new ConvertLine();
        EmployeeGenerator generateEmployees = new EmployeeGenerator();

        List<String> linesFromFile = readFromFile.loadFromFile(fileName);
        TreeMap<Integer, TreeMap> listEmployees = new TreeMap<>();
        int idEmployee = 1;

        for (String line : linesFromFile) {
            if (!line.isEmpty()) {
                List<String> listValuesFieldsEmployees = convertLine.extractValues(line);
                listEmployees.put(idEmployee, (generateEmployees.generateEmployees(idEmployee, listValuesFieldsEmployees)));
                idEmployee += 1;
            }
        }



        return listEmployees;
    }
}
