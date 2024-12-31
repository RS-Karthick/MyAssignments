package week3.day1;

public class Subclass extends Superclass {
	public void employeeName() {
		System.out.println("Ajith");
	}
public void empname() {
	super.employeeName();
}
public static void main(String[] args) {
	Subclass sub = new Subclass();
	sub.employeeName();
	sub.empname();
}
}
