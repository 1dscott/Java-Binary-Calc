//********************************************************************//
//--------------------------------------------------------------------//
//  Program: BinaryCalculator.java                                    //
//  Description:                                                      //
//  Binary Calculator Driver                                          //
//--------------------------------------------------------------------//

import javax.swing.JFrame;

public class BinaryCalculator
{
   //-----------------------------------------------------------------
   //  Creates the main program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new BinaryCalculatorPanel());

      frame.pack();
      frame.setVisible(true);
   }
}
