package week3.day1;

public class Superclass {
public void employeeName() {
	System.out.println("Karthick");
}
public void employeeNumber() {
	System.out.println(46589);
}
public static void main(String[] args) {
	Superclass sp = new Superclass();
	sp.employeeName();
	sp.employeeNumber();
}
}
