package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Илья on 08.04.2017.
 */
public class Mouth extends JComponent {

    public Mouth() {
        super();
        setVisible(true);
        setSize(300, 150);
        setPreferredSize(new Dimension(300, 150));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawArc(0,0,getWidth(),getHeight(),0,-180);
    }
}
