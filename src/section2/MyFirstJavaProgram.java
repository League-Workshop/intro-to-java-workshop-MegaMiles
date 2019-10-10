package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot jeff = new Robot();
	jeff.setSpeed(100);
	jeff.penDown();
	jeff.setRandomPenColor();
	
	
	for (int i = 0; i <4; i++) {
		
		jeff.turn(120);
		jeff.move(100);
		jeff.turn(120);
		jeff.move(100);
		jeff.turn(120);
		jeff.move(100);
			
	}
	}
}
