package Test;

public class labeledForloop {
	public static void main(String[] args) {
		aa:
		for(int i=1;i<=10;i++) {
			
			bb:
				
			for(int j=1;j<=10;j++) {
				if(i==2 && j==2) {
					continue aa;
				}
				else {
				System.out.println(i+" "+j);
				continue bb;
				}
				
			}
		}
	}

}
