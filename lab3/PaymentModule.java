public class PaymentModule {
    private double totalPay;
    public PaymentModule(double totalPay) {
        this.totalPay = totalPay;
    }
    public void payment(Employee employee) {
        double total = employee.computePay();
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            if (manager.getWorkYear() > 10) {
                total = total * 2;
            }
        }
        totalPay = totalPay + total;
    }
    public double getTotalPay() {
        return totalPay;
    }
}