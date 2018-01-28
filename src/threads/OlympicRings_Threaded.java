package threads;

import java.awt.AWTException;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {

		Robot blue = new Robot(400,150);
		blue.setSpeed(10);
		blue.setPenColor(Color.blue);
		blue.penDown();
		
		Robot black = new Robot(700,150);
		black.setSpeed(10);
		black.setPenColor(Color.black);
		black.penDown();
		
		Robot red = new Robot(1000, 150);
		red.setSpeed(10);
		red.setPenColor(Color.red);
		red.penDown();
		
		Robot yellow = new Robot(550,300);
		yellow.setSpeed(10);
		yellow.setPenColor(Color.yellow);
		yellow.penDown();
		
		Robot green = new Robot(850,300);
		green.setSpeed(10);
		green.setPenColor(Color.green);
		green.penDown();

	

		new Thread(()->{
			for (int i = 0; i < 360; i++) {
			blue.turn(1);
			blue.move(2);
			}
		}).start();
		
		new Thread(()->{
			for (int i = 0; i < 360; i++) {
			black.turn(1);
			black.move(2);
			}
		}).start();

		new Thread(()->{
			for (int i = 0; i < 360; i++) {
			red.turn(1);
			red.move(2);
			}
		}).start();

		new Thread(()->{
			for (int i = 0; i < 360; i++) {
			yellow.turn(1);
			yellow.move(2);
			}
		}).start();
		
		new Thread(()->{
			for (int i = 0; i < 360; i++) {
			green.turn(1);
			green.move(2);
			}
		}).start();
}}


