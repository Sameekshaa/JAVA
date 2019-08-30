/* Create a  swing GUI with a button and two textfields.  WHen button is clicked, value of first text field should be checked and display odd/even in the second textfield. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  public class GUIDemo1 implements ActionListener {
      JFrame f1;
      JButton b1;
      JTextField t1, t2;
      GUIDemo1(){
          f1 = new JFrame();
          f1.setSize(400,400);
          f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f1.setLayout(new FlowLayout());
          t1 = new JTextField(20);
          t2 = new JTextField(20);
          b1 = new JButton("OK");
          f1.add(t1);
          f1.add(t2);
          b1.addActionListener(this);
          f1.add(b1);
          f1.setVisible(true);
      }
    public static void main(String[]args){
        new GUIDemo1();
      }
    @Override
      public void actionPerformed(ActionEvent e) {
      int a = Integer.parseInt (t1.getText());
      if ( a% 2 == 0){
        t2.setText("Even");
      }
      else{
        t2.setText("Odd");
      }
    }
  }