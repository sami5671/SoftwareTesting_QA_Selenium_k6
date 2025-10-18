package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.switchToDefaultContent;
import static utilities.SwitchToUtility.switchToFrameString;

public class FramesPage extends Alert_Frames_WindowsPage{
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    private void switchToBigBox()
    {
//        driver.switchTo().frame(iFrameBigBox);
        switchToFrameString(iFrameBigBox);
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big frame text: " + bigFrameText);
//        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
        switchToDefaultContent();
        return bigFrameText;
    }
}
