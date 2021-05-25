package pageObjects

import appium.AppiumWrapper
import pageObjects.base.BasePage

class AlertPage (appium: AppiumWrapper): BasePage(appium) {
    fun clickCancel(text: String): CreatenewContactPage{
        appiumWrapper.clickElementWithText(text)
        return CreatenewContactPage(appiumWrapper)
    }
}