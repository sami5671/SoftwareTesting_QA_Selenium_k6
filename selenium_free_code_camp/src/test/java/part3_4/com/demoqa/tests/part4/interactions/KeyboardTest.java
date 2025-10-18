package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard()
    {
       var textBoxPage = homePage.goToElements().clickTextBox();

        textBoxPage.setFullName("Md sami alam");
        textBoxPage.setEmail("samialam5671@gmail.com");
        textBoxPage.setCurrentAddress("Daffodil International University, Ashulia, Savar, Dhaka-1421");
        textBoxPage.setCurrentAddress("Dhaka-1421");
        textBoxPage.setCurrentAddress("Savar, Dhaka-1421");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Savar, Dhaka-1421"),
                "\n Actual Address Does Not Contain Savar, Dhaka-1421 \n");
    }
}
