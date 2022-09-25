import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelena84\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kupujemprodajem.com/");
        WebElement boxCloseButton = driver.findElement(By.className("kpBoxCloseButton"));
        boxCloseButton.click();

        ////*[@id="category-tree-content-goods"]/a
        List<WebElement> elementList= driver.findElements(By.xpath("//*[@id=\"category-tree-content-goods\"]/a"));
        for(int i = 0; i< elementList.size(); i++){
            WebElement list = elementList.get(i);
            System.out.println(list.getText());
        }
////*[@id="category-tree-content-goods"]/a[10]
        List<WebElement> elementList1 = driver.findElements(By.xpath("//*[@id=\"category-tree-content-goods\"]/a"));
        for(int i = 0; i< elementList1.size(); i++){
            WebElement bicikl = elementList1.get(10);
            bicikl.click();
        }
        WebElement elektricniBicikl = driver.findElement(By.xpath("//*[@id=\"groupBox1360\"]/div[1]/h2/a"));
        elektricniBicikl.click();
        try {
            Thread.sleep(5000);
        }catch (
                InterruptedException e
        ){
            e.printStackTrace();
        }

        driver.quit();



        //  //*[@id="category-tree-content-goods"]/a[10]
        // //*[@id="category-tree-content-goods"]/a

        // //*[@id="category-tree-content-goods"]/a[10]



    }
}



