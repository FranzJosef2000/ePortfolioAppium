package useCases

import appium.AppiumWrapper
import pageObjects.OverviewPage

fun addContact(appium: AppiumWrapper) {

    val addButtonId = "floating_action_button"

    val firstnameField = "First name"
    val lastnameField = "Last name"
    val phoneNumberField = "Phone"

    val buttonOnAlert = "CANCEL"
    val saveButton = "SAVE"

    val contact = object {
        val firstname = "Max"
        val lastname = "Mustermann"
        val phoneNumber = "01234567890"
    }

    OverviewPage(appium)
        .clickAddButton(addButtonId)
        .clickCancel(buttonOnAlert)
        .enterFirstname(contact.firstname, firstnameField)
        .enterLastname(contact.lastname, lastnameField)
        .enterPhoneNumber(contact.phoneNumber, phoneNumberField)
        .clickSaveButton(saveButton)
        .findName(contact.firstname +" "+ contact.lastname)
}