
public class Missingvalue {

	public static void main(String[] args) {
		
		int num1 = 0 , num2=1;
		int sum;
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …)
		for(int i=num1; i<=12; i++) {
			System.out.print(num1+" ");
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}

	}

}
