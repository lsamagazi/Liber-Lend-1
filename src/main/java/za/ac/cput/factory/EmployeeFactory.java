package za.ac.cput.factory;

import za.ac.cput.domain.impl.Employee;

import java.util.List;

/**
 * EmployeeFactory.java
 * Class for the Employee Factory
 * Author: Shamiso Moyo Chaka(220365393)
 * Date: 26 March 2021
 */




public class EmployeeFactory implements IFactory <Employee> {

    public static Employee createEmployee (int Employee_ID, String FirstName, String LastName, String Email, int PhoneNumber, int salary) {

        // Random random = new Random();
       //  int employeeID = random.nextInt();

          return new Employee.Builder()
                   .setEmployee_Id(Employee_ID)
                   .setEmail(Email)
                   .setFirstName(FirstName)
                   .setsalary(salary)
                   .setLastName(LastName)
                   .setPhoneNumber(PhoneNumber)
                    .Build();

    }

    @Override
    public Employee create() {
        return null;
    }

    @Override
    public Employee getById(long id) {
        return null;
    }

    @Override
    public Employee update(Employee entity) {
        return null;
    }

    @Override
    public boolean delete(Employee entity) {
        return false;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Class<Employee> getType() {
        return null;
    }
}