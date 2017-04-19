import ui.FaceFrame;

import javax.swing.*;

/**
 * Created by Илья on 08.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FaceFrame faceFrame = new FaceFrame();
        });
    }
}
