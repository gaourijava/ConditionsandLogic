package AddOddNo;

public class AddOdd  // 1 to 100 odd numbers
{
	public static void main(String args[])
	{
		int a=0;
		for(int i=1;i<=100;i++)
		{
			if(i %2!=0)
			{
				a=i+a;
				   System.out.println(i);  //if im not printing this line then
			//i will only get total addition of odd numbers.
				   //If i print this line then i will get all odd 
				//numbers printed and their addition
			}
		}
		System.out.println("Addition of odd numbers"   +a);
	}

}
