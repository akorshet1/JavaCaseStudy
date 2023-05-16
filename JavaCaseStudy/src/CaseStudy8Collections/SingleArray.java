package CaseStudy8Collections;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		int Arraysize=a.length;
		
		System.out.println("Size of Array = " +Arraysize);
		
		
		for(int i=0;i<Arraysize;i++) {
			
			System.out.println("Array values = " +a[i]);
		}
		
		

	}

}
