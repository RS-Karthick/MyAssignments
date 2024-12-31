package week3.day1;

public class MethodOverLoading {
public void reportStep(String msg, String status) {
	System.out.println(msg + " " + status);
}
public void reportStep(String msg, String status, boolean snap) {
	System.out.println(msg + " " + status + " " + snap);
}
public static void main(String[] args) {
	MethodOverLoading mover = new MethodOverLoading();
	mover.reportStep("google","opened");
	mover.reportStep("opera", "working", true);
}
}
