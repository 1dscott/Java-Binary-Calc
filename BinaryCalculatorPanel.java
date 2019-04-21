//********************************************************************//
//--------------------------------------------------------------------//
//  Program: BinaryCalculatorPanel.java                               //
//  Description:                                                      //
//  Binary Calculator                                                 //
//--------------------------------------------------------------------//
//********************************************************************//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BinaryCalculatorPanel extends JPanel
{
   private JButton zero, one, equals, plus, minus, mult, divide, clear;
   private JPanel buttonPanel, textPanel;
   private JTextArea binaryCal;
   private int tempNum1 = 0;
   private int tempNum2 = 0;
   private byte function = -1;
   private BinaryDecimal bd = new BinaryDecimal();

   //-----------------------------------------------------------------
   //  Constructor: Sets up the GUI.
   //-----------------------------------------------------------------
   public BinaryCalculatorPanel()
   {
   
      //creates all needed buttons
      zero = new JButton("0");
      one = new JButton("1");          
      plus = new JButton("+");
      minus = new JButton("-");      
      mult = new JButton("*");
      divide = new JButton("/");
      clear = new JButton("C"); 
      equals = new JButton("=");
      
      //make sure no buttons are enabled
      plus.setEnabled(false); 
      minus.setEnabled(false); 
      mult.setEnabled(false); 
      divide.setEnabled(false); 
      equals.setEnabled(false); 
      
      //creates input text area
      binaryCal = new JTextArea();      

      //changes the buttons designs
      clear.setForeground(Color.RED);
           
      //creates listener
      ButtonListener listener = new ButtonListener();
      zero.addActionListener(listener);
      one.addActionListener(listener);            
      plus.addActionListener(listener);
      minus.addActionListener(listener);      
      mult.addActionListener(listener);
      divide.addActionListener(listener);
      equals.addActionListener(listener);
      clear.addActionListener(listener);
      
      //creates and adds panels
      textPanel = new JPanel();
      textPanel.setPreferredSize(new Dimension(140, 25));
      textPanel.setBackground(Color.white);
      textPanel.add(binaryCal);
      
      buttonPanel = new JPanel();
      buttonPanel.setPreferredSize(new Dimension(160, 135));
      buttonPanel.add(zero);
      buttonPanel.add(one);           
      buttonPanel.add(plus);
      buttonPanel.add(minus);     
      buttonPanel.add(mult);
      buttonPanel.add(divide);
      buttonPanel.add(equals);
      buttonPanel.add(clear); 

      setPreferredSize(new Dimension(170, 195));      
      
      add(textPanel);
      add(buttonPanel);
   }

   //listener - (all actions preforned when buttons pushed)
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {     
         //enter 0
         if (event.getSource() == zero)
         {  
            binaryCal.append(Integer.toString(0));
            plus.setEnabled(true); 
            minus.setEnabled(true); 
            mult.setEnabled(true); 
            divide.setEnabled(true); 
            equals.setEnabled(true);
            zero.setEnabled(true);  
         }
         
         //enter 1
         else if(event.getSource() == one)
         {
            binaryCal.append(Integer.toString(1));
            plus.setEnabled(true); 
            minus.setEnabled(true); 
            mult.setEnabled(true); 
            divide.setEnabled(true); 
            equals.setEnabled(true);
            zero.setEnabled(true);   
         }               
         
         //add
         else if(event.getSource() == plus)
         {
            if (tempNum1 == 0) 
            {
               tempNum1 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
               binaryCal.setText("");
               plus.setEnabled(false); 
               minus.setEnabled(false); 
               mult.setEnabled(false); 
               divide.setEnabled(false); 
               equals.setEnabled(false); 
            } 
            else 
            {
               tempNum2 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
               binaryCal.setText("");
               plus.setEnabled(false); 
               minus.setEnabled(false); 
               mult.setEnabled(false); 
               divide.setEnabled(false); 
               equals.setEnabled(false); 
            }
            function = 1;            
         }
        
         //subtract
         else if(event.getSource() == minus)
         {
            if (tempNum1 == 0) 
            {
               tempNum1 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
               binaryCal.setText("");
               plus.setEnabled(false); 
               minus.setEnabled(false); 
               mult.setEnabled(false); 
               divide.setEnabled(false); 
               equals.setEnabled(false); 
            } 
            else 
            {
               tempNum2 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
               binaryCal.setText("");
               plus.setEnabled(false); 
               minus.setEnabled(false); 
               mult.setEnabled(false); 
               divide.setEnabled(false); 
               equals.setEnabled(false); 
            }
            function = 2;                        
         }
         
         //multiply
         else if(event.getSource() == mult)
         {
            if (tempNum1 == 0) 
            {
               tempNum1 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
               binaryCal.setText("");
               plus.setEnabled(false); 
               minus.setEnabled(false); 
               mult.setEnabled(false); 
               divide.setEnabled(false); 
               equals.setEnabled(false); 
            } 
            else
            {
               tempNum2 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
               binaryCal.setText("");
               plus.setEnabled(false); 
               minus.setEnabled(false); 
               mult.setEnabled(false); 
               divide.setEnabled(false); 
               equals.setEnabled(false); 
            }
            function = 3;            
         }
         
         //divide
         else if(event.getSource() == divide)
         {
            if (tempNum1 == 0) 
            {
               tempNum1 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
               binaryCal.setText("");
               plus.setEnabled(false); 
               minus.setEnabled(false); 
               mult.setEnabled(false); 
               divide.setEnabled(false); 
               equals.setEnabled(false);
               zero.setEnabled(false);  
            } 
            else 
            {
               tempNum2 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
               binaryCal.setText("");
               plus.setEnabled(false); 
               minus.setEnabled(false); 
               mult.setEnabled(false); 
               divide.setEnabled(false); 
               equals.setEnabled(false);
               zero.setEnabled(false); 
            }
            function = 4;           
         }
         
         //clear
         else if(event.getSource() == clear)
         {
            binaryCal.setText("");             
            tempNum1 = 0;
            tempNum2 = 0;
            function = -1;
            plus.setEnabled(false); 
            minus.setEnabled(false); 
            mult.setEnabled(false); 
            divide.setEnabled(false); 
            equals.setEnabled(false); 
         }
         
         //equals
         else if(event.getSource() == equals)
         {
          int temp;
          tempNum2 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());

            if (function == 1) 
            {
               temp = tempNum1 + tempNum2;
               binaryCal.setText(BinaryDecimal.DecimalToBinary(temp));
            } 
            else if (function == 2) 
            {
               temp = tempNum1 - tempNum2;
               binaryCal.setText(BinaryDecimal.DecimalToBinary(temp));
            }
            else if (function == 3) 
            {
               temp = tempNum1 * tempNum2;
               binaryCal.setText(BinaryDecimal.DecimalToBinary(temp));
            }
            else if (function == 4) 
            {
               temp = Math.round((tempNum1 / tempNum2) * 100) / 100;
               binaryCal.setText(BinaryDecimal.DecimalToBinary(temp));
            }   
            else 
            {
               binaryCal.setText(BinaryDecimal.DecimalToBinary(tempNum1));
            }
            tempNum1 = BinaryDecimal.BinaryToDecimal(binaryCal.getText());
         }
      }
   }
}
