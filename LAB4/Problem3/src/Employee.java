import java.util.Date;

public class Employee extends Person implements Comparable, Cloneable {
    double salary;
    Date year;
    String insuranceNumber;

    public Employee(String _name, double _salary, Date _year, String _insuranceNumber) {
        super(_name);
        year = _year;
        salary = _salary;
        insuranceNumber = _insuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " " + Double.toString(salary) + " " + insuranceNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Employee))return false;
        Employee otherEmployee = (Employee)other;
        if (!super.name.equals(otherEmployee.name)) return false;
        if (salary != otherEmployee.salary) return false;
        if (year != otherEmployee.year) return false;
        if (insuranceNumber != otherEmployee.insuranceNumber) return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee)o;
        if (other.salary != salary) {
            if (other.salary < salary) return 1;
            return -1;
        }
        return 0;
    }

    public Object clone() {
        return new Employee(super.name, salary, year, insuranceNumber);
    }
}
