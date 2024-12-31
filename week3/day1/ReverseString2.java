package week3.day1;

public class ReverseString2 {
public static void main(String[] args) {
	
	String input ="i love you";
	String expectedOutput ="you love i";
	String actualOutput="";
	
	String[] split = input.split(" ");
	
	for(int i =split.length-1; i>=0; i--) {
//		System.out.print(split[i]+" ");
		
		actualOutput+=split[i]+" ";
	}

actualOutput = actualOutput.trim();
	System.out.println(actualOutput);
	
	if (expectedOutput.equals(actualOutput)) {
		System.out.println("Yes both are same");
	}
	else {
		System.out.println("no both are not same");
	}
	
	System.out.println(actualOutput);
	
	
//	for (String a : split) {
//		System.out.print(a);
//	}
//	for(int i=length-1; i>=0; i--)
		
//	
//	for (char c : charArray) {
//		System.out.print(c);
//		
//	}
	
	
}
}
