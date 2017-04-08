import ui.FaceFrame;
import utils.SwingUtils;

/**
 * Created by Илья on 08.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        SwingUtils.runOnAwt(() -> {
            FaceFrame faceFrame = new FaceFrame();
        });
    }
}
