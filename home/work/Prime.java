package home.work;

public class Prime {
public static void main(String[] args) {
	int num = 13;
	System.out.println("Your given number is  : " +num);
	int k = 0;  // count
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)   
// 13%i (1 to 13 ) 13 % 0 = 0 & 13 % 13 = 0 ( these two times we will get zero answer )
		{
			k++; // count - if condition is zero K value increase
		}
	}
	if(k==2)    // if count - K value is 2 this statement will be executed
	{
		System.out.println("The numer : " +num + " is a prime number");
	}
	else  // if count - K value is not 2 this statement will be executed
	{
		System.out.println("The numer : " +num + "is not a prime number");
	}
}
}
