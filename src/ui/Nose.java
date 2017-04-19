package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.util.Random;

/**
 * Created by Илья on 08.04.2017.
 */
public class Nose extends JComponent {

    private static final Path2D.Float noseShape = new Path2D.Float();

    private static final Color[] colors = {Color.BLUE, Color.YELLOW, Color.WHITE, Color.RED, Color.GREEN, Color.GRAY};

    public Nose() {
        super();
        setVisible(true);
        setSize(50, 100);
        setPreferredSize(new Dimension(50, 100));
        noseShape.moveTo(getWidth() / 2, 0);
        noseShape.lineTo(getWidth(), getHeight());
        noseShape.lineTo(0, getHeight());
        noseShape.closePath();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        Random random = new Random();
        graphics2D.setColor(colors[random.nextInt(colors.length - 1)]);
        graphics2D.fill(noseShape);
    }
}
