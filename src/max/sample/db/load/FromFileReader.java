package max.sample.db.load;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FromFileReader {

    /**
     * Load lines of text from file and saves them to the list
     */
    public List<String> loadFromFile(String fileName) {
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
