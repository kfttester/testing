package Test;

public class Dummy {
	public static void main(String [] args) {
		
	int a=70;
	if (a<50) {
		System.out.println("fail");
	}
	else if(a>=50&&a<60) 
	{
		System.out.println("d grade");
	}
	else if(a>=60&&a<70)
	{
		System.out.println("c grade");
		}
	else if(a>=70 && a<80)
	{
		System.out.println("b grade");
	}
	else if(a>=80 && a<90)
	{
		System.out.println("a grade");
	}
	else if(a>=90 && a<100)
	{
		System.out.println("a+ grade");
	}
	else 
	{System.out.println("invalid");	
	}
}
}
