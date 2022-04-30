import java.util.Scanner;
public class Factorial {
 public static void main(String[] args) {
	 /*Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int i = sc.nextInt();*/
	int i =1,sum=0;
	do {
		System.out.println(sum);
		sum =sum+i;
		i++;
	}while(i<=5);
	System.out.println("sum:"+sum);
}
}
