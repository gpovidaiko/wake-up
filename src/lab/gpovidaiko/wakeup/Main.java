package lab.gpovidaiko.wakeup;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class Main {

	private static final int ONE_MINUTE = 60000;
	private static final int COORD_SHIFT = 5;

	public static void main(String[] args) throws AWTException, InterruptedException {
		while (true) {
			Main.shakePointer();

			Thread.sleep(ONE_MINUTE);
		}
	}

	private static void shakePointer() throws AWTException {
		Point location = MouseInfo.getPointerInfo().getLocation();

		Main.setPointerLocation(location.x + COORD_SHIFT, location.y + COORD_SHIFT);
		Main.setPointerLocation(location.x, location.y);
	}

	private static void setPointerLocation(int x, int y) throws AWTException {
		Robot robot = new Robot();

		robot.mouseMove(x, y);
	}

}
