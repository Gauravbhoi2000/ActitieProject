package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

public class TaskTest extends BaseClass{
@Test
public void createCustomer() throws EncryptedDocumentException, IOException {
	  HomePage hp=new HomePage(driver);  
	  hp.getTasklnk().click();
	  
	  TaskPage tp=new TaskPage(driver);
	  tp.getAddnewbtn().click();
	  tp.getNewcust().click();
	  FileLibrary f=new FileLibrary();
	  String name = f.readDataFromExcelFile("Sheet1", 4, 1);
	  tp.getCustname().sendKeys(name);
	 String description = f.readDataFromExcelFile("Sheet1", 4, 2);
	  tp.getCustdesp().sendKeys(description);
	  tp.getCreatecust().click();
	  
	  
	  
}
}
