package Logic1;

import java.util.Scanner;

public class StringNum {
public static void main(String[] args) {
	int arr[]={7,6,8,16,12,3};
	int k=arr.length;
	int temp=arr[k-1];
	int ktm[]=new int[k];
	int a=2;
	ktm[0]=temp;
	for( int i=0;i<k&&a<=k;i++)
	{
		temp=arr[k-a]-temp;
		a++;
		temp=Math.abs(temp);
		ktm[i+1]=Math.abs(temp);
	}
	for(int j=k-1;j>=0;j--)
	{
		System.out.print(" " +ktm[j]);
	}
	
	}
}

	
