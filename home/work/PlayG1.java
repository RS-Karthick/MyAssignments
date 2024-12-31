package home.work;

public class PlayG1 {

	public static void main(String[] args) {

		// Write your code here		
int num = 13;
      int count =0;
      for(int i=1;i<=num;i++)
      {
        if(num%i==0)
        {
          count++;
        }
      }
      if(count==2)
      {
        System.out.println("True : " +num +" is Prime number ");
      }
      else
      System.out.println("False : " +num +" is not prime number ");
	}
}

