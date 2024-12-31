package home.work;

public class CheckNumberIsPositive {
public static void main(String[] args) {
	int version = 0;
	System.out.print("The given Version number : " +version);
	if(version>0) {
		System.out.print(" is Positive");
	}
	else if(version<0){
		System.out.print(" is Negative");
	}
	else {
		System.out.println("  zero");
	}
}
}
