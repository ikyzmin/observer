package ui;

import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Eye extends JComponent implements Subject, MouseListener {

    public static final int EYE_CLOSE = 1;
    public static final int EYE_OPEN = 1 << 1;


    private int state = EYE_OPEN;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Eye() {
        setVisible(true);
        setOpaque(true);
        setSize(50, 50);
        setPreferredSize(new Dimension(50, 50));
        addMouseListener(this);
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.clearRect(0, 0, getWidth(), getHeight());
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.BLACK);
        if (state == EYE_OPEN) {
            g.fillOval(0, 0, getWidth(), getHeight());
        } else {
            g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
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
        state = state == EYE_OPEN ? EYE_CLOSE : EYE_OPEN;
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
