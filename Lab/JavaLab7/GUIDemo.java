/* Create a swing GUI that contain 3 buttons(Red, Green, Blue). When the buttons are clicked, their background color should be changed. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
    public class GUIDemo implements ActionListener{
        JFrame f1;
        JButton b1, b2, b3;
        JPanel p1;
        GUIDemo(){
            f1 = new JFrame();
            f1.setSize(300,300);
            f1.setLayout(new BorderLayout());
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
            b1 = new JButton("Red");
            b2= new JButton("Green");
            b3 = new JButton("Blue");

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);

            p1 = new JPanel();
            p1.add(b1); p1.add(b2); p1.add(b3);
            f1.add(p1, BorderLayout.CENTER);
            f1.setVisible(true);
    }
    public static void main(String[]args){
          new GUIDemo();
    }
    public void actionPerformed(ActionEvent e){
          if (e.getSource()==b1)
            b1.setBackground(Color.RED);
          else if (e.getSource()==b2)
            b2.setBackground(Color.GREEN);
          else
            b3.setBackground(Color.BLUE);
    }

}