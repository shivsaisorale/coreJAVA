package xworkz.com.patter;

public class Cristmase {

	void generate(int height) {
		System.out.println();
		int widthcounter = 1;
		for(int i=1;i<=height;i++) {
			int indent=height-i;
			for(int j=1;j<=indent;j++) {
				System.out.println(" ");
			}
			
			
			for(int j=1;j<=widthcounter; j++) {
				System.out.println("*");
				
			}
			System.out.println();
			
			widthcounter=widthcounter+2;
		}
		
	}
}
