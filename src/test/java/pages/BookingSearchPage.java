package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class BookingSearchPage extends BasePage {

    @FindBy(xpath = "//div[text()='DoubleTree By Hilton Antalya-Kemer']")
    private static List<WebElement> resultsLinks;

    public BookingSearchPage(WebDriver driver) {
        super(driver);
    }

    public static List<String> getResultLinks() {
        return resultsLinks.stream().map(result -> result.getAttribute("innerText"))
                .filter(result -> !result.isEmpty()).collect(Collectors.toList());
    }


}

