import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //display GUI
                new WeatherAppGui().setVisible(true);
            }
        }); //invoke later queues the process thread as swing has concurrency issues and is not thread-safe

    }
}
