import java.util.Scanner;
class calcul{
	void multiplication() {
		int a,b,result;
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the a nd b value:");
		a= Sc.nextInt();
		b= Sc.nextInt();
		result= a*b;
		System.out.println("the result is "+result);
	}
	void division() {
		float x,y,result;
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the x nd y value:");
		x= Sc.nextFloat();
		y= Sc.nextFloat();
		result= x/y;
		System.out.println("the result is "+result);
}
	}
public class Operations {
	public static void main(String[] args) {
		calcul c1 = new calcul();
		c1.multiplication();
		c1.division();
	}
}


