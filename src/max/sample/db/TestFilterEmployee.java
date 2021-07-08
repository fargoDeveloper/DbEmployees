package max.sample.db;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

/**
    This is class have test cases for the database filters
 */
public class TestFilterEmployee {

    EmployeeUtilsFilter utilsForFilter = new EmployeeUtilsFilter();
    ArrayList<Employee> listEmployees = new ArrayList<>();
    DbCreator dbCreate = new DbCreator();
    public static final String FILE_NAME = "C://WorkTasks//DbEmployees//fileFromDb.txt";

    @Test
    public void filterById() {
        // given
        Integer id = 2;

        // when
        listEmployees = dbCreate.listEmployees(FILE_NAME);

        // then
        assertEquals(listEmployees.get(1), utilsForFilter.filterById(id, listEmployees).get(0));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void filterByIndexOutOfBoundsId() {
        Integer id = 78;
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(null, utilsForFilter.filterById(id, listEmployees).get(0));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void filterByNullValueId() {
        Integer id = null;
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(null, utilsForFilter.filterById(id, listEmployees).get(0));
    }

    @Test
    public void filterByName() {
        String name = "Max";
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(2, utilsForFilter.filterByName(name, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectName() {
        String name = "Ivan";
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(0, utilsForFilter.filterByName(name, listEmployees).size());
    }

    @Test
    public void searchByNullValueName() {
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(0, utilsForFilter.filterByName(null, listEmployees).size());
    }

    @Test
    public void searchBySurname() {
        String surname = "Ned";
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(3, utilsForFilter.filterBySurname(surname, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectSurname() {
        String name = "Pavlov";
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(0, utilsForFilter.filterBySurname(name, listEmployees).size());
    }

    @Test
    public void searchByNullValueSurname() {
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(0, utilsForFilter.filterByName(null, listEmployees).size());
    }

    @Test
    public void searchByPosition() {
        String surname = "Developer";
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(2, utilsForFilter.filterByPosition(surname, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectPosition() {
        String name = "Fisher";
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(0, utilsForFilter.filterByPosition(name, listEmployees).size());
    }

    @Test
    public void searchByNullValuePosition() {
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(0, utilsForFilter.filterByPosition(null, listEmployees).size());
    }

    @Test
    public void searchBySalary() {
        Integer salary = 30_000;
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(2, utilsForFilter.filterBySalary(salary, listEmployees).size());
    }

    @Test
    public void searchByNotCorrectValueSalary() {
        Integer salary = 5_000;
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(0, utilsForFilter.filterBySalary(salary, listEmployees).size());
    }

    @Test
    public void searchByNullValueSalary() {
        listEmployees = dbCreate.listEmployees(FILE_NAME);
        assertEquals(0, utilsForFilter.filterBySalary(null, listEmployees).size());
    }
}
