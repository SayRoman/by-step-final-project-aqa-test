package pageForTest;

import by.step.finaly.project.aqa.test.base.BaseTestUIClass;
import by.step.finaly.project.aqa.test.service.HomePageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class HomePageTest extends BaseTestUIClass {

    private HomePageService homeService;


    @BeforeEach
    public void openHomePage () throws InterruptedException {
        driver.navigate().to("https://vk.com/");
    }

    @Test
    public void verifyCheckBoxIsDisplayed () {
        //Given
        homeService = new HomePageService(driver);

        //Then
        Assertions.assertEquals(true, homeService.getHomePage().getHomePage().checkBoxName.isDisplayed());

    }

    @Test
    public void verifyCheckBoxIsOn () {
        //Given
        homeService = new HomePageService(driver);

        //Then
        Assertions.assertEquals(true, homeService.getHomePage().getHomePage().checkBoxIsOn.isDisplayed());


    }

    @Test
    public void verifyCheckBoxIsClickable () {
        //Given
        homeService = new HomePageService(driver);

        //When
        homeService.getHomePage().getHomePage().checkBoxIsOn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

        //Then
        Assertions.assertEquals(true, homeService.getHomePage().getHomePage().checkBoxIsOFF.isDisplayed());

    }

    @Test
    public void verifyGoogleButton () {

        //Given
        homeService = new HomePageService(driver);


        //Then

        Assertions.assertEquals(true, homeService.getHomePage().getHomePage().flatButtonGoogle.isDisplayed());
        Assertions.assertEquals("https://play.google.com/store/apps/details?id=com.vkontakte.android", homeService.getHomePage().getHomePage().linkGooglePlay.getText());








    }




}
