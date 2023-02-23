package by.step.finaly.project.aqa.test.page;

import by.step.finaly.project.aqa.test.block.HomeBlock;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private HomeBlock homeBlock = new HomeBlock(driver);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomeBlock getHomePage() {
        return homeBlock;
    }


}
