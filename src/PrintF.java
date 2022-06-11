
public class PrintF {

	public static void main(String[] args) {
//		printf() - an optional method to control, format, and display text to console window 
//				   two arguments = format string + (object/variable/value)
//				   % [flags] [precision] [width] [conversion-character]
		boolean myBoolean = true;
		char myChar = '@';
		String myName = "Aris";
		int myInt = 44;
		double myDouble = 1000;
		
		System.out.printf("%b \n", myBoolean);
		System.out.printf("%c \n", myChar);
		System.out.printf("%s \n", myName);
		System.out.printf("%d \n", myInt);
		System.out.printf("%,.2f \n", myDouble);
	}

}
