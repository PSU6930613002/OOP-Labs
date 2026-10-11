import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Main extends JFrame implements ActionListener{
    private ArrayList<FinancialRecord> records;
    private JButton entryButton;
    private JButton searchButton;
    private JButton entryBackButton;
    private JButton searchBackButton;
    private JFrame entryFrame;
    private JFrame searchFrame;
    public Main(){
        records = new ArrayList<FinancialRecord>();
        setTitle("java.lang");//Real Estate Finance
        setSize(450, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel title = new JLabel("Real Estate Finance", JLabel.CENTER);
        title.setBounds(75, 40, 300, 40);
        add(title);
        entryButton = new JButton("Data Entry");
        entryButton.setBounds(125, 105, 200, 35);
        add(entryButton);
        searchButton = new JButton("Search");
        searchButton.setBounds(125, 160, 200, 35);
        add(searchButton);
        entryButton.addActionListener(this);
        searchButton.addActionListener(this);
        entryFrame = new JFrame("java.lang");//Data Entry
        entryFrame.setSize(700, 600);
        entryFrame.setLayout(new FlowLayout());
        entryBackButton = new JButton("Back Home");
        entryFrame.add(new JLabel("Data Entry"));
        entryFrame.add(entryBackButton);
        entryBackButton.addActionListener(this);
        searchFrame = new JFrame("java.lang");//Search
        searchFrame.setSize(700, 600);
        searchFrame.setLayout(new FlowLayout());
        searchBackButton = new JButton("Back Home");
        searchFrame.add(new JLabel("Search"));
        searchFrame.add(searchBackButton);
        searchBackButton.addActionListener(this);
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
    }
    public static void main(String[] args){
        new Main();
    }
}