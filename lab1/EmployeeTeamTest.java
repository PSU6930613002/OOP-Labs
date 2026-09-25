public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee Claude = new Employee("Claude", "Anthropic", 9999);
        Employee ChatGPT = new Employee("ChatGPT", "OpenAI", 0.01);
        EmployeeTeam team = new EmployeeTeam(Claude, ChatGPT);
        team.printAllEmployeesDetails();
        team.updateSalaryOfEmployee("Claude", 666);
        team.printEmployeeDetails();
        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}