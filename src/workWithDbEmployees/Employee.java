package workWithDbEmployees;

import java.util.Objects;

public class Employee {
    private Integer id;
    private String name;
    private String surname;
    private String position;
    private Integer salary;

    public Employee(Integer id, String name, String surname, String position, Integer salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id~=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id) && name.equals(employee.name)
                && surname.equals(employee.surname) && position.equals(employee.position)
                && salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, position, salary);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}