public class EmployeeTeam{
    private Employee boss;
    private Employee employee;
    public EmployeeTeam(Employee boss, Employee employee){
        this.boss = boss;
        this.employee = employee;
    }
    public void printEmployeeDetails(){
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
    }
    public void printAllEmployeesDetails(){
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
        System.out.println(boss.getFirstName());
        System.out.println(boss.getLastName());
        System.out.println(boss.getSalary());
    }
    public void updateSalaryOfEmployee(String firstname, double newSalary){
        if(newSalary > 0 && boss.getFirstName().equals(firstname)){
            boss.setSalary(newSalary);
        }
        if(newSalary > 0 && employee.getFirstName().equals(firstname)){
            employee.setSalary(newSalary);
        }
    }
    public void giveRaiseToAllEmployees() {
        boss.setSalary(boss.getSalary() * 1.1);
        employee.setSalary(employee.getSalary() * 1.1);
    }
}