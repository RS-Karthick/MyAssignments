package home.work;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 =0, num2=1, num3, range=8;
		for(int i=1; i<=range; i++)
		{
			System.out.print(num1 + " , ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		}


}
