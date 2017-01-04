import java.util.Scanner;

class Highestno 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Enter the numbers :");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && b>c) 
		{
			System.out.println("First number is the largest");
		}
		else if(b>a && b>c) 
		{
			System.out.println("Second number is the largest");
		}
		else if(c>a && c>b) 
		{
			System.out.println("Third number is the largest");
		}
		else
			System.out.println("Invalid numbers");

	}
}
