public abstract class Transaction implements FinancialRecord{
    private String recordID;
    private String projectName;
    private String date;
    private double amount;
    public Transaction(String recordID, String projectName, String date, double amount){
        this.recordID = recordID;
        this.projectName = projectName;
        this.date = date;
        this.amount = amount;
    }
    @Override
    public String getRecordID() {
        return recordID;
    }
    @Override
    public String getProjectName() {
        return projectName;
    }
    @Override
    public String getDate() {
        return date;
    }
    @Override
    public final double getAmount() {
        return amount;
    }
    @Override
    public abstract String getSummary();
}