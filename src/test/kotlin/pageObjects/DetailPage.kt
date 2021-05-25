package pageObjects

import appium.AppiumWrapper
import pageObjects.base.BasePage

class DetailPage(appium: AppiumWrapper): BasePage(appium) {
    fun findName(name: String ){
        appiumWrapper.findElementWithText(name)
    }
}