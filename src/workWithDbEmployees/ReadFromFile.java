package workWithDbEmployees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFromFile {
    /*
     * Read information from a file
     */
    static List<String> loadFromFile(String fileName) {

        String line;
        List<String> listValuesFieldsEmployees = new ArrayList<>();

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)) {
            while ((line = reader.readLine()) != null) {
                listValuesFieldsEmployees.add(line);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        return listValuesFieldsEmployees;
    }
}
