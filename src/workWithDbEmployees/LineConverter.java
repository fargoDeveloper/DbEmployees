package workWithDbEmployees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineConverter {
    /*
     * Extract only values
     */
    static ArrayList<String> extractValues(String linesFromFile) {

        String line = linesFromFile;
        ArrayList<String> listValuesFieldsEmployees = new ArrayList<>();
        List<String> convertedList = new ArrayList<>();

        // Remove spaces at the beginning and end of the line
        line = line.trim();

        // Convert all characters to lowercase
//        line = line.toLowerCase();

        // remove extra characters in to line
        line = line.replaceAll("[//\\()?–—:_!@~`#№$%^&*=\'\"\t\b\r.\\+,;\n{}<>]+", "");
        line = line.replaceAll("[\\xC2\\xA0]+", " ");

        // Creating an list of strings
        convertedList = Arrays.asList(line.split(" "));

        for (int i = 0; i < convertedList.size(); i++) {
            if (!convertedList.get(i).equals("")) {
                listValuesFieldsEmployees.add(convertedList.get(i));
            }
        }
        return listValuesFieldsEmployees;
    }
}
