package acc1;

public class AccessMod2 {
	
static AccessMod1 o=new AccessMod1();
	
	
	
	public static void main(String str[])
	{
		
		System.out.println(o.abc);
		
		System.out.println(AccessMod1.bool);
		
		System.out.println(o.str);
		
	}

}
