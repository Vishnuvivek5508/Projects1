import java.util.Scanner;
public class Array_Ex2 {
	public static void main(String[] args) {
		int i,j; int mark[][]= new int[3][4];
		Scanner Sc = new Scanner(System.in);
		for(i=0; i<=2; i++)
		{
			for(j=0; j<4; j++)
			{
				System.out.print("Enter the value for " +i+","+j + " : ");
				mark[i][j]= Sc.nextInt();
			}
		
		}
		for(i=0; i<=2; i++)
		{
			for(j=0; j<4; j++)
			{
				System.out.print(mark[i][j]+" ");
			}
			System.out.println();
			}

}
}
