package ui;

import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by Илья on 08.04.2017.
 */
public class Mouth extends JComponent implements Subject, MouseListener {

    public static final int MOUTH_SMILE = 1;
    public static final int MOUTH_NORMAL = 1 << 1;


    private int state = MOUTH_SMILE;
    private ArrayList<Observer> observers = new ArrayList<>();


    public Mouth() {
        super();
        setVisible(true);
        setSize(300, 150);
        setPreferredSize(new Dimension(300, 150));
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        g.setColor(Color.YELLOW);
        g.clearRect(0, 0, getWidth(), getHeight());
        g.fillRect(0,0,getWidth(),getHeight());
        graphics2D.setColor(Color.BLACK);
        if (state == MOUTH_SMILE) {
            graphics2D.drawArc(0, 0, getWidth(), getHeight(), 0, -180);
        } else {
            graphics2D.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        }
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
        repaint();
    }

    @Override
    public void notifySelf() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        state = state == MOUTH_SMILE ? MOUTH_NORMAL : MOUTH_SMILE;
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
