import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Bike {
 
	public static void main(String[] args) {
	int num=1,remainder,result=0;
	
	while(num!=0) {
		remainder = num%10;// 153%10 15
		result +=Math.pow(remainder,3);//15^3
		num/=10;
		
	}
		if(result==num)
			System.out.println(num+"is an Amstrong num");
		else
			System.out.println(num+"is not ");
		

	}

}
