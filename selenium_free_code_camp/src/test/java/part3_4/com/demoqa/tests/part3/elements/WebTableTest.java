package part3_4.com.demoqa.tests.part3.elements;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable(){
        var webTablePage =homePage.goToElements().clickWebTables();
        webTablePage.clickEdit("cierra@example.com");
        webTablePage.setAge("50");
        webTablePage.clickSubmitButton();
    }
}
