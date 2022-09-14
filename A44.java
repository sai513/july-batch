class A44 
{
	public static void main(String[] args) 
	{
		 char c1 = 'A';
		for (int i = 1,k = 1;i <= 5 ;i++,k +=2,c1++)
		{
			char c2 = c1;
			for (int j = 1;j <= 5 - i ;j++ )
			{
				System.out.print("  ");
			}
			    
				for (int j = 1 ;j <= k ;j++,c2--)
				{
					System.out.print(c2 +" ");

				}
				c1++;
				System.out.println();
			
		}
	}
}
