package Test;

public class Passingandreturnparameter {

	public static void main (String [] args) {
	int sum= add(100,200 );
	int result = sum*10;
			System.out.println(result);
		
	}
	public static void sayHello(String name ) {
		System.out.println("hello " + name);
	}
	public static int add(int a,int b) {
		//System.out.println(a+ b);
		return(a +b);
		
	}
}



