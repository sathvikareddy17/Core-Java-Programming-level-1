class MainClassA1 
{
	public void createPost()
	{
		System.out.println("create photo");
		publishPost();
		generatePost();
	}
	public void publishPost()
	{
		System.out.println("publish post");
	}

	public void generatePost()
	{
		System.out.println("genarate photo");
	}
	public static void main(String[] args) 
	{
		SocialMediaPost s1 = new SocialMediaPost();
		s1.createPost();
	}
	
}

