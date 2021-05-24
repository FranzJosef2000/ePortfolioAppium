package execution.android

import appium.AppiumWrapper
import config.setupForAndroidEmulator
import org.junit.Before
import org.junit.Test


class AndroidTestExecution {
    private lateinit var appium: AppiumWrapper

    @Before
    fun setup(){
        appium = setupForAndroidEmulator()
    }

    @Test
    fun useCaseAddContact(){

    }
}