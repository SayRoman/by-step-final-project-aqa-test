package by.step.finaly.project.aqa.test.service;

import by.step.finaly.project.aqa.test.page.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageService extends BaseService{

    private HomePage homePage = new HomePage(driver);

    public HomePageService(WebDriver driver) {
        super(driver);
    }

    public HomePage getHomePage() {
        return homePage;
    }


}
