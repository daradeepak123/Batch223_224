package abstractionLearn;

import java.util.Scanner;

public class Travveller {
	
	static int a=100;
	static Country c;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your destination");
		String dest=sc.next();
		
		if(dest.equalsIgnoreCase("india"))
		{
			c=new India();
		}
		else if(dest.equalsIgnoreCase("pak"))
		{
			c=new Pakisthan();
		}
		
		
		c.currency();
		

	}

}
