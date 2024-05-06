class Car 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts ....");
		Car t1 = new Car();
		t1.driving(187);
		System.out.println("Main ends...");

	}
	public void driving(int speed)
	{
		System.out.println("Speed of the car while driving");
		racing(200);
		System.out.println("Driving ended");

	}
	public void racing(int speed)
	{
		System.out.println("Speed of the car while racing");
		System.out.println("Racing ended");
	}
}
