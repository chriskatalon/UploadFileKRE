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

WebUI.navigateToUrl('https://test.gatsby-driver.com/')

def filePath = System.getProperty('user.dir') + '/Katalon-Devices 1.JPG'

println(filePath)

WebUI.setText(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_Email Address'), 'ig.usertester+dr100@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_Password'), 'p4y+y39Ir5OzeCXBgI9M+g==')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_Password'))

WebUI.click(findTestObject('Object Repository/Page_Driver Portal - Gatsby/button_Sign in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/p_Documents'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/p_Documents'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/p_Documents'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Add a Document'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Add a Document'))

//WebUI.uploadFile(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Choose file'), filePath)
WebUI.uploadFile(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input-file'), filePath)
WebUI.delay(10)
WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

//WebUI.closeBrowser()

