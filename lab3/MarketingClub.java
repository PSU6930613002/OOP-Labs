public class MarketingClub extends Club{
    private int budget;
    public MarketingClub(String c, int m, int budget){
        super(c, m);
        this.budget = budget;
    }
    public boolean useBudget(int x){
        if(budget-x>=0){
            budget = budget - x;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int determineBudget(){
        if(budget > 1000){
            return 0;
        }
        else{
            return (numMember * 1000);
        }
    }
}