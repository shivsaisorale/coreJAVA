package xworkz.com.patter;

public class BubbleSort {

	public static void main(String[] args) {
		int []a= {36,19,24,21,54};
		int temp;
		for (int i=0;i <a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
				 
			{
				if(a[j] > a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		
		}
	for (int i=0;i<a.length;i++)
	{
		
		System.out.println(a[i]+"");
	}
	}
	
	
	
}
