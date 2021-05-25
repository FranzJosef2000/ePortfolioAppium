package pageObjects

import appium.AppiumWrapper
import pageObjects.base.BasePage

class OverviewPage(appium: AppiumWrapper): BasePage(appium) {
    fun clickAddButton(id: String) : AlertPage{
        appiumWrapper.clickElementWithId(id)
        return AlertPage(appiumWrapper)
    }
}