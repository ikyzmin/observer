package ui;

import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Илья on 08.04.2017.
 */
public class Nose extends JComponent implements Subject, MouseListener {


    private int state = 0;
    private ArrayList<Observer> observers = new ArrayList<>();

    private static final Path2D.Float noseShape = new Path2D.Float();

    private static final Color[] colors = {Color.BLUE, Color.CYAN, Color.WHITE, Color.RED, Color.GREEN, Color.GRAY};

    public Nose() {
        super();
        setVisible(true);
        setSize(50, 100);
        setPreferredSize(new Dimension(50, 100));
        noseShape.moveTo(getWidth() / 2, 0);
        noseShape.lineTo(getWidth(), getHeight());
        noseShape.lineTo(0, getHeight());
        noseShape.closePath();
        Random random = new Random();
        state = random.nextInt(colors.length - 1);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(colors[state]);
        graphics2D.fill(noseShape);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void notifySelf() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Random random = new Random();
        state = random.nextInt(colors.length - 1);
        if (observers.size() != 0) {
            for (Observer observer : observers) {
                observer.update(this);
            }
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
