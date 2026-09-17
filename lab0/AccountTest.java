public class AccountTest {
    public static void main(String[] args) {
        Account Harry = new Account("Harry", 250d);
        System.out.println(Harry.getName());
        System.out.println(Harry.getBalance());
        Harry.deposit(999d);
        System.out.println(Harry.getName());
        System.out.println(Harry.getBalance());
        Harry.setName("Harry New Name");
        Harry.deposit(-100d);
        System.out.println(Harry.getName());
        System.out.println(Harry.getBalance());
        Account Parry = new Account("Parry", -999d);
        System.out.println(Parry.getName());
        System.out.println(Parry.getBalance());
    }
}