package CaseStudy2;

public class ArithematicOperator {
	
public static int result=0;

public static void main(String[] args) {
int X = 10;
 int Y = 2;

result = X+Y ;
 System.out.println("X+Y =  "+result);
 result = X- Y;
 System.out.println("X-y ="+result);
result = X*Y ;
 System.out.println("X*Y ="+result);
 result =Y/X;
System.out.println("Y/X ="+result);
result = X%3;
 System.out.println("X%3 = "+result);

result = X<<2;
System.out.println("Before left shift:"+X);
 System.out.println("After left shift :"+result );

boolean result = X == Y ;
System.out.println("X==y?"+result);
result = X != Y;

System.out.println("X != y?"+result);
result = X>Y;

System.out.println("X?y?"+result);
 result =X>=Y;
System.out.println("X>=y?"+result);
 result = X < Y;

System.out.println("X < y?"+result);
result= X <= Y;

System.out.println("X<= y? "+result);

int result1 = +X;
 System.out.println("+X ="+result1);
result1 = -Y;

 System.out.println("-Y = "+result1);
result1 =++X;

 System.out.println("++X "+result1);
result1 = --Y;

System.out.println("--Y ="+result1);
 boolean ok = false;

System.out.println("ok");
System.out.println(!ok);
}

}
