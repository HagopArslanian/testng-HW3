import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee){
        for (Employee employe: employees) {
            if(employee.GetEmail().equals(employe.GetEmail())){
                System.out.println("An employee with this email already exists");
                return null;
            }
        }

        if(employee.GetEmail().equals("") || employee.GetEmail() == null){
            System.out.println("The employee has to have an email");
            return null;
        }

        employees.add(employee);
        System.out.println("employee added Successfully.");
        return employee;
    }

    public boolean deleteEmployee(Employee employee){
        if(!employees.contains(employee)){
            System.out.println("This employee doesn't exist to be deleted");
            return false;
        }else{
            employees.remove(employee);
            System.out.println("employee removed Successfully.");
            return true;
        }
    }

    public Employee updateEmployee(Employee employee, String newName, int newSalary, String newEmail){
        Employee result = null;
        if(!employees.contains(employee)){
            System.out.println("This employee doesn't exist to be updated");
            return null;
        }

        for(Employee employe: employees){
            if(employe.GetEmail().equals(employee.GetEmail())){
                employe.SetEmail(newEmail);
                employe.SetName(newName);
                employe.SetSalary(newSalary);
                result = employe;
            }
        }
        System.out.println("The employee was Successfully updated.");
        return result;
    }

    public Employee getEmployeeByEmail(String email){
        for(Employee employee: employees){
            if(employee.GetEmail().equals(email)){
                return employee;
            }
        }

        System.out.println("an employee with this email doesn't exist");
        return null;
    }

}
