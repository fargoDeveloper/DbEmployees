package max.sample.db;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * This is class have declare methods for filter by fields it to database
 */
public class EmployeeUtilsFilter {

    /**
     * Filters the input list {@code listEmployees} by Employ's id
     * @param id List is filtered by this value
     * @param listEmployees input list
     * @return a new list with filtered values
     */
    public List<Employee> filterById(Integer id, List<Employee> listEmployees) {
        return listEmployees.stream()
                .filter(employee -> Objects.equals(employee.getId(), id))
                .collect(Collectors.toList());
    }

    /**
     * Filters the input list {@code listEmployees} by Employ's name
     * @param name List is filtered by this value
     * @param listEmployees input list
     * @return a new list with filtered values
     */
    public List<Employee> filterByName(String name, List<Employee> listEmployees) {
        return listEmployees.stream()
                .filter(employee -> Objects.equals(employee.getName(), name))
                .collect(Collectors.toList());
    }

    /**
     * Filters ihe input list {@code listEmployees} by Employee surname
     * @param surname List is filtered by this value
     * @param listEmployees input list
     * @return a new list with filtered values
     */
    public List<Employee> filterBySurname(String surname, List<Employee> listEmployees) {
        return listEmployees.stream()
                .filter(employee -> Objects.equals(employee.getSurname(), surname))
                .collect(Collectors.toList());
    }

    /**
     * Filters the input list {@code listEmployees} by Employee position
     * @param position List is filtered by this value
     * @param listEmployees input list
     * @return a new list with filtered values
     */
    public List<Employee> filterByPosition(String position, List<Employee> listEmployees) {
        return listEmployees.stream()
                .filter(employee -> Objects.equals(employee.getPosition(), position))
                .collect(Collectors.toList());
    }

    /**
     * Filters the input list {@code listEmployees} by Employee salary
     * @param salary List is filtered by this value
     * @param listEmployees input list
     * @return a new list with filtered values
     */
    public List<Employee> filterBySalary(Integer salary, List<Employee> listEmployees) {
        return listEmployees.stream()
                .filter(employee -> Objects.equals(employee.getSalary(), salary))
                .collect(Collectors.toList());
    }
}

