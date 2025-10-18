package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alert_Frames_WindowsPage{
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");


    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    private void switchToBigBox()
    {
//        driver.switchTo().frame(iFrameBigBox);
        switchToFrameString(iFrameBigBox);
    }
    private void switchToSmallBox()
    {
        switchToFrameElement(find(iFrameSmallBox));
       // when we use webelement then we should comment index utility method
        // switchToFrameIndex(2);

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

    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small frame text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
