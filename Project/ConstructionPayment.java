public class ConstructionPayment extends Transaction{
    private String contructorName;
    private String paymentStage;
    public ConstructionPayment(String recordID, String projectName, String date, double amount, String contructorName, String paymentStage){
        super(recordID, projectName, date, amount);
        this.contructorName = contructorName;
        this.paymentStage = paymentStage;
    }
    @Override 
    public String getSummary(){
        return "Construction Payment"
            + " | ID: " + getRecordID()
            + " | Project: " + getProjectName()
            + " | Date: " + getDate()
            + " | Amount: " + getAmount()
            + " | Contructor: " + contructorName
            + " | Stage: " + paymentStage;
    }
    public String getContructorName(){
        return this.contructorName;
    }
    public String getPaymentStage(){
        return this.paymentStage;
    }
}