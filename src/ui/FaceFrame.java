package ui;

import javax.swing.*;
import java.awt.*;

public class FaceFrame extends JFrame {

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
        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);
        borderLayout.addLayoutComponent(face, BorderLayout.CENTER);
    }

}
