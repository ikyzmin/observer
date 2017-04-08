package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Илья on 08.04.2017.
 */
public class Face extends JPanel {

    public Face() {
        setSize(250, 250);
    }

    public Dimension getPreferredSize() {
        return new Dimension(250,250);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(getX()/2, getY() / 2, getWidth(), getHeight());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
