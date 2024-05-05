class MainClassA5 
{
	public void addIngredient()
	{
		System.out.println("addIngredient");
		removeIngredient();
		//prepareRecipe();
	}
	public void removeIngredient()
	{
		System.out.println("removeIngredient");
		calculateTotalCalories();
	}
	public void prepareRecipe()
	{
		System.out.println("prepareRecipe");
		addIngredient();
	}
	public static void calculateTotalCalories()
	{
		System.out.println("caltotalcalories");
	}
	public static void printRecipe()
	{
		System.out.println("printRecipe");
	}
	
	public static void main(String[] args) 
	{
		MainClassA5 s1 = new MainClassA5();
		s1.prepareRecipe();
	}
}
