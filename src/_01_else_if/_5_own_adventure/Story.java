package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Story {
  public static void main(String[] args) {
	  JOptionPane.showMessageDialog(null, "(This story was created by ai)");
	  JOptionPane.showMessageDialog(null, "You live in a world where most of humanity has been destroyed. You are"
	  		+ " currently living in your bunker, when you hear a knock on the door");
	  String question = JOptionPane.showInputDialog(null, "Do you open it?");
	  if (question.equals("yes")) {
		  JOptionPane.showMessageDialog(null, "You open your door and see a man dressed in a fine suit, carrying a large bag.");
		  JOptionPane.showMessageDialog(null, "'Hello there', the man says while placing the bag on the floor.");
		  JOptionPane.showMessageDialog(null, "'My names David, and i'm here to help you with your situation'. You stare at the man, who is obviously nervous.");
		  String question1 = JOptionPane.showInputDialog(null, "suddenly, a large explosion happens and the ground shakes. David laughs. Do you run outside the bunker, or stay inside?");
		  if (question1.equals("bunker")) {
			  JOptionPane.showMessageDialog(null, "The bunkers explodes and collapses, killing you.");
		  } else if (question1.equals("outside")) {
			  JOptionPane.showMessageDialog(null, "you run outside, barely escaping the collapsing bunker");
			  JOptionPane.showMessageDialog(null, "David says I am the reason for the apoclypes! If you stop me from contuing my work, you will perish.'");
			  String question2 = JOptionPane.showInputDialog(null, "You notice a bomb on his jacket. Do you attempt to take it?");
			  if (question2.equals("yes")) {
				  JOptionPane.showMessageDialog(null, "You leap toward the bomb, however are pushed to the ground and stabbed. You died");
			  } else if (question2.equals("no")) {
				  JOptionPane.showMessageDialog(null, "You stand your ground and watch as he quickly takes the bomb and lights it. You run towards him, however he throws it and kills both of you.");
				  
			  }
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  } else if (question.equals("no")) {
		  String question1 = JOptionPane.showInputDialog(null, "The unknown person starts to bang on the door. You hear a small boom and the door busts open. Do you hide?");
		  if (question1.equals("yes")) {
			  JOptionPane.showMessageDialog(null, "The unknown man loots all of your belongings, and leaves you with nothing");
	  } else if (question1.equals("no")) {
		  JOptionPane.showMessageDialog(null, "You stand where you are, however the intruder attacks you with a knife. You die");
	  }
		  
	  }
  }
} 
