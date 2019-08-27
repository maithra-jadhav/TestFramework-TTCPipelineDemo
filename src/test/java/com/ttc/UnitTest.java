package com.ttc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Console;
import com.google.common.base.Verify;

public class UnitTest {

	
	  @Test public void canGoToHomePage() {
	  	  Pages.homePage().goTo(); 
	  	  Assert.assertTrue(Pages.homePage().isAt()); 
	  	  }
	  

	  @Test 
	  public void verifyFormCaption() { 
		  Assert.assertTrue(Pages.homePage().verifyFormCaption());
	  }
	  	
	  @Test 
	  public void verifyRegister() { 
		  Pages.homePage().goTo();
		  System. out. print("Go to Site");
		  String Message = Pages.homePage().register(); 
		  System. out. print("Register Finished");
		  Assert.assertEquals(Message,"Thank you for your registration!");
		  }
	 
	  @AfterClass
		public static void cleanUp() {
			Browser.close();
		}
	
}
