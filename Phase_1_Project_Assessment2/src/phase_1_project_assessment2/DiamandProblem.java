package phase_1_project_assessment2;

interface DemoInterface1 {
	public default void display() {
		System.out.println("the display() method of DemoInterface1 invoked");
	}
}

interface DemoInterface2 {
	public default void display() {
		System.out.println("the display() method of DemoInterface2 invoked");
	}
}

public class DiamandProblem implements DemoInterface1, DemoInterface2 {
	public void display() {

		DemoInterface1.super.display();
		DemoInterface2.super.display();
	}

	public static void main(String[] args) {
		DiamandProblem obj = new DiamandProblem();
		obj.display();

	}

}
