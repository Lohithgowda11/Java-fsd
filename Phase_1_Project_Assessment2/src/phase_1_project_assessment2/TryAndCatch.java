package phase_1_project_assessment2;

public class TryAndCatch {
	public static void main(String[] args) {

		int a = 2, b = 5, c = 5;
		int result;
		try {
			result = a / (b - c);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divided by zero." + e);
		}

		result = a / (b + c);
		System.out.println("Result: " + result);

	}

}

