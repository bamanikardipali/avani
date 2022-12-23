package Demo;

public class non_staticmethod 
{

	public static void main(String[] args) 
	{
		non_staticmethod A=new non_staticmethod();
		A.cubeof(5);
		A.cubeof(7);
		System.out.println("-----------------");
		Diffclass D=new Diffclass();
		D.squareof(6);
		D.squareof(8);
		

	}
	
	public void cubeof(int a)
	{
		System.out.println("Cube of= "+(a*a*a));
	}

}
