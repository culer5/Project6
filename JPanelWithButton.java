/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanelWithButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
/**
 *
 * @author Scott Dickinson
 */
public class JPanelWithButton extends JPanel implements ActionListener
{
    JButton button = new JButton("Press me");
    Color color;
    String colorString;
    public JPanelWithButton()
    {
        color = Color.RED;
        colorString = "red";
        setBackground(color);
        add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (color.equals(Color.RED))
        {
            color=Color.BLUE;
            colorString = "blue";
        }
        else
        {
            color=Color.RED;
            colorString ="red";
        }
        setBackground(color);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString ("The panel is " + colorString,20,80);
    }
}
