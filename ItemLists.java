
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Font;
public class ItemLists extends MainPage
{
    JPanel ItemListsPanel;
    JComboBox cmbitemNo, cmbquantityUnit;
    JLabel buy, itemNo,itemName, itemQuantity,quantityUnit, unitAmount, totalAmount, supplierName, purchasedDate;
    JTextField txtitemName, txtitemQuantity, txtunitAmount, txttotalAmount, txtsupplierName, txtpurchasedDate;
    JButton submit, clear, back;
    public static void main(String []args){
        new ItemLists();
        

    }
    public ItemLists(){
        frame();
        ItemListsPanel();
        
    
    }
    public void ItemListsPanel(){
        ItemListsPanel = new JPanel();
        ItemListsPanel.setBounds(0,0,850,800);
        ItemListsPanel.setLayout(null);
        ItemListsPanel.setVisible(true);
        frm.getContentPane().add(ItemListsPanel);
        
        buy = new JLabel("Buy");
        buy.setBounds(380, 10, 300,30);
        buy.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(buy);
        
        itemNo=new JLabel("Item No:");
        itemNo.setBounds(20,80,180,40);
        itemNo.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(itemNo);
        
        Integer itemNo[]={1,2,3,4,5};
        cmbitemNo =new JComboBox (itemNo);
        cmbitemNo.setBounds(120,80,120,40);
        cmbitemNo.setFont(new Font("Ariel", Font.PLAIN, 15));
        ItemListsPanel.add(cmbitemNo);
        
        itemName=new JLabel("Item Name:");
        itemName.setBounds(20,130,180,40);
        itemName.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(itemName);
        
        txtitemName=new JTextField();
        txtitemName.setBounds(140,130,200,40);
        ItemListsPanel.add(txtitemName);
        
        itemQuantity=new JLabel("Item Quantity:");
        itemQuantity.setBounds(20,180,180,40);
        itemQuantity.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(itemQuantity);
        
        txtitemName=new JTextField();
        txtitemName.setBounds(160,180,200,40);
        ItemListsPanel.add(txtitemName);
        
        quantityUnit=new JLabel("Quantity Unit:");
        quantityUnit.setBounds(20,230,180,40);
        quantityUnit.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(quantityUnit);
        
        String quantityUnit[]={"pcs","box","sack"};
        cmbitemNo =new JComboBox (quantityUnit);
        cmbitemNo.setBounds(160,230,120,40);
        cmbitemNo.setFont(new Font("Ariel", Font.PLAIN, 15));
        ItemListsPanel.add(cmbitemNo);
        
        unitAmount=new JLabel("Unit Amount:");
        unitAmount.setBounds(20,280,180,40);
        unitAmount.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(unitAmount);
        
        txtunitAmount=new JTextField();
        txtunitAmount.setBounds(160,280,180,40);
        ItemListsPanel.add(txtunitAmount);
        
        totalAmount=new JLabel("Total Amount:");
        totalAmount.setBounds(20,330,180,40);
        totalAmount.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(totalAmount);
        
        txttotalAmount=new JTextField();
        txttotalAmount.setBounds(160,330,180,40);
        ItemListsPanel.add(txttotalAmount);
        
        supplierName=new JLabel("Supplier Name:");
        supplierName.setBounds(20,380,180,40);
        supplierName.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(supplierName);
        
        txtsupplierName=new JTextField();
        txtsupplierName.setBounds(170,380,180,40);
        ItemListsPanel.add(txtsupplierName);
        
        purchasedDate=new JLabel("Purchased Date:");
        purchasedDate.setBounds(20,430,180,40);
        purchasedDate.setFont(new Font("Ariel", Font.PLAIN, 20));
        ItemListsPanel.add(purchasedDate);
        
        txtpurchasedDate=new JTextField();
        txtpurchasedDate.setBounds(180,430,180,40);
        ItemListsPanel.add(txtpurchasedDate);
        
        submit = new JButton("Submit");
        submit.setBounds(440,130,180,40);
        submit.setFont(new Font("Ariel", Font.PLAIN, 15));
        ItemListsPanel.add(submit);
        
        clear = new JButton("Clear");
        clear.setBounds(440,180,180,40);
        clear.setFont(new Font("Ariel", Font.PLAIN, 15));
        ItemListsPanel.add(clear);
        
        back = new JButton("Back");
        back.setBounds(440,230,180,40);
        back.setFont(new Font("Ariel", Font.PLAIN, 15));
        ItemListsPanel.add(back);
        
        
        
        
        
        
    
    }
    
    

}
