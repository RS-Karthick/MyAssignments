package MapAndString;

import java.util.Iterator;

public class ReverseString1 {
public static void main(String[] args) {
	
	String x = "Hello";
	String output="";
	String k="";
	int[] a = {10,11,12,13};
	
	char[] charArray = x.toCharArray();
	int length = charArray.length;
	System.out.println(length);
//	System.out.println(length-1);
	
	for(int i=length-1; i>=0; i--) {
		System.out.print(charArray[i]);
		
	output= output+charArray[i];
		
//		k= k+charArray[i];
		
		
	
	}
System.out.println("\nThe reverse string is : "+output);

for(int i=a.length-1; i>=0; i--) {
	System.out.print(a[i]+" ");
}

System.out.println("\n"+a[2]);
}
}
