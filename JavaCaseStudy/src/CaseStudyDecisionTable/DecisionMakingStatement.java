package CaseStudyDecisionTable;

public class DecisionMakingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			If();
			IfElse();
			ElseIf();
			NestedLoop();
			SwitchCondn();
		}
		
		public static void If() {
			
			int a=10;
			
			if(a>5) {
				System.out.println("A is greater than 5 ");
			}
		}
		
		public static void IfElse() {
			
			int a=12;
			int b=6;
			
			if(a+b>20) {
				System.out.println("a+b is greater than 20");
			}else {
				System.out.println("a+b is less than 20");
			}
		}
		
		public static void ElseIf() {
			
			String city="Pune";
			
			if(city=="solapur") {
				System.out.println("your city is solapur");
			}
			else if(city=="indore") {
				System.out.println("Your city is indore");
			}else {
				System.out.println(city);
			}
		}
		
		public static void NestedLoop() {
			
	  int a=10;
			
			if(a==10) {
				
				System.out.println("A is equal to 10");
				if(a>10) {
					System.out.println("A is greater than 10");
				}else if(a<10){
					System.out.println("A is Less than than 10");
				}
			}else{
				System.out.println("A is not equal to 10");
			}
			
			
		}
		

			
			
		}

	

}
