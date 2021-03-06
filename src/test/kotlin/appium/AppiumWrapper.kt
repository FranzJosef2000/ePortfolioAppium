package appium

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileBy
import io.appium.java_client.MobileElement
import org.openqa.selenium.WebElement

abstract class AppiumWrapper(var driver: AppiumDriver<MobileElement>) {

    fun hideKeyboard() {
        this.driver.hideKeyboard()
    }
    fun swipeUp(){
        val id = "contact_editor_scroller"
        val packageId = getPackageId()
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"$packageId:id/$id\")).scrollForward();"))
    }
    private fun getPackageId(): String {
        return driver.capabilities.getCapability("appPackage").toString()
    }

    fun clickElementWithText(text: String){
        findElementWithText(text).click()
    }
    fun clickElementWithId(id: String){
        findElementWithId(id).click()
    }
    abstract fun findElementWithPlaceholder(placeholder: String): WebElement
    abstract fun findElementWithText(text: String) : MobileElement
    abstract fun findElementWithId(id: String) : MobileElement
}
