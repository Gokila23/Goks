package MS01;

import java.util.Scanner;

public class AddLast {
	static void addReverse(int num[],int len)
	{
		int sum=0;
		for(int i=len-1;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				sum=sum+num[j];
			}
			
		}
		System.out.println("reverse add" +sum);
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int num1=num;
		int len=Integer.toString(num).length();
		int[] arr=new int[len];
		for(int i=len-1;i>=0;i--)
		{
			arr[i]=num1%10;
			num1=num1/10; 
			
		}
		addReverse(arr,len);
		
	}
}
		


