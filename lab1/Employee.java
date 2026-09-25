public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getSalary(){
        return salary;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
    }
    public void raiseSalary(){
        double newSalary = getSalary();
        newSalary = newSalary*1.1;
        setSalary(newSalary);
    }
    public double getYearlySalary(){
        return salary*12;
    }
}