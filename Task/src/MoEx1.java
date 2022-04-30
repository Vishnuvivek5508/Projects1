
public class MoEx1 {
	public void area(int b,int h)
    {
        System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(float b,int h)
    {
        System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int b,float h)
    {
        System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
        System.out.println("Area of Circle : "+(3.14*r*r));
    }
    public static void main(String args[])
    {
    	MoEx1 ob=new MoEx1();
        ob.area(10,12);
        ob.area(5);  
    }


}


