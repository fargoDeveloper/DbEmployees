package workWithDbEmployees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Creating LineConverter class which prepares data for Employee class
 */

public class LineConverter {
    /*
     * Method extractValues extracts from the received string
     * the values required for the Employee class fields.
     */
    public ArrayList<String> extractValues(String linesFromFile) {

        String line = linesFromFile;
        ArrayList<String> listValuesFieldsEmployees = new ArrayList<>();
        List<String> convertedList = new ArrayList<>();

        // Remove spaces at the beginning and end of the line
        line = line.trim();

        // remove extra characters in to line
        line = line.replaceAll("[//\\()?–—:_!@~`#№$%^&*=\'\"\t\b\r.\\+,;\n{}<>]+", "");
        line = line.replaceAll("[\\xC2\\xA0]+", " ");

        // Creating an list of strings
        convertedList = Arrays.asList(line.split(" "));

        // Removing possibly appeared empty values
        for (int i = 0; i < convertedList.size(); i++) {
            if (!convertedList.get(i).equals("")) {
                listValuesFieldsEmployees.add(convertedList.get(i));
            }
        }
        return listValuesFieldsEmployees;
    }
}
