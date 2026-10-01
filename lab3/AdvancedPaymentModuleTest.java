public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule module = new AdvancedPaymentModule(0);
        Employee[] employees = {
            new Fulltimer("Jason", 100),
            new Hourly("Harry", 10, 5),
            new Manager("IForgotName", 100, 10),
            new Manager("RandomName", 100, 11)
        };
        module.payment(employees);
        System.out.println(module.getTotalPay());
    }
}