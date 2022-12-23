package Demo;

public class nestedif 
{

	public static void main(String[] args)
	{
		int age=50;
		
		if(age<=60)
		{
			System.out.println("Currently in service");
			int joiningyear=1996;
			if(joiningyear<2000)
			{
				System.out.println("Eligible for pension schme");
			}
			else
			{
				System.out.println("Not eligible for pension schme ");
			}
		}
		else
		{
			System.out.println("Retirement");
		}

	}

}
