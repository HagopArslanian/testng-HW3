import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CompanyTest {

    @Test
    public void successTestAddEmployee() {
        Company company = new Company();
        Employee employee1 = new Employee("Hagop", 20, "hagop@gmail.com");
        Employee result = company.addEmployee(employee1);
        assertEquals(result, company.employees.get(0));
    }

    @Test
    public void employeeWithThisEmailExistsTestAddEmployee(){
        Company company = new Company();
        Employee employee1 = new Employee("Hagop A", 20, "hagop@gmail.com");
        company.addEmployee(employee1);
        Employee employee2 = new Employee("Hagop B", 10, "hagop@gmail.com");
        Employee result = company.addEmployee(employee2);
        assertEquals(result, null);
    }

    @Test
    public void emailFieldRequiredTestAddEmployee(){
        Company company = new Company();
        Employee employee1 = new Employee("Hagop", 20, "");
        Employee result = company.addEmployee(employee1);
        assertEquals(result, null);
    }

    @Test
    public void successTestDeleteEmployee() {
        Company company = new Company();
        Employee employee1 = new Employee("Hagop", 20, "hagop@gmail.com");
        company.addEmployee(employee1);
        boolean result = company.deleteEmployee(employee1);
        assertEquals(result, true);
    }

    @Test
    public void employeeNotFoundTestDeleteEmployee(){
        Company company = new Company();
        Employee employee1 = new Employee("Hagop", 20, "hagop@gmail");
        boolean result = company.deleteEmployee(employee1);
        assertEquals(result, false);
    }

    @Test
    public void successTestUpdateEmployee() {
        Company company = new Company();
        Employee employee1 = new Employee("Jacob", 20, "Jacob@gmail.com");
        company.addEmployee(employee1);
        Employee result = company.updateEmployee(employee1, "Hagop", 25, "Hagop@gmail.com");
        assertEquals(result, company.employees.get(0));
    }

    @Test
    public void employeeNotFoundTestUpdateEmployee(){
        Company company = new Company();
        Employee employee1 = new Employee("Jacob", 20, "Jacob@gmai.com");
        Employee result = company.updateEmployee(employee1, "Hagop", 25, "Hagop@gmail.com");
        assertEquals(result, null);
    }

    @Test
    public void successTestGetEmployeeByEmail() {
        Company company = new Company();
        Employee employee1 = new Employee("Hagop", 20, "Hagop@gmail.com");
        company.addEmployee(employee1);
        Employee result = company.getEmployeeByEmail(employee1.GetEmail());
        assertEquals(result, employee1);
    }

    @Test
    public void employeeNotFoundTestGetEmployeeByEmail(){
        Company company = new Company();
        Employee employee1 = new Employee("Hagop", 20, "Hagop@gmail.com");
        company.addEmployee(employee1);
        Employee result = company.getEmployeeByEmail("Jacob@gmail.com");
        assertEquals(result, null);
    }
}