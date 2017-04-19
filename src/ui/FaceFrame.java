package ui;

import observer.Observer;

import javax.swing.*;
import java.awt.*;

public class FaceFrame extends JFrame implements Observer {

    public FaceFrame() {
        super("Obeserver");
        setSize(500, 500);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
    }

    private void init() {
        Face face = new Face();
        Eye leftEye = new Eye();
        Eye rightEye = new Eye();
        Nose nose = new Nose();
        Mouth mouth = new Mouth();
        face.setLayout(null);
        add(face);
        leftEye.setBounds(100, 100, leftEye.getWidth(), leftEye.getHeight());
        rightEye.setBounds(350, 100, leftEye.getWidth(), leftEye.getHeight());

        nose.setBounds(face.getWidth() - nose.getWidth() / 2, face.getHeight() - nose.getHeight() / 2, nose.getWidth(), nose.getHeight());
        mouth.setBounds(face.getWidth() - mouth.getWidth() / 2, 250, mouth.getWidth(), mouth.getHeight());
        face.add(nose);
        face.add(leftEye);
        face.add(rightEye);
        face.add(mouth);
        nose.attach(this);
        leftEye.attach(this);
        rightEye.attach(this);
        mouth.attach(this);


    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof Eye) {
            System.out.println(String.format("eye is %s", subject.getState() == Eye.EYE_CLOSE ? "closed" : "open"));
        }
        if (subject instanceof Nose) {
            System.out.println("Nose changed his color");
        }
        if (subject instanceof Mouth) {
            System.out.println(subject.getState() == Mouth.MOUTH_SMILE ? "Smile face" : "Normal face");
        }
    }
}
