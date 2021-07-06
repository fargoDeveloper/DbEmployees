package workWithDbEmployees;

import java.util.*;

public class Service {

    public static void main(String[] args) {

        DbCreator dBCreate = new DbCreator();
        List<Employee> listEmployees = new ArrayList<>();

        listEmployees = dBCreate.listEmployees();

        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.println(listEmployees.get(i));
        }

        System.out.println();
    }
}
