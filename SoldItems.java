import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Font;
public class SoldItems extends MainPage
{
    JPanel SoldItemsPanel;
    JComboBox cmbitemNo, cmbquantityUnit;
    JLabel sell, itemNo,itemName, itemQuantity,quantityUnit, unitAmount, totalAmount, customerName, purchasedDate;
    JTextField txtitemName, txtitemQuantity, txtunitAmount, txttotalAmount, txtcustomerName, txtpurchasedDate;
    JButton ok, clear, back;
    
    public static void main(String []args){
        new SoldItems();
        

    }
    public SoldItems(){
        frame();
        SoldItemsPanel();
        
    }
    public void SoldItemsPanel(){
        SoldItemsPanel = new JPanel();
        SoldItemsPanel.setBounds(0,0,850,800);
        SoldItemsPanel.setLayout(null);
        SoldItemsPanel.setVisible(true);
        frm.getContentPane().add(SoldItemsPanel);
        
        sell = new JLabel("Sell");
        sell.setBounds(380, 10, 300,30);
        sell.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(sell);
        
        itemNo=new JLabel("Item No:");
        itemNo.setBounds(20,80,180,40);
        itemNo.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(itemNo);
        
        Integer itemNo[]={1,2,3,4,5};
        cmbitemNo =new JComboBox (itemNo);
        cmbitemNo.setBounds(120,80,120,40);
        cmbitemNo.setFont(new Font("Ariel", Font.PLAIN, 15));
        SoldItemsPanel.add(cmbitemNo);
        
        itemName=new JLabel("Item Name:");
        itemName.setBounds(20,130,180,40);
        itemName.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(itemName);
        
        txtitemName=new JTextField();
        txtitemName.setBounds(140,130,200,40);
        SoldItemsPanel.add(txtitemName);
        
        itemQuantity=new JLabel("Item Quantity:");
        itemQuantity.setBounds(20,180,180,40);
        itemQuantity.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(itemQuantity);
        
        txtitemName=new JTextField();
        txtitemName.setBounds(160,180,200,40);
        SoldItemsPanel.add(txtitemName);
        
        quantityUnit=new JLabel("Quantity Unit:");
        quantityUnit.setBounds(20,230,180,40);
        quantityUnit.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(quantityUnit);
        
        String quantityUnit[]={"pcs","box","sack"};
        cmbitemNo =new JComboBox (quantityUnit);
        cmbitemNo.setBounds(160,230,120,40);
        cmbitemNo.setFont(new Font("Ariel", Font.PLAIN, 15));
        SoldItemsPanel.add(cmbitemNo);
        
        unitAmount=new JLabel("Unit Amount:");
        unitAmount.setBounds(20,280,180,40);
        unitAmount.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(unitAmount);
        
        txtunitAmount=new JTextField();
        txtunitAmount.setBounds(160,280,180,40);
        SoldItemsPanel.add(txtunitAmount);
        
        totalAmount=new JLabel("Total Amount:");
        totalAmount.setBounds(20,330,180,40);
        totalAmount.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(totalAmount);
        
        txttotalAmount=new JTextField();
        txttotalAmount.setBounds(160,330,180,40);
        SoldItemsPanel.add(txttotalAmount);
        
        customerName=new JLabel("Supplier Name:");
        customerName.setBounds(20,380,180,40);
        customerName.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(customerName);
        
        txtcustomerName=new JTextField();
        txtcustomerName.setBounds(170,380,180,40);
        SoldItemsPanel.add(txtcustomerName);
        
        purchasedDate=new JLabel("Purchased Date:");
        purchasedDate.setBounds(20,430,180,40);
        purchasedDate.setFont(new Font("Ariel", Font.PLAIN, 20));
        SoldItemsPanel.add(purchasedDate);
        
        txtpurchasedDate=new JTextField();
        txtpurchasedDate.setBounds(180,430,180,40);
        SoldItemsPanel.add(txtpurchasedDate);
        
        ok = new JButton("Submit");
        ok.setBounds(440,130,180,40);
        ok.setFont(new Font("Ariel", Font.PLAIN, 15));
        SoldItemsPanel.add(ok);
        
        clear = new JButton("Clear");
        clear.setBounds(440,180,180,40);
        clear.setFont(new Font("Ariel", Font.PLAIN, 15));
        SoldItemsPanel.add(clear);
        
        back = new JButton("Back");
        back.setBounds(440,230,180,40);
        back.setFont(new Font("Ariel", Font.PLAIN, 15));
        SoldItemsPanel.add(back);
    
    }

}
