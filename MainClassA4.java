class MainClassA4 
{
	public void addItem()
	{
		System.out.println("additem");
		calculateTotal();
	}
	public void removeItem()
	{
		System.out.println("remove item");
		calculateTotal();
	}
	public void checkout()
	{
		System.out.println("checkout");
		addItem();
		removeItem();
		genarativeInvoice();
	}
	public static void calculateTotal()
	{
		System.out.println("caltotal");
	}
	public static void genarativeInvoice()
	{
		System.out.println("gi");
	}
	public static void main(String[] args) 
	{
		MainClassA4 s1 = new MainClassA4();
		s1.checkout();
	}
}
