package appium

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

class AndroidAppiumWrapper(driver: AppiumDriver<MobileElement>): AppiumWrapper(driver) {

    override fun findElementWithPlaceholder(placeholder: String): WebElement {
        return driver.findElement(By.xpath("//*[@placeholder='$placeholder']"))
    }

    override fun findElementWithText(text: String): MobileElement {
        return driver.findElement(By.xpath("//*[@text='$text']"))
    }

    override fun findElementWithId(id: String): MobileElement {
        //return driver.findElement(By.xpath("//*[@id='$id']"))
        return driver.findElement(By.id(id))
    }

}