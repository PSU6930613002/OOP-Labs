public class Account {
    private String name;
    private double balance;
    public Account(String name, double balance){
        this.name = name;
        setBalance(balance);
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0){
            setBalance(getBalance()+depositAmount);
        }
    }
    public void setName(String name){
        this.name = name;
    }
    private void setBalance(double balance){
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            this.balance = 0d;
        }
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
}