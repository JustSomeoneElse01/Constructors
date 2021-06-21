
class Machine {
	public Machine(int action) {
		System.out.println(action);
	}
	
	public Machine(String action) {
		System.out.println(action);
	}
	
	public Machine(int action1, String action2) {
		System.out.println(action1 + action2);
		new Machine(0, 0, 0);
	}
	
	public Machine(String action1, int action2) {
		System.out.println(action1 + action2);
	}
	
	public Machine(int e1, int e2, int e3) {
		System.out.println("    /\\");
		System.out.println("   /  \\");
		System.out.println("  /    \\");
		System.out.println(" /      \\");
		System.out.println("/________\\");
	}
}

public class Construct {

	public static void main(String[] args) {
		
		new Machine("Hello", 12);
		new Machine(100);
		new Machine("bruh");
		new Machine(123, "lol");
		new Machine(0, 0, 0);

	}

}
