package AccessModifier;

class C_01_Private {
	int a = 143;

	private void sum() {

		System.out.println("This is a private access modifier");
	}

	protected int b = 100;

	public void C_Public() {
		System.out.println("This is a public access modifier");
	}

}

public class CaseStudy01 {

	public static void main(String[] args) {
		// use variable int a =143
		// call this variable in pubic access modifier
		C_01_Private obj = new C_01_Private();
		System.out.println(obj.a);
		obj.C_Public();
		System.out.println(obj.b);

	}

}
