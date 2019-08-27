package com.ttc;

public class HomePage extends Pages {
	static String url = "https://pipeline-demo-testing.testingconsultancy.com/";
	static String title = "TTC Pipeline Demo - Enter your data";
	static String img = "//img[@class='pipelinedemoHeaderContentLogo'] ";
	static String formCaption = "Please enter your data";
	
	/*public boolean isImgDisplayed() {
	//	return Browser.img().equals(img);

}*/
	public String register() {
		return Browser.register();
	}
	public boolean verifyFormCaption() {
		return Browser.verifyCaption().equals(formCaption);
		 		
	}
	@Override
	public void goTo() {
		Browser.goTo(url);
	}
	@Override
	public boolean isAt() {
		return Browser.title().equals(title);
		
	}
}
