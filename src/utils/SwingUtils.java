package utils;

import javax.swing.*;

/**
 * Created by Илья on 08.04.2017.
 */
public class SwingUtils {

    public static void runOnAwt(Runnable run) {
        SwingUtilities.invokeLater(run);
    }
}
