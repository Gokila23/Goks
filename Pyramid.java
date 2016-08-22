package MS2Logic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pyramid {
public static void main(String[] args) {
	
		InputStreamReader istream=new InputStreamReader(System.in);
		BufferedReader read=new BufferedReader(istream);
		System.out.println("Enter level of the pyramid");
		int d=1;
		int num=0;
		try
		{
			num=Integer.parseInt(read.readLine());
		}
		catch(Exception Number)
		{
			System.out.println("invalid number");
		}
		for(int i= 1;i<=num;i++)
		{
		for(int j=1;j<num-(i-1);j++)
		{
			//System.out.println("value of j"+j);
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
	        System.out.print(k);
			for(int k1=1;k1<k;k1+=k)
			{
				//System.out.println("value of k1"+k1);
				System.out.print(d++);
				if(d==10)
					d=1;
			}
			
		}
		System.out.println();
	}
	}
}
}
