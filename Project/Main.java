import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends JFrame implements ActionListener{
    private ArrayList<FinancialRecord> records;
    private JFrame entryFrame;
    private JFrame searchFrame;
    private JButton entryButton;
    private JButton searchButton;
    private JButton entryBackButton;
    private JButton searchBackButton;
    private JTextField recordIDField;
    private JTextField projectNameField;
    private JTextField dateField;
    private JTextField amountField;
    private JTextField nameField;
    private JTextField detailField;
    private JButton saveSalesButton;
    private JButton savePaymentButton;
    private JTextField entryResultField;
    private JLabel entryMessageLabel;
    private JRadioButton recordIDButton;
    private JRadioButton projectNameButton;
    private JRadioButton buyerNameButton;
    private JRadioButton contractorNameButton;
    private JTextField searchValueField;
    private JButton findButton;
    private JTextField searchResultField;
    private JLabel searchMessageLabel;
    public Main(){
        records = new ArrayList<FinancialRecord>();
        setTitle("Real Estate Finance");
        setSize(450, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel title = new JLabel("Real Estate Finance", JLabel.CENTER);
        title.setBounds(75, 40, 300, 40);
        add(title);
        entryButton = new JButton("Data Entry");
        entryButton.setBounds(125, 105, 200, 35);
        add(entryButton);
        entryButton.addActionListener(this);
        searchButton = new JButton("Search");
        searchButton.setBounds(125, 160, 200, 35);
        add(searchButton);
        searchButton.addActionListener(this);
        entryFrame = new JFrame("Data Entry");
        entryFrame.setSize(700, 600);
        entryFrame.setLayout(null);
        JLabel recordIDLabel = new JLabel("Record ID");
        recordIDLabel.setBounds(30, 40, 200, 30);
        entryFrame.add(recordIDLabel);
        recordIDField = new JTextField();
        recordIDField.setBounds(240, 40, 400, 30);
        entryFrame.add(recordIDField);
        JLabel projectNameLabel = new JLabel("Project Name");
        projectNameLabel.setBounds(30, 80, 200, 30);
        entryFrame.add(projectNameLabel);
        projectNameField = new JTextField();
        projectNameField.setBounds(240, 80, 400, 30);
        entryFrame.add(projectNameField);
        JLabel dateLabel = new JLabel("Date");
        dateLabel.setBounds(30, 120, 200, 30);
        entryFrame.add(dateLabel);
        dateField = new JTextField();
        dateField.setBounds(240, 120, 400, 30);
        entryFrame.add(dateField);
        JLabel amountLabel = new JLabel("Amount");
        amountLabel.setBounds(30, 160, 200, 30);
        entryFrame.add(amountLabel);
        amountField = new JTextField();
        amountField.setBounds(240, 160, 400, 30);
        entryFrame.add(amountField);
        JLabel nameLabel = new JLabel("Buyer or Contractor Name");
        nameLabel.setBounds(30, 200, 200, 30);
        entryFrame.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(240, 200, 400, 30);
        entryFrame.add(nameField);
        JLabel detailLabel = new JLabel("Unit Number or Payment Stage");
        detailLabel.setBounds(30, 240, 200, 30);
        entryFrame.add(detailLabel);
        detailField = new JTextField();
        detailField.setBounds(240, 240, 400, 30);
        entryFrame.add(detailField);
        saveSalesButton = new JButton("Save Sales Receipt");
        saveSalesButton.setBounds(40, 300, 270, 35);
        entryFrame.add(saveSalesButton);
        saveSalesButton.addActionListener(this);
        savePaymentButton = new JButton("Save Construction Payment");
        savePaymentButton.setBounds(340, 300, 300, 35);
        entryFrame.add(savePaymentButton);
        savePaymentButton.addActionListener(this);
        entryMessageLabel = new JLabel("");
        entryMessageLabel.setBounds(30, 350, 640, 30);
        entryFrame.add(entryMessageLabel);
        JLabel recordsLabel = new JLabel("All Records");
        recordsLabel.setBounds(30, 400, 200, 25);
        entryFrame.add(recordsLabel);
        entryResultField = new JTextField();
        entryResultField.setBounds(30, 430, 610, 35);
        entryResultField.setEditable(false);
        entryFrame.add(entryResultField);
        JLabel entryHelp = new JLabel("Long result: click the box and use the Left/Right keys.");
        entryHelp.setBounds(30, 470, 640, 25);
        entryFrame.add(entryHelp);
        entryBackButton = new JButton("Back Home");
        entryBackButton.setBounds(240, 510, 200, 35);
        entryFrame.add(entryBackButton);
        entryBackButton.addActionListener(this);
        searchFrame = new JFrame("Search");
        searchFrame.setSize(700, 500);
        searchFrame.setLayout(null);
        recordIDButton = new JRadioButton("Record ID", true);
        recordIDButton.setBounds(30, 40, 260, 30);
        searchFrame.add(recordIDButton);
        projectNameButton = new JRadioButton("Project Name");
        projectNameButton.setBounds(30, 80, 260, 30);
        searchFrame.add(projectNameButton);
        buyerNameButton = new JRadioButton("Buyer Name");
        buyerNameButton.setBounds(340, 40, 300, 30);
        searchFrame.add(buyerNameButton);
        contractorNameButton = new JRadioButton("Contractor Name");
        contractorNameButton.setBounds(340, 80, 300, 30);
        searchFrame.add(contractorNameButton);
        ButtonGroup searchGroup = new ButtonGroup();
        searchGroup.add(recordIDButton);
        searchGroup.add(projectNameButton);
        searchGroup.add(buyerNameButton);
        searchGroup.add(contractorNameButton);
        JLabel searchValueLabel = new JLabel("Search Value");
        searchValueLabel.setBounds(30, 140, 200, 30);
        searchFrame.add(searchValueLabel);
        searchValueField = new JTextField();
        searchValueField.setBounds(240, 140, 400, 30);
        searchFrame.add(searchValueField);
        findButton = new JButton("Search");
        findButton.setBounds(160, 200, 150, 35);
        searchFrame.add(findButton);
        findButton.addActionListener(this);
        searchBackButton = new JButton("Back Home");
        searchBackButton.setBounds(340, 200, 180, 35);
        searchFrame.add(searchBackButton);
        searchBackButton.addActionListener(this);
        searchMessageLabel = new JLabel("");
        searchMessageLabel.setBounds(30, 260, 640, 30);
        searchFrame.add(searchMessageLabel);
        searchResultField = new JTextField();
        searchResultField.setBounds(30, 310, 610, 35);
        searchResultField.setEditable(false);
        searchFrame.add(searchResultField);
        JLabel searchHelp = new JLabel("Long result: click the box and use the Left/Right keys.");
        searchHelp.setBounds(30, 360, 640, 25);
        searchFrame.add(searchHelp);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == entryButton){
            entryFrame.setVisible(true);
        }
        if(e.getSource() == searchButton){
            searchFrame.setVisible(true);
        }
        if(e.getSource() == entryBackButton){
            entryFrame.setVisible(false);
        }
        if(e.getSource() == searchBackButton){
            searchFrame.setVisible(false);
        }
        if(e.getSource() == saveSalesButton || e.getSource() == savePaymentButton){
            String recordID = recordIDField.getText().trim();
            String projectName = projectNameField.getText().trim();
            String date = dateField.getText().trim();
            String amountText = amountField.getText().trim();
            String name = nameField.getText().trim();
            String detail = detailField.getText().trim();
            if(recordID.equals("") || projectName.equals("") || date.equals("")
                    || amountText.equals("") || name.equals("") || detail.equals("")){
                entryMessageLabel.setText("Please fill in all six fields.");
                return;
            }
            try{
                double amount = Double.parseDouble(amountText);
                if(amount <= 0 || !Double.isFinite(amount)){
                    entryMessageLabel.setText("Please enter a positive, finite amount.");
                    return;
                }
                for(FinancialRecord record : records){
                    if(record.getRecordID().equals(recordID)){
                        entryMessageLabel.setText("This Record ID already exists.");
                        return;
                    }
                }
                if(e.getSource() == saveSalesButton){
                    SalesReceipt receipt = new SalesReceipt(recordID, projectName, date, amount, name, detail);
                    records.add(receipt);
                }
                if(e.getSource() == savePaymentButton){
                    ConstructionPayment payment = new ConstructionPayment(recordID, projectName, date, amount, name, detail);
                    records.add(payment);
                }
                String allRecords = "";
                for(FinancialRecord record : records){
                    allRecords = allRecords + record.getSummary() + "    ||    ";
                }
                entryResultField.setText(allRecords);
                entryMessageLabel.setText("Saved. Total records: " + records.size());
            }
            catch(NumberFormatException ex){
                entryMessageLabel.setText("Amount must be a number, for example 2500.50.");
            }
        }
        if(e.getSource() == findButton){
            String value = searchValueField.getText().trim();
            searchResultField.setText("");
            if(value.equals("")){
                searchMessageLabel.setText("Please enter a search value.");
                return;
            }
            String result = "";
            for(FinancialRecord record : records){
                boolean match = false;
                if(recordIDButton.isSelected()){
                    match = record.getRecordID().equals(value);
                }
                if(projectNameButton.isSelected()){
                    match = record.getProjectName().equals(value);
                }
                if(buyerNameButton.isSelected() && record instanceof SalesReceipt){
                    SalesReceipt receipt = (SalesReceipt)record;
                    match = receipt.getBuyerName().equals(value);
                }
                if(contractorNameButton.isSelected() && record instanceof ConstructionPayment){
                    ConstructionPayment payment = (ConstructionPayment)record;
                    match = payment.getContructorName().equals(value);
                }
                if(match){
                    result = result + record.getSummary() + "    ||    ";
                }
            }
            searchResultField.setText(result);
            if(result.equals("")){
                searchMessageLabel.setText("No matching records.");
            }
            else{
                searchMessageLabel.setText("Matching records are shown below.");
            }
        }
    }
    public static void main(String[] args){
        new Main();
    }
}