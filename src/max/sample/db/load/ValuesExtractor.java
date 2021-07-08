package max.sample.db.load;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ValuesExtractor {

    /**
     * This is method extracts from the received string
     * the values required for the Employee class fields.
     */
    public ArrayList<String> extractValues(String linesFromFile) {
        String line = linesFromFile;
        ArrayList<String> listValuesFieldsEmployees = new ArrayList<>();
        List<String> convertedList = new ArrayList<>();

        line = line.trim();

        // remove extra characters in to line
        line = line.replaceAll("[//\\()?–—:_!@~`#№$%^&*=\'\"\t\b\r.\\+,;\n{}<>]+", "");
        line = line.replaceAll("[\\xC2\\xA0]+", " ");

        convertedList = Arrays.asList(line.split(" "));

        // Removing possibly appeared empty values
        for (int i = 0; i < convertedList.size(); i++) {
            if (!convertedList.get(i).isEmpty()) {
                listValuesFieldsEmployees.add(convertedList.get(i));
            }
        }
        return listValuesFieldsEmployees;
    }
}
