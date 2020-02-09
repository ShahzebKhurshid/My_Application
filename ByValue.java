/**
 * ByValue.java demonstrates that arguments are passed by value
 */
public class ByValue {
	public static void main(String[] args) {
		// x is a local variable in main
		int x = 3;
		change(x);
		System.out.println("in the main method, x = " + x);
		// add code to change value of x using the update method
	}

	/** change() adds to the value of the parameter */
	public static void change(int x) {
		// x is a local variable in the change method 
		// NOT the same variable as in the main method
		x += 5;
		System.out.println("in the change method, x = " + x);
	}
	
	/** update method adds 5 to the value of the parameter and 
	 *  returns that value */
	// your code here
	println;
}
