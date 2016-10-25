import java.util.*;
import javax.swing.JOptionPane;

public class Hypotenuse {
	
	private static int sideA = 0;
	private static int sideB = 0;
	
	public static void main(String[] args){
		
		System.out.println("Usage: Supply 2 integer values as triangle sides.");
		System.out.println("   A - integer value");
		System.out.println("   B - integer value");
		System.out.println("   C - attempt a pythagorean caculation");
		System.out.println("   Q - quit the program");
		
		String value;
		String side;
		char c;
		
		boolean carryOn = true;
		while(carryOn){
			
			side = JOptionPane.showInputDialog(null, "A or B?");
			c = side.charAt(0);
			
			switch(c){
			
			case'Q':
				carryOn = false;
				break;
			
			case 'A':
				value = JOptionPane.showInputDialog(null, "Enter A");
				sideA = Integer.parseInt(value);
				break;
			
			case 'B':
				value = JOptionPane.showInputDialog(null, "Enter B");
				sideB = Integer.parseInt(value);
				break;
			
			case 'C' : 
				double temp = (sideA * sideB) + (sideB * sideB);
				double result = java.lang.Math.sqrt(temp);
				System.out.println("The hypotenuse value is " + result);
				break;
			
			
			}
			
		}
		System.out.println("Thank you. Goodbye!");
		return;
	}

}


















