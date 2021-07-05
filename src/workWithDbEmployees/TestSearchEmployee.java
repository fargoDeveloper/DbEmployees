package workWithDbEmployees;


import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestSearchEmployee {


    @Test
    public void testFilter(){
        Employee employee1 = new Employee(1, "Max", "Ned", "Developer", 10_000);
        Employee employee2 = new Employee(2, "Igor", "Ned", "Developer", 15_000);
        Employee employee3 = new Employee(3, "Alla", new String("Ned"), "Developer", 30_000);
//        Employee employee4 = new Employee(3, "Alla", null, "Developer", 30_000);


        List<Employee> list = new ArrayList<>();
        List<Employee> resultList = new ArrayList<>();

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
//        list.add(employee4);

//        for (Employee employee: list) {
//            if(employee.getSalary() > 20_000){
//                resultList.add(employee);
//            }
//        }
        UtilsForSearch utilsForSearch = new UtilsForSearch();
        List<Employee> list1 = utilsForSearch.searchBySurname(null, list);

        assertEquals(0, list1.size());
    }

//    @Test
//    public void TestMutableValue(){
//        Employee employee = new Employee(1, "Max", "Ned", "Developer", 10_000);
//        Map<Employee, Integer> map = new HashMap<>();
//
//        map.put(employee, 1);
//
//
//        assertEquals(Integer.valueOf(1), map.get(employee));
//
//        System.out.println(employee.hashCode());
//        employee.setId(10);
//        System.out.println(employee.hashCode());
//
//        assertEquals(Integer.valueOf(1), map.get(employee));
//    }
//

//    UtilsForSearch utilsFotSearch = new UtilsForSearch();
//
//    TreeMap<Integer, TreeMap> listEmployees = new TreeMap<>();
//
//    CreateDb createDb = new CreateDb();



//    @Test
//    public void searchBySalary() {
//        TreeMap<String, Employee> listEmployeesTest = new TreeMap<>();
//        listEmployees = createDb.listEmployees();
//
//        Integer salary = 30_000;
//
//        assertEquals(listEmployeesTest, listEmployees);
//    }

//    @Test
//    public void searchByNotCorrectValueSalary() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//        Integer salary = 5_000;
//        listEmployees = utilsFotSearch.searchBySalary(salary, listEmployees);
//        assertEquals(listEmployeesTest, listEmployees);
//    }
//
//    @Test
//    public void searchByNullValueSalary() {
//        List<Employee> listEmployeesTest = new ArrayList<>();
//
//        listEmployees = utilsFotSearch.searchBySalary(null, listEmployees);
//        assertEquals(listEmployeesTest, listEmployees);
//    }
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
//
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
}
