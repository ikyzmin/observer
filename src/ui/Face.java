package ui;

import javax.swing.*;
import java.awt.*;

public class Face extends JComponent {

    public Face() {
        super();
        setVisible(true);
        setSize(250, 250);
        setPreferredSize(new Dimension(250, 250));
    }

    public Dimension getPreferredSize() {
        return new Dimension(250, 250);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(Color.YELLOW);
        graphics2D.fillOval(getX() / 2, getY() / 2, getWidth(), getHeight());

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
