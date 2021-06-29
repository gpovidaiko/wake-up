package lab.gpovidaiko.wakeup;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class Main {

    private static final int FIVE_SECONDS = 5000;

    public static void main(String[] args) throws AWTException, InterruptedException {
        while (true) {
            Point location = Main.getPointerLocation();

            Main.setPointerLocation(location.x + 5, location.y + 5);
            // Main.setPointerLocation(location.x, location.y);

            Thread.sleep(FIVE_SECONDS);
        }
	}

    private static Point getPointerLocation() {
        Point location = MouseInfo.getPointerInfo().getLocation();

        return location;
    }
    
    private static void setPointerLocation(int x, int y) throws AWTException {
        Robot robot = new Robot();

        robot.mouseMove(x, y);
    }
    
}
