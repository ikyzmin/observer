package ui;

import javax.swing.*;
import java.awt.*;

public class Eye extends JComponent {

    public Eye(){
        setVisible(true);
        setOpaque(true);
        setSize(50, 50);
        setPreferredSize(new Dimension(50,50));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(0, 0, getWidth(), getHeight());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
