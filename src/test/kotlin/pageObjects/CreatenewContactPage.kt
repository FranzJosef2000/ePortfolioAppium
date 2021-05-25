package pageObjects

import appium.AppiumWrapper
import pageObjects.base.BasePage
import pageObjects.base.hideKeyboard


class CreatenewContactPage (appium: AppiumWrapper): BasePage(appium){
    fun enterFirstname(firstname: String, fieldName: String): CreatenewContactPage{
        appiumWrapper.findElementWithText(fieldName).sendKeys(firstname)
        hideKeyboard()
        return this
    }
    fun enterLastname(lastname: String, fieldName: String): CreatenewContactPage{
        appiumWrapper.findElementWithText(fieldName).sendKeys(lastname)
        hideKeyboard()
        return this
    }
    fun enterPhoneNumber(phoneNumber: String, fieldName: String): CreatenewContactPage{
        appiumWrapper.findElementWithText(fieldName).sendKeys(phoneNumber)
        hideKeyboard()
        return this
    }
    fun clickSaveButton(buttonName: String): DetailPage{
        appiumWrapper.clickElementWithText(buttonName)
        return DetailPage(appiumWrapper)
    }
}