public class SalesReceipt extends Transaction{
    private String buyerName;
    private String unitNumber;
    public SalesReceipt(String recordID, String projectName, String date, double amount, String buyerName, String unitNumber){
        super(recordID, projectName, date, amount);
        this.buyerName = buyerName;
        this.unitNumber = unitNumber;
    }
    public String getBuyerName() {
        return buyerName;
    }
    public String getUnitNumber() {
        return unitNumber;
    }
    @Override
    public String getSummary() {
        return "Sales Receipt"
            + " | ID: " + getRecordID()
            + " | Project: " + getProjectName()
            + " | Date: " + getDate()
            + " | Amount: " + getAmount()
            + " | Buyer: " + buyerName
            + " | Unit: " + unitNumber;
    }
}