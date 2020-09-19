
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Font;
public class SelectTypes extends MainPage
{
    JPanel SelectTypesPanel;
    JButton btnBuy, btnSell;
    public static void main(String []args){
        
        new SelectTypes();

    }
    
    public SelectTypes(){
        frame();
        SelectTypesPanel();
    
    }
    
    public void SelectTypesPanel(){
        SelectTypesPanel = new JPanel();
        SelectTypesPanel.setBounds(0,0,850,800);
        SelectTypesPanel.setLayout(null);
        SelectTypesPanel.setVisible(true);
        frm.getContentPane().add(SelectTypesPanel);
        
        btnBuy = new JButton("Buy");
        btnBuy.setBounds(380,150,180,40);
        btnBuy.setFont(new Font("Ariel", Font.PLAIN, 15));
        SelectTypesPanel.add(btnBuy);
        
        btnSell = new JButton("Sell");
        btnSell.setBounds(380,230,180,40);
        btnSell.setFont(new Font("Ariel", Font.PLAIN, 15));
        SelectTypesPanel.add(btnSell);
    
    }

}
