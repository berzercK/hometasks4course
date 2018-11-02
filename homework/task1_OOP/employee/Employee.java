package education.homework.task1_OOP.employee;

public class Employee {
    private int id;
    private int salary;
    private String firstName;
    private String lastName;

    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary + salary * percent / 100;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id = " + id +
                ", salary = " + salary +
                ", name = \"" + getName() + '\"' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return employee.id == id && employee.salary == salary &&
                employee.firstName.equals(firstName) && employee.lastName.equals(lastName);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + id;
        result = 31 * result + salary;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

}






















