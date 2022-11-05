package com.cydeo.test.day11_upload_actions_javascriptexecutor;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {
    @Test
    public void guru99_upload_test() throws InterruptedException {

        // 1. Go to https://demo.guru99.com/test/upload
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

        // 2. Upload file into Choose File
        WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
        chooseFile.sendKeys("C:\\Users\\Mali\\Desktop\\token\\token.txt");

        // 3. Click terms of service check box
        WebElement checkBoxTerms = Driver.getDriver().findElement(By.id("terms"));
        checkBoxTerms.click();

        // 4. Click Submit File button
        WebElement submit = Driver.getDriver().findElement(By.id("submitbutton"));
        submit.click();

        Thread.sleep(5000);
        // 5. Verify expected message appeared: "1 file has been successfully uploaded"
        WebElement resultMsg = Driver.getDriver().findElement(By.id("res"));

        String expectedMsg = "1 file\n" +
                "has been successfully uploaded.";
        String actualMsg = resultMsg.getText();
        Assert.assertEquals(actualMsg, expectedMsg);

    }

}
