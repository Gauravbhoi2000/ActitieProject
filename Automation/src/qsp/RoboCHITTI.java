package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RoboCHITTI {
	
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	Runtime.getRuntime().exec("Notepad");
	Robot chitti=new Robot();
	Thread.sleep(3000);
	chitti.keyPress(KeyEvent.VK_SHIFT);
chitti.keyPress(KeyEvent.VK_Q);
Thread.sleep(3000);
chitti.keyRelease(KeyEvent.VK_SHIFT);
chitti.keyPress(KeyEvent.VK_S);
Thread.sleep(3000);
chitti.keyPress(KeyEvent.VK_P);

	
}

}
