class Car{
	String company;
    String color;
    long price;
    
    
    void speed() {
        System.out.println("Car Speed 220 kh ");
    }
    void issue()
    {
        System.out.println("Some problem in Car");
    }
     public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car c = new Car();
        c.company="Mahindra Scripo";
        c.color="Black";
        c.price=1800000;
        
        System.out.println("Company Name "+c.company);
        System.out.println("Car Color "+c.color);
        System.out.println(" Prise "+c.price);
        
        
        c.speed();
        c.issue();
    }
}

