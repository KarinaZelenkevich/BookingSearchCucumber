package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingMainPage extends BasePage {

    @FindBy(xpath = "//input[@type = 'search']")
    private WebElement searchField;
    @FindBy(xpath = "//div[@class='sb-searchbox__input sb-date-field__field  -empty sb-date__field-svg_icon']/span")
    private WebElement clickOnThePage;
    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement searchButton;

    public BookingMainPage(WebDriver driver) {
        super(driver);
    }


    public void searchByKeyword(String keyword) {
        searchField.sendKeys(keyword);
        searchButton.click();
    }

    public void setClickOnThePage(){
        clickOnThePage.click();
    }
}
