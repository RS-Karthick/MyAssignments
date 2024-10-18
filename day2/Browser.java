package week1.day2;

public class Browser {
public void launchBrowser(String browserName) {
	System.out.println("Browser launched successfully  ");
	System.out.println("BrowserName is : " +browserName);
}
public void  loadUrl() {
	System.out.println("Application url loaded successfully" );
}
public static void main(String[] args) {
	Browser br = new Browser();
	br.launchBrowser("google");
	br.loadUrl();
}
}
