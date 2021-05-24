package appium

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.WebElement

class IOSAppiumWrapper(driver: AppiumDriver<MobileElement>): AppiumWrapper(driver) {

    override fun findElementWithPlaceholder(placeholder: String): WebElement {
        TODO("Not yet implemented")
    }
}