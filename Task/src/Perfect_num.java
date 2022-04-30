
public class Perfect_num {
	public static void main(String[] args) {
		int number = 496;
	    int sum = 0;
	    int i = 1;
	    while(i<=number/2)
	    {
	        if(number%i == 0)
	        {
	        	System.out.println(i);
	            sum+=i;
	        }
	        i++;
	    }
	    if(sum == number)
	        System.out.println("It is Perfect Number");
	    else System.out.println("It is not Perfect Number");
		
		

	}

}
