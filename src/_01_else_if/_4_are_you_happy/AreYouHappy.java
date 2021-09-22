package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
    String happy = JOptionPane.showInputDialog(null, "Are you happy?");
    
    if (happy.equals("yes")) {
    	JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
    } else if (happy.equals("no")) {
    	String unhappy = JOptionPane.showInputDialog("Do you want to be happy?");
    		if (unhappy.equals("no")) {
    			JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
    		} else if (unhappy.equals("yes")) {
    			JOptionPane.showMessageDialog(null, "Change something");
    		}
    	
    }
}
} 
