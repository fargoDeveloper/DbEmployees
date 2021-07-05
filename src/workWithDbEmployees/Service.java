package workWithDbEmployees;

import java.util.*;

public class Service {

    public static void main(String[] args) {

        CreateDb createDb = new CreateDb();
        TreeMap<Integer, TreeMap> listEmployees = new TreeMap<>();

        listEmployees =  createDb.listEmployees();

        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.println(listEmployees.get(i + 1));
        }

        System.out.println();
    }
}
