package workWithDbEmployees;

import java.util.*;

public class Service {

    /*
        Printing of all employees from the database
     */

    public static void main(String[] args) {

        DbCreator dBCreate = new DbCreator();
        List<Employee> listEmployees = new ArrayList<>();

        listEmployees = dBCreate.listEmployees();
        System.out.println();

        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.println(listEmployees.get(i));
        }
    }
}
