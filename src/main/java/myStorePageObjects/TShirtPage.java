package myStorePageObjects;

import framework.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TShirtPage extends PageObjectBase {

    public TShirtPage(WebDriver driver){
        super(driver);
    }

    By sortOption = By.xpath("//*[@id=\"selectProductSort\"]");
    By options = By.xpath("//*[@id=\"selectProductSort\"]/option");
    By selectedOption = By.xpath("//*[@id=\"selectProductSort\"]/option[1]");

    public void selectSortOption () {
        driver.findElement(sortOption).click();
    }

    public void selectOptionFromSortLit() {
        List<WebElement> allOptions = driver.findElements(options);
        for(WebElement option : allOptions){
            if(option.getText().equals("Price: Highest first")) {
                System.out.println(option.getText());
                option.click();
                break;
            }
        }

//        //Other way
//        WebElement dropDown = driver.findElement(sortOption);
//        Select dropDownOption = new Select(dropDown);
//        dropDownOption.selectByValue("price:desc");
    }

    public String selectedOptionText() {
        System.out.println(driver.findElement(selectedOption).getText());
        return driver.findElement(selectedOption).getText();
    }

}
