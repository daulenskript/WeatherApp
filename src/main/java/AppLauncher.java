import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherAppGUI();
            }
        });
    }
}
//git remote set-url origin https://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/daulenskript/WeatherApp
