package workWithDbEmployees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
    /*
     * Reading information from the file
     */
    public ArrayList<String> loadFromFile(String fileName) {

        String line;
        ArrayList<String> listValuesFieldsEmployees = new ArrayList<>();

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
