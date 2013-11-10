import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PGraphics;
import processing.core.PGraphicsJava2D;
import javax.swing.JOptionPane;
import controlP5.*; 

public class ResourceAvailability extends PApplet{

ControlP5 cp5;	
PFont f;
String typing = "";
String saved = "";
String textValue = "";
	
	public void setup(){
		//ResourceAvailability
		size(700,400);
		f = createFont ("Arial", 16,true);
		cp5 = new ControlP5(this);
		cp5.addTextfield("input")
		.setPosition(20,100)
		.setSize(100,18)
		.setFont(f)
		.setFocus(true)
		.setColor(color(200,102,255))
		;
		//test

		
		

	}
	
	
	public void draw() {
		  background(255);
		 
		  int indent = 25;
		  fill(200, 102, 255);
//		  text("If I could have any career I would choose ____", indent,40);
//		  fill(0, 102, 153);
//		  text(cp5.get(Textfield.class,"input").getText(), 360,130);
		 saved = cp5.get(Textfield.class,"input").getText();
		 text("If I could have any career I would choose [ "+saved +" ].", indent,40);
		 
		  
		}

		public void clear() {
		  cp5.get(Textfield.class,"textValue").clear();
		  
		}

		public void controlEvent(ControlEvent theEvent) {
		  if(theEvent.isAssignableFrom(Textfield.class)) {
		    println("controlEvent: accessing a string from controller '"
		            +theEvent.getName()+"': "
		            +theEvent.getStringValue()
		            );
		  }
		}


		public void input(String theText) {
		  // automatically receives results from controller input
		  println("a textfield event for controller 'input' : "+theText);
		  
		  
		}


	
	
	
	
//	public void draw() {
//		
//		background(0);
//		int indent = 25;
//		
//		textFont(f);
//		fill(0);
//		
//		//display
//		text("If I could have any career I would choose ____", indent,40);
//		text(typing, indent,90);
//		text(saved, indent,130);
//	}
//		
////		stroke(255);
////		if (mousePressed) {
////			line(mouseX, mouseY,pmouseX,pmouseY);
////		}
//		
//	
//	public void keyPressed() {
//		
//		if (key == '\n') {
//			saved = typing;
//			// A String can be cleared by setting it equal to ""
//			typing = "";
//					
//		} else {
//			// otherwise, concatenate the String
//			// Each character typed by the user is added to the end of the string variable
//			typing = typing + key;
//		
//		}
//		
//	}
//	public void clear() {
//		  cp5.get(Textfield.class,"textValue").clear();
//		}
//
//		void controlEvent(ControlEvent theEvent) {
//		  if(theEvent.isAssignableFrom(Textfield.class)) {
//		    println("controlEvent: accessing a string from controller '"
//		            +theEvent.getName()+"': "
//		            +theEvent.getStringValue()
//		            );
//		  }
//		}
//
//
//		public void input(String theText) {
//		  // automatically receives results from controller input
//		  println("a textfield event for controller 'input' : "+theText);
//		}
//	
//	
//	
//	

}
