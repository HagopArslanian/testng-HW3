public class Employee {

    private String name;
    private int salary;
    private String email;

    Employee(String name, int salary, String email){
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public int GetSalary(){
        return salary;
    }

    public void SetSalary(int salary){
        this.salary = salary;
    }

    public String GetEmail(){
        return email;
    }

    public void SetEmail(String email){
        this.email = email;
    }
}
