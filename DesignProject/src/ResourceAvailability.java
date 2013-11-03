import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PGraphics;
import processing.core.PGraphicsJava2D;
import javax.swing.JOptionPane;
import controlP5.*; 

public class ResourceAvailability extends PApplet{
	
PFont f;
String typing = "";
String saved = "";
	
	public void setup(){
		//ResourceAvailability
		size(500,500);
		f = createFont ("Arial", 16,true);

	}
	public void draw() {
		
		background(255);
		int indent = 25;
		
		textFont(f);
		fill(0);
		
		//display
		text("If I could have any career I would choose ____", indent,40);
		text(typing, indent,90);
		text(saved, indent,130);
	}
		
//		stroke(255);
//		if (mousePressed) {
//			line(mouseX, mouseY,pmouseX,pmouseY);
//		}
		
	
	public void keyPressed() {
		
		if (key == '\n') {
			saved = typing;
			// A String can be cleared by setting it equal to ""
			typing = "";
					
		} else {
			// otherwise, concatenate the String
			// Each character typed by the user is added to the end of the string variable
			typing = typing + key;
		
		}
		
	}
	
	
	

}
