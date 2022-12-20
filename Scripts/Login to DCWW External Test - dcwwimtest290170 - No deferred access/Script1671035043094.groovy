import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

height = WebUI.getPageHeight()

width = WebUI.getPageWidth()

WebUI.navigateToUrl('https://www0.datb.net/dcwwimtest290170/kinodb?')

WebUI.setText(findTestObject('Login page/input_User ID_username'), 'automated_tester')

WebUI.setEncryptedText(findTestObject('Login page/input_Password_password'), 'K5XVzWzcmU41WsuZPBtTp8+CqDXWPAFQ')

WebUI.click(findTestObject('Login page/button_Login'))

not_run: if (true) {
    WebUI.verifyElementClickable(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/span_Close'), 
        FailureHandling.STOP_ON_FAILURE)

    // WebUI.verifyElementClickable(findTestObject(null))
    WebUI.doubleClick(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/span_Close'), 
        FailureHandling.STOP_ON_FAILURE)
}

not_run: WebUI.doubleClick(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/span_Close'), 
    FailureHandling.STOP_ON_FAILURE)

