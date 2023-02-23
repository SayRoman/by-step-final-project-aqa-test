package by.step.finaly.project.aqa.test.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeBlock extends BaseBlock{

    public HomeBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="VkIdCheckbox__name")
    public WebElement checkBoxName;

    @FindBy(className="VkIdCheckbox__checkboxOn")
    public WebElement checkBoxIsOn;

    @FindBy(className="VkIdCheckbox__checkboxOff")
    public WebElement checkBoxIsOFF;

    @FindBy(className="FlatButton__content")
    public WebElement flatButtonGoogle;

    @FindBy(className="FlatButton__content")
    public WebElement flatButtonGoogleContent;

    @FindBy(xpath="//*[@id=\"content\"]/div[1]/div[1]/div/div[1]/div[3]/div/a[1]")
    public WebElement linkGooglePlay;


}
