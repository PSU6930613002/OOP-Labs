public class EmployeeTest {
    public static void main(String[] args) {  
        Employee employee01 = new Employee("Harry", "Guo", 66666);
        Employee employee02 = new Employee("Jason", "Zhao", 1);
        Employee employee03 = new Employee("John", "Zaw", 9999);
        System.out.println(employee02.getYearlySalary());
        System.out.println(employee03.getYearlySalary());
        employee02.raiseSalary();
        employee03.raiseSalary();
        System.out.println(employee02.getYearlySalary());
        System.out.println(employee03.getYearlySalary());
    }
}