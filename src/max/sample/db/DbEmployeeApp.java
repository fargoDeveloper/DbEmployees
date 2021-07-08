package max.sample.db;

import java.util.*;

public class DbEmployeeApp {

    public static final String FILE_NAME = "C://WorkTasks//DbEmployees//fileFromDb.txt";

    public static void main(String[] args) {
        DbCreator dBCreate = new DbCreator();
        List<Employee> listEmployees = new ArrayList<>();

        listEmployees = dBCreate.listEmployees(FILE_NAME);
        System.out.println();

        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.println(listEmployees.get(i));
        }
    }
}
