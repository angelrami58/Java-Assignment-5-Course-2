/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez_assignment5;
import java.util.Date;
/**
 *
 * @author angelramirez-rivera
 */
class Employee {
    private String name;
    private String employeeNumber;
    private Date hireDate;

    // Constructors
    public Employee(String name, String employeeNumber, Date hireDate) {
        this.name = name;
        if (isValidEmployeeNumber(employeeNumber)) {
            this.employeeNumber = employeeNumber;
        } else {
            throw new IllegalArgumentException("Invalid employee number format.");
        }
        this.hireDate = hireDate;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if (isValidEmployeeNumber(employeeNumber)) {
            this.employeeNumber = employeeNumber;
        } else {
            throw new IllegalArgumentException("Invalid employee number format.");
        }
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    // Helper method to validate employee number format
    private boolean isValidEmployeeNumber(String employeeNumber) {
        return employeeNumber.matches("\\d{3}-[A-M]");
    }
}

class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPay;

    // Constructors
    public ProductionWorker(String name, String employeeNumber, Date hireDate, int shift, double hourlyPay) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPay = hourlyPay;
    }

    // Accessor methods
    public int getShift() {
        return shift;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    // Mutator methods
    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}

public class Ramirez_Assignment5 {
    public static void main(String[] args) {
        // Create a ProductionWorker object
        ProductionWorker worker = new ProductionWorker("John Doe", "123-A", new Date(), 1, 20.0);

        // Display information about the worker
        System.out.println("Employee Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getEmployeeNumber());
        System.out.println("Hire Date: " + worker.getHireDate());
        System.out.println("Shift: " + worker.getShift());
        System.out.println("Hourly Pay: $" + worker.getHourlyPay());
    }
}
