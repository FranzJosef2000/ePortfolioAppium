package config

import appium.AndroidAppiumWrapper
import appium.AppiumWrapper
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.util.concurrent.TimeUnit

fun setupForAndroidEmulator(): AppiumWrapper{
    val capabilities = DesiredCapabilities().apply {
        setCapability("deviceName","emulator")
        setCapability("platformName", "Android")
        setCapability("platformVersion", "11")
        setCapability("fullReset", false)
        setCapability("noReset", false)
        setCapability("appPackage", "com.android.contacts")
        setCapability("appActivity", ".activities.PeopleActivity")
        setCapability("udid","emulator-5554")
        setCapability("avd", "test")
        setCapability("autoAcceptAlerts", false)
        setCapability("autoGrantPermissions", true)
        setCapability("automationName", "uiautomator2")
    }
    val driver = AndroidDriver<MobileElement>(URL("http://0.0.0.0:4723/wd/hub"), capabilities)
    driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS)
    return AndroidAppiumWrapper(driver)
}