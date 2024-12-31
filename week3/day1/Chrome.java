package week3.day1;

public class Chrome extends Browser {
public void openIncognito() {
	System.out.println("OpenIcongnito windwo is opened");
}
public void clearCache() {
	System.out.println("ClearCache is done successfully");
}
public static void main(String[] args) {
	Chrome ch = new Chrome();
	ch.openIncognito();
	ch.clearCache();
	ch.openURL();
	ch.closeBrowser();
	ch.navigateBack();
}
}
