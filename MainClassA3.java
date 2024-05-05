class MainClassA3 
{
	public static void convertFahrenheit()
	{
		System.out.println("fh");
		MainClassA3 a1 = new MainClassA3();
		a1.setCelsiusTemperature();
		//MainClassA3 a2 = new MainClassA3();
		a1.displayResult();

	}
	public void setCelsiusTemperature()
	{
		System.out.println("ct");
	}
	public void displayResult()
	{
		System.out.println("dr");
	}
	public static void main(String[] args) 
	{
		convertFahrenheit();
	}
}
