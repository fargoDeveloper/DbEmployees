package workWithDbEmployees;


import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestSearchEmployee {

    UtilsForSearch utilsFotSearch = new UtilsForSearch();
    ArrayList<Employee> listEmployees = new ArrayList<>();
    DbCreator dbCreate = new DbCreator();



//    @Test
//    public void searchById() {
//        List<Integer> listEmployeesTestId = new ArrayList<>();
//        List<Employee> listEmployeesTest = new ArrayList<>();
//
//        for (int i = 0; i < listEmployees.size(); i++) {
//            listEmployeesTestId.add(i + 1);
//        }
//
//        for (int i = 0; i < listEmployees.size(); i++) {
//            listEmployees = utilsFotSearch.searchById(listEmployeesTestId.get(i), listEmployees);
//            listEmployeesTest.add(generateEmployees.generateEmployees().get(i));
//            assertEquals(listEmployeesTest, listEmployees);
//        }
//    }
//
//    @Test (expected = IndexOutOfBoundsException.class)
//    public void searchByIndexOutOfBoundsId() {
//        List<Integer> listEmployeesTestId = new ArrayList<>();
//        List<Employee> listEmployeesTest = new ArrayList<>();
//
//        listEmployees = utilsFotSearch.searchById(listEmployeesTestId.get(0), listEmployeesTest);
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByNullValueId() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//
//        listEmployees = utilsFotSearch.searchById(null, listEmployees);
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByName() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//        String name = "Max";
//
//        listEmployees = utilsFotSearch.searchByName(name, listEmployees);
//
//        listEmployeesTest.add(generateEmployees.generateEmployees().get(0));
//        listEmployeesTest.add(generateEmployees.generateEmployees().get(4));
//
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByNotCorrectName() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//        String name = "Ivan";
//
//        listEmployees = utilsFotSearch.searchByName(name, listEmployees);
//
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByNullValueName() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//
//        listEmployees = utilsFotSearch.searchByName(null, listEmployees);
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchBySurname() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//        String surname = "Ned";
//
//        listEmployees = utilsFotSearch.searchBySurname(surname, listEmployees);
//
//        listEmployeesTest.add(generateEmployees.generateEmployees().get(0));
//        listEmployeesTest.add(generateEmployees.generateEmployees().get(1));
//        listEmployeesTest.add(generateEmployees.generateEmployees().get(3));
//
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByNotCorrectSurname() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//        String surname = "Dimova";
//
//        listEmployees = utilsFotSearch.searchBySurname(surname, listEmployees);
//
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByNullValueSurname() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//
//        listEmployees = utilsFotSearch.searchBySurname(null, listEmployees);
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//
//    @Test
//    public void searchByPosition() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//        String position = "Developer";
//
//        listEmployees = utilsFotSearch.searchByPosition(position, listEmployees);
//
//        listEmployeesTest.add(generateEmployees.generateEmployees().get(0));
//        listEmployeesTest.add(generateEmployees.generateEmployees().get(1));
//
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByNotCorrectPosition() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//        String position = "Fisher";
//
//        listEmployees = utilsFotSearch.searchByPosition(position, listEmployees);
//
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByNullValuePosition() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//
//        listEmployees = utilsFotSearch.searchByPosition(null, listEmployees);
//        assertEquals(listEmployeesTest, listEmployees);
//    }


    @Test
    public void searchBySalary() {
        listEmployees = dbCreate.listEmployees();
        Integer salary = 30_000;
        assertEquals(2, utilsFotSearch.searchBySalary(salary, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectValueSalary() {
        Integer salary = 5_000;
        assertEquals(0, utilsFotSearch.searchBySalary(salary, listEmployees).size());
    }

    @Test
    public void searchByNullValueSalary() {
        assertEquals(0, utilsFotSearch.searchBySalary(null, listEmployees).size());
    }
}
