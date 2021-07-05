package workWithDbEmployees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertLine {
    /*
     * Extract only words
     */
    static List<String> extractValues(String linesFromFile) {

        String line = linesFromFile;
        List<String> listValuesFieldsEmployees = new LinkedList<>();
        List<String> convertedList;

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
