package calculatorAssignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Title: Calculator Asignment
 * Author: James Brown C00149037
 */

class calcBrain extends JFrame implements ActionListener{
  JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bMin,bMult,     //Variables
  		  bDiv,bEqu,bClear,bDecPoint,bEmpty3,bS1,bS2;
  JTextField name,greeting;
  JPanel pnl,pnl2;
  double num1=0,num2=0,s1=0,s2=0;
  double total=0;
  String oper;
  public calcBrain()	
  {
         addWindowListener(new WindowAdapter()
         {
        	public void windowClosing(WindowEvent e)
        	{
                System.exit(0);
            }
         });
         setSize(400,400);									//set Size and Title 
         setTitle("Calculator");
         setBackground(Color.lightGray);
         b0=new JButton("0");								//Create Buttons and Textfield
         b1=new JButton("1");
         b2=new JButton("2");
         b3=new JButton("3");
         b4=new JButton("4");
         b5=new JButton("5");
         b6=new JButton("6");
         b7=new JButton("7");
         b8=new JButton("8");
         b9=new JButton("9");
         b9=new JButton("9");
         bAdd=new JButton("+");
         bMin=new JButton("-");
         bMult=new JButton("x");
         bDiv=new JButton("÷");
         bEqu=new JButton("=");
         bClear=new JButton("Clear");
         bDecPoint = new JButton(".");
         bEmpty3 = new JButton("");
         bS1 = new JButton("S1");
         bS2 = new JButton("S2");
         greeting=new JTextField(10);
         Font font1 = new Font("SansSerif", Font.BOLD, 40);  //Create a font
         greeting.setFont(font1);							 //Set textfield to font
         
         
         JPanel pnl = new JPanel();							//Create Panels
         JPanel pnl2= new JPanel();
         
         
         
         pnl.setLayout(new GridLayout(5,5,10,10));			//Set Layout for Pnaels
         //pnl.setLayout(new BorderLayout());
         pnl2.setLayout(new FlowLayout());
         pnl2.add(greeting);								//Add Buttons and textfield to Panels
         pnl.add(bClear);
         pnl.add(bS1);
         pnl.add(bS2);
         pnl.add(bDiv);
         pnl.add(b7);
         pnl.add(b8);
         pnl.add(b9);
         pnl.add(bMult); 
         pnl.add(b4);
         pnl.add(b5);
         pnl.add(b6);
         pnl.add(bMin);
         pnl.add(b1);
         pnl.add(b2);
         pnl.add(b3);
         pnl.add(bAdd);
         pnl.add(bEmpty3);
         pnl.add(b0);
         pnl.add(bDecPoint);
         pnl.add(bEqu);
         add(pnl,"Center");
         add(pnl2,"North");
         
         b0.addActionListener(this);						//Add Action Listener				
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         bAdd.addActionListener(this);
         bMin.addActionListener(this);
         bDiv.addActionListener(this);
         bMult.addActionListener(this);
         bEqu.addActionListener(this);
         bClear.addActionListener(this);
         bDecPoint.addActionListener(this);
         bS1.addActionListener(this);
         bS2.addActionListener(this);
	}
  public void actionPerformed(ActionEvent e)				//Listen for events
  	{
         
         String n;											//Variables for calculations.
         JButton[] bArray = new JButton[4];
         bArray[0] = bAdd;
         bArray[1] = bMin;
         bArray[2] = bDiv;
         bArray[3] = bMult;

         if(e.getSource() == bS1)							//If bS1 is clicked
         {
        	 if(s1 == 0 && greeting != null)				//Check if a number has been saved in S1
        	 {												//Check if textfield not empty.
        		 n = greeting.getText();					//Get text and set it to variable n
        		 s1 = Double.parseDouble(n);				//Parse number from text and save to S1
        	 }
        	 else if(greeting != null)						//Is greeting not empty
        	 {
        		 greeting.setText(greeting.getText() + s1); //Add S1 to text
        	 }
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
          	{
          		bArray[i].setBackground(java.awt.SystemColor.control);
          	}
         }
         if(e.getSource() == bS2)							//Same as S1 calculations
         {
        	 if(s2 == 0 && greeting != null)
        	 {
        		 n = greeting.getText();
        		 s2 = Double.parseDouble(n);
        	 }
        	 else if(greeting != null)
        	 {
        		 greeting.setText(greeting.getText() + s2);
        	 }
        	 for(int i=0; i< 4; i++)
          	{
          		bArray[i].setBackground(java.awt.SystemColor.control);
          	}
         }
         
         if(e.getSource() == b0)							//If button 0 is clicked
         {
        	greeting.setText(greeting.getText() + "0");		//Add 0 to text in textfield
        	for(int i=0; i< 4; i++)							//Loop to change operand buttons back to default color
          	
        	{
        		bArray[i].setBackground(java.awt.SystemColor.control);
        	}
        	
         }
         else if(e.getSource() == b1)						//If button 1 is clicked
         {
        	greeting.setText(greeting.getText() + "1");		//Add 1 to text already in textfield
        	for(int i=0; i< 4; i++)							//Loop to change operand buttons back to default color
        	{												
        		bArray[i].setBackground(java.awt.SystemColor.control);
        	}
         }
         else if(e.getSource() == b2)						//If button 2 is clicked
         {
        	 greeting.setText(greeting.getText() + "2");	//Add 2 to text already in textfield
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
         	{
         		bArray[i].setBackground(java.awt.SystemColor.control);
         	}
         }
         else if(e.getSource() == b3)						//If button 3 is clicked
         {  
        	 greeting.setText(greeting.getText() + "3");	//Add 3 to text alraedy in text field
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
         	{
         		bArray[i].setBackground(java.awt.SystemColor.control);
         	}
         }
         else if(e.getSource() == b4)						// If button 4 is clicked
         {
        	 greeting.setText(greeting.getText() + "4");	//Add 4 to text already in text field
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
         	{
         		bArray[i].setBackground(java.awt.SystemColor.control);
         	}
         }
         else if(e.getSource() == b5)						//If button 5 is clicked
         {
        	 greeting.setText(greeting.getText() + "5");	//Add 5 to text already in text field
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
         	{
         		bArray[i].setBackground(java.awt.SystemColor.control);
         	}
         }
         else if(e.getSource() == b6)						//If button 6 is clicked
         {
        	 greeting.setText(greeting.getText() + "6");	//Add 6 to text already in text field
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
         	{
         		bArray[i].setBackground(java.awt.SystemColor.control);
         	}
         }
         else if(e.getSource() == b7)						//If button 7 is clicked 
         {
        	 greeting.setText(greeting.getText() + "7");	//Add 7 to text already in text field
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
         	{
         		bArray[i].setBackground(java.awt.SystemColor.control);
         	}
         }
         else if(e.getSource() == b8)						//If button 8 is clicked
         {
        	 greeting.setText(greeting.getText() + "8");	//Add 8 to the text already in the textfield
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
         	{
         		bArray[i].setBackground(java.awt.SystemColor.control);
         	}
         }
         else if(e.getSource() == b9)						//If button 9 is clicked
         {
        	 greeting.setText(greeting.getText() + "9");	//Add 9 to the text already in the text field
        	 for(int i=0; i< 4; i++)						//Loop to change operand buttons back to default color
         	{
         		bArray[i].setBackground(java.awt.SystemColor.control);
         	}
         }
         else if(e.getSource() == bDecPoint)				//If Decimal Point button is clicked
         {	
        	 int l = greeting.getText().length();			//Get length of text field
        	 String j = greeting.getText();
        	 boolean decP = false;			
        	 
        	 for(int i=0; i<l; i++)							//Loop through text field
        	 {
        		 if(j.charAt(i) == '.')
        		 {
        			 decP = true;							//If there is a decimal point, do nothing
        		 }
        	 }
        	 if(decP == false)								//If there is no decimal point, add decimal point
        	 {												//to text already in textfield
        		 greeting.setText(greeting.getText() + ".");  
        	 }	 
         }
         else if(e.getSource() == bAdd)						//If add button is clicked
         {
        	n = greeting.getText(); 						//Set n to text in text field
        	num1 = Double.parseDouble(n);					//parse double from n and set it to num1
        	greeting.setText("");							//set textfield to empty
        	oper = "+";										//set oper variable to +
        	bAdd.setBackground(Color.orange);				//change color of add button to orange
         }
         else if(e.getSource() == bMin)						//If minus button is clicked
         {
        	n = greeting.getText(); 						//Set n to text in text field
        	num1 = Double.parseDouble(n); 					//parse double from n and set it to num1
        	greeting.setText("");							//set textfield to empty
        	oper = "-";										//set oper variable to -
        	bMin.setBackground(Color.orange);				//change color of minus button to orange
         }
         else if(e.getSource() == bMult)					//If multiply button is clicked
         {
        	n = greeting.getText(); 						//Set n to text in text field
        	num1 = Double.parseDouble(n);					//parse double from n and set it to num1
        	greeting.setText("");							//set textfield to empty
        	oper = "*";										//set oper variable to *
        	bMult.setBackground(Color.orange);				//change color of multiply button to orange
         }
         else if(e.getSource() == bClear)					//If clear button is clicked
         {
        	greeting.setText("");							//Set text field to empty
        	for(int i=0; i< 4; i++)							//Loop to change operand buttons back to default color
        	{
        		bArray[i].setBackground(java.awt.SystemColor.control);
        	}
         }
         else if(e.getSource() == bDiv)						//If division button is clicked		
         {
        	n = greeting.getText(); 						//Set n to text in text field
        	num1 = Double.parseDouble(n);					//parse double from n and set it to num1
        	greeting.setText("");							//set textfield to empty
        	oper = "÷";										//set oper variable to ÷ 
        	bDiv.setBackground(Color.orange);				//change color of division button to orange
         }
         else if(e.getSource() == bEqu)						//If equals button is clicked	
         {	
        	 n = greeting.getText();						//Set n to text in text field
        	 num2 = Double.parseDouble(n);					//parse double from n and set it to num2
        	 	
        	 if(oper == "+")								//If operand is +
        	 {
        		 total = num1 + num2;						//Add the numbers together
        		 greeting.setText("" + total);				//Set text field to the result
        	 }
        	 if(oper == "-")								//If operand is -
        	 {
        		 total = num1 - num2;						//Take num2 away from num1
        		 greeting.setText("" + total);				//Set text field to the result
        	 }
        	 if(oper == "*")								//If operand is *
        	 {
        		 total = num1 * num2;						//multiply both numbers
        		 greeting.setText("" + total);				//Set text field to the result
        	 }
        	 if(oper == "÷")								//If operand is ÷
        	 {
        		 total = num1 / num2;						//divide num1 by num2
        		 greeting.setText("" + total);				//Set text field to the result
        	 }
         }
         
         
  }

}