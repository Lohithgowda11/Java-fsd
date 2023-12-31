package phase_1_practiceassisment1;

public class Access {
	// Default field (no access modifier specified)
		int defaultField;

		// Public field
		public int publicField;

		// Protected field
		protected int protectedField;

		// Private field
		private int privateField;

		// Default method (no access modifier specified)
		void defaultMethod() {
			System.out.println("This is a default method.");
		}

		// Public method
		public void publicMethod() {
			System.out.println("This is a public method.");
		}

		// Private method
		private void privateMethod() {
			System.out.println("This is a private method.");
		}

		// Protected method
		protected void protectedMethod() {
			System.out.println("This is a protected method.");
		}



	public static void main(String[] args) {
		Access modifier = new Access();

		// Access default field (visible to classes in the same package)
		modifier.defaultField = 1;

		// Access public field (visible everywhere)
		modifier.publicField = 2;

		// Access protected field (visible to subclasses and classes in the same package)
		modifier.protectedField = 3;

		// Access private field (not visible outside of the class)
		// This will result in a compile-time error
		//modifier.privateField = 4;

		// Call protected method (visible to classes in the same package)
		modifier.defaultMethod();

		// Call public method (visible everywhere)
		modifier.publicMethod();

		// Call private method (visible to subclasses and classes in the same package)
		modifier.privateMethod();

		// Call private method (not visible outside of the class)
		// This will result in a compile-time error
		//modifier.privateMethod();


		
	}

}

