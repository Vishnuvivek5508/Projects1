import java.util.Scanner; 
public class Array_Ex3 {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		int mark[] = new int[5]; 
		for(int i=0; i< mark.length; i++)
		{
			System.out.println("Enter the value of"+i);
			mark[i] = Sc.nextInt();
			
		}
		for(int i=0; i< mark.length; i++)
		{
			System.out.println("The value of"+i);
			
			System.out.println(mark[i]);
		}
		}
		

}
