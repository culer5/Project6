
package JPanelWithButton;
import javax.swing.*;
import java.awt.*;


public class JPanelDemoWithButton extends JFrame {
    JPanelWithButton p1 = new JPanelWithButton();
    public JPanelDemoWithButton()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(p1,BorderLayout.CENTER);
    }
    public static void main(String[] args)
    {
        JPanelDemoWithButton frame = new JPanelDemoWithButton();
        frame.setSize(200, 200);
        frame.setVisible(true);        
    }
  }
