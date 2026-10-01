public class AdvancedPaymentModule extends PaymentModule{
    public AdvancedPaymentModule(double totalPay){
        super(totalPay);
    }
    public void payment(Employee[] employees){
        for(Employee count:employees){
            super.payment(count);
        }
    }
}