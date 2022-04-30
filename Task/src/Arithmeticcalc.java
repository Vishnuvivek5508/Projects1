import java.util.Scanner;
public class Arithmeticcalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2");
		int num2 = sc.nextInt();
		System.out.println("Please enter the operation to perform");
		int Add = num1+num2;
		int Sub = num1-num2;
		int div = num1/num2;
		int mul = num1*num2;
		System.out.println("Addition : "+Add);
		System.out.println("Subtraction : "+Sub);
		System.out.println("division : "+div);
		System.out.println("multiplication : "+mul);
		
	}

}
