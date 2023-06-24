package phase_1_project_assessment2;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			// code that generates exception
			int divideByZero = 5 / 0;
		}

		catch (ArithmeticException e) {

			System.out.println("Given number can not be divisible by zero");
		}

		finally {
			System.out.println("This is the finally block");
		}

	}

}
