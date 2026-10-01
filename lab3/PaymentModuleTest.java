public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule module = new PaymentModule(0);
        module.payment(new Fulltimer("Name", 100));
        System.out.println(module.getTotalPay());
        module.payment(new Hourly("AnotherName", 10, 5));
        System.out.println(module.getTotalPay());
        module.payment(new Manager("SoManyNames", 100, 10));
        System.out.println(module.getTotalPay());
        module.payment(new Manager("NoName", 100, 11));
        System.out.println(module.getTotalPay());
    }
}