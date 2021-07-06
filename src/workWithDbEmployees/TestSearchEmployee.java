package workWithDbEmployees;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestSearchEmployee {

    UtilsForSearch utilsForSearch = new UtilsForSearch();
    ArrayList<Employee> listEmployees = new ArrayList<>();
    DbCreator dbCreate = new DbCreator();

    @Test
    public void searchById() {
        listEmployees = dbCreate.listEmployees();
        Integer id = 2;
        assertEquals(listEmployees.get(1), utilsForSearch.searchById(id, listEmployees).get(0));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void searchByIndexOutOfBoundsId() {
        listEmployees = dbCreate.listEmployees();
        Integer id = 78;
        assertEquals(null, utilsForSearch.searchById(id, listEmployees).get(0));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void searchByNullValueId() {
        listEmployees = dbCreate.listEmployees();
        Integer id = null;
        assertEquals(null, utilsForSearch.searchById(id, listEmployees).get(0));
    }

    @Test
    public void searchByName() {
        listEmployees = dbCreate.listEmployees();

        String name = "Max";
        assertEquals(2, utilsForSearch.searchByName(name, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectName() {
        listEmployees = dbCreate.listEmployees();

        String name = "Ivan";
        assertEquals(0, utilsForSearch.searchByName(name, listEmployees).size());
    }

    @Test
    public void searchByNullValueName() {
        listEmployees = dbCreate.listEmployees();

        assertEquals(0, utilsForSearch.searchByName(null, listEmployees).size());
    }

    @Test
    public void searchBySurname() {
        listEmployees = dbCreate.listEmployees();

        String surname = "Ned";
        assertEquals(3, utilsForSearch.searchBySurname(surname, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectSurname() {
        listEmployees = dbCreate.listEmployees();

        String name = "Pavlov";
        assertEquals(0, utilsForSearch.searchBySurname(name, listEmployees).size());
    }

    @Test
    public void searchByNullValueSurname() {
        listEmployees = dbCreate.listEmployees();

        assertEquals(0, utilsForSearch.searchByName(null, listEmployees).size());
    }

    @Test
    public void searchByPosition() {
        listEmployees = dbCreate.listEmployees();

        String surname = "Developer";
        assertEquals(2, utilsForSearch.searchByPosition(surname, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectPosition() {
        listEmployees = dbCreate.listEmployees();

        String name = "Fisher";
        assertEquals(0, utilsForSearch.searchByPosition(name, listEmployees).size());
    }

    @Test
    public void searchByNullValuePosition() {
        listEmployees = dbCreate.listEmployees();

        assertEquals(0, utilsForSearch.searchByPosition(null, listEmployees).size());
    }

    @Test
    public void searchBySalary() {
        listEmployees = dbCreate.listEmployees();

        Integer salary = 30_000;
        assertEquals(2, utilsForSearch.searchBySalary(salary, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectValueSalary() {
        listEmployees = dbCreate.listEmployees();

        Integer salary = 5_000;
        assertEquals(0, utilsForSearch.searchBySalary(salary, listEmployees).size());
    }

    @Test
    public void searchByNullValueSalary() {
        listEmployees = dbCreate.listEmployees();

        assertEquals(0, utilsForSearch.searchBySalary(null, listEmployees).size());
    }
}
