package pageObjects.base

import appium.AppiumWrapper

open class BasePage(val appiumWrapper: AppiumWrapper)

fun <B: BasePage> B.hideKeyboard(): B {
    appiumWrapper.hideKeyboard()
    return this
}