package gui;
import javax.swing.JOptionPane;

public class Swing {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name: ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm): "));
		JOptionPane.showMessageDialog(null, "Hi my name is " + name + ", I am " + age + " years old and " + height + "cm tall.");
	}

}
