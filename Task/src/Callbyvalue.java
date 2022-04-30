

	public class Callbyvalue {
		int val=150;//instance variable
		int operation(int val/*local variable*/) 
		{
			val =val*10/100;
			return(val);
		}
		public static void main(String args[]) {
			Callbyvalue d = new Callbyvalue();
			System.out.println("Before operation value of data is "+d.val);//150
			d.operation(100);
			System.out.println("After operation value of data is "+d.val);
		}
	}
	// In this case compiler is under confusion to differentiate between local and instance variable

	


