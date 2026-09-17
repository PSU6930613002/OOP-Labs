public class AccountList {
    private int maxAccounts;
    private Account[] accounts;
    private int count = 0;
    //private int idx;
    public AccountList(int maxAccounts){
        this.maxAccounts = maxAccounts;
        accounts = new Account[maxAccounts];
    }
    public boolean appendAccount(Account account){
        if(count < maxAccounts){
            accounts[count] = account;
            count = count + 1;
            return true;
        }
        else{
            return false;
        }
    }
    public Account getAccount(int idx){
        if(idx < count && idx >= 0){
            //System.out.println(accounts[idx]);
            return accounts[idx];
        }
        else{
            System.out.println("Input index exceeds the number of appended elements");
            return null;
        }
    }
}