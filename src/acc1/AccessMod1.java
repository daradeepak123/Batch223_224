package acc1;

public class AccessMod1 {
	
	public int abc=500;
	
	String str="Quality thought";   // what is access modifier for str?
	
	protected static boolean bool=false;
	
	private double d=3.333;
	static AccessMod1 o=new AccessMod1();
	
	
	
	public static void main(String str[])
	{
	
		System.out.println(o.abc);
		
		System.out.println(bool);
		
		System.out.println(o.d);
		System.out.println(o.str);
		
	}
	
	

}
