package week3.day1;

public class Browser {
String browserName = "InternetExplorer";
float browserVersion = 10.3f;
public void openURL() {
	System.out.println(browserName + " has been opened succesfully");
}
public void closeBrowser() {
	System.out.println(browserName + " has been closed successfully");
}
public void navigateBack() {
	System.out.println(browserName + " has been navigated back");
}
public static void main(String[] args) {
	Browser br = new Browser();
	br.openURL();
	br.closeBrowser();
	br.navigateBack();
}
}
