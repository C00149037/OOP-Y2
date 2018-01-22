package Calculator;

import java.awt.*;
import java.awt.event.*;

/**
 * Title: Calculator Asignment
 * Author: James Brown C00149037
 */

class CalcatorBrain extends Frame implements ActionListener{
  Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bMin,bMult,bDiv,bEqu,bClear;
  TextField name,greeting;
  Panel pnl,pnl2;
  int num1=0,num2=0;
  int total=0;
  String oper;
  public void CalculatorBrain()	
  {
         addWindowListener(new WindowAdapter()
         {
        	public void windowClosing(WindowEvent e)
        	{
                System.exit(0);
            }
         });
         setSize(300, 300 );
         setTitle("Calculator");
         //setLayout(new GridLayout(2,2));
         setBackground(Color.lightGray);
         b0=new Button("0");
         b1=new Button("1");
         b2=new Button("2");
         b3=new Button("3");
         b4=new Button("4");
         b5=new Button("5");
         b6=new Button("6");
         b7=new Button("7");
         b8=new Button("8");
         b9=new Button("9");
         b9=new Button("9");
         bAdd=new Button("+");
         bMin=new Button("-");
         bMult=new Button("x");
         bDiv=new Button("/");
         bEqu=new Button("=");
         bClear=new Button("Clear");
         name=new TextField(10);
         greeting=new TextField(15);
         Panel pnl = new Panel();
         Panel pnl2= new Panel();
         pnl.setLayout(new GridLayout(4,4,10,10));
         pnl2.setLayout(new FlowLayout());
         pnl2.add(greeting);
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
         pnl.add(bClear);
         pnl.add(b0);
         pnl.add(bDiv);
         pnl.add(bEqu);
         add(pnl,"South");
         add(pnl2,"North");
        
         
         b0.addActionListener(this);
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
	}
  public void actionPerformed(ActionEvent e){
         
         String n;
         
         if(e.getSource() == b0)
         {
        	greeting.setText(greeting.getText() + "0");
        	
         }
         else if(e.getSource() == b1)
         {
        	greeting.setText(greeting.getText() + "1");
         }
         else if(e.getSource() == b2)
         {
        	 greeting.setText(greeting.getText() + "2");
         }
         else if(e.getSource() == b3)
         {  
        	 greeting.setText(greeting.getText() + "3");
         }
         else if(e.getSource() == b4)
         {
        	 greeting.setText(greeting.getText() + "4");
         }
         else if(e.getSource() == b5)
         {
        	 greeting.setText(greeting.getText() + "5");
         }
         else if(e.getSource() == b6)
         {
        	 greeting.setText(greeting.getText() + "6");
         }
         else if(e.getSource() == b7)
         {
        	 greeting.setText(greeting.getText() + "7");
         }
         else if(e.getSource() == b8)
         {
        	 greeting.setText(greeting.getText() + "8");
         }
         else if(e.getSource() == b9)
         {
        	 greeting.setText(greeting.getText() + "9");
         }
         else if(e.getSource() == bAdd)
         {
        	n = greeting.getText(); 
        	num1 = Integer.parseInt(n);
        	greeting.setText("+");
        	oper = "+";
         }
         else if(e.getSource() == bMin)
         {
        	n = greeting.getText(); 
        	num1 = Integer.parseInt(n);
        	greeting.setText("-");
        	oper = "-";
         }
         else if(e.getSource() == bMult)
         {
        	n = greeting.getText(); 
        	num1 = Integer.parseInt(n);
        	greeting.setText("*");
        	oper = "*";
         }
         else if(e.getSource() == bClear)
         {
        	greeting.setText("");
         }
         else if(e.getSource() == bDiv)
         {
        	n = greeting.getText(); 
        	num1 = Integer.parseInt(n);
        	greeting.setText("/");
        	oper = "/";
         }
         else if(e.getSource() == bEqu)
         {	
        	 n = greeting.getText();
        	 num2 = Character.getNumericValue(n.charAt(1));
        	 //num2 = Integer.parseInt(n);
        	 if(oper == "+")
        	 {
        		 total = num1 + num2;
        		
        		 greeting.setText("" + total);
        	 }
        	 if(oper == "-")
        	 {
        		 total = num1 - num2;
        		 
        		 greeting.setText("" + total);
        	 }
        	 if(oper == "*")
        	 {
        		 total = num1 * num2;
        		 greeting.setText("" + total);
        	 }
        	 if(oper == "/")
        	 {
        		 total = num1 / num2;
        		 greeting.setText("" + total);
        	 }
         }
         
         
  }

}