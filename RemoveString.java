package MS2Logic;

import java.util.Scanner;

public class RemoveString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a word");
	String sc;
	sc=s.nextLine();
	int len=sc.length();
	char ch;
	String ans="";
	for(int i=0;i<len;i++)
	{
		ch=sc.charAt(i);
		if(ch!=' ')
			ans=ans+ch;
		sc=sc.replace(ch, ' ');
	}
	System.out.println("word after removing duplicate character: " + ans);
}
}
