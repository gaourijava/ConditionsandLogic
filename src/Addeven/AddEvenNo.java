package Addeven;

public class AddEvenNo   //print 1 to 100 even numbers
{
	public static void main(String args[])
	{
		int a=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				a=i+a;
				System.out.println(i);
			}

		}
	System.out.println("Addition of Even No is " +a);


	}

}
