package calculatorAssignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Title: Calculator Asignment
 * Author: James Brown C00149037
 */

public class calc {

  public calc() {
  }

  public static void main(String[] s){
    Frame f=new calcBrain();				
    f.setVisible(true);
    Font a=new Font("Serif",Font.PLAIN,16);
    f.setFont(a);
  }
}