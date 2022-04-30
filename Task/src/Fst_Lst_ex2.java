
public class Fst_Lst_ex2 {
	public static void main(String[] args) {
		int digit=542128, F_digit = 0,L_digit;
		L_digit = digit%10;
		System.out.println("Last Digit: "+L_digit);
		
		while(digit!=0)
		{
			F_digit = digit%10;
			digit= digit/10;
		}
		 System.out.println("First digit: "+F_digit);
	}

}
