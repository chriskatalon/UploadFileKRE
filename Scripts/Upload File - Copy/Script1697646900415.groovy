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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.LocalFileDetector
import org.openqa.selenium.support.events.EventFiringWebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.selenium.driver.CRemoteWebDriver



WebUI.openBrowser('https://tus.io/demo')

EventFiringWebDriver driver = DriverFactory.getWebDriver()
WebDriver wrappedDriver = driver.getWrappedDriver()
System.out.println(wrappedDriver.getClass())
if (wrappedDriver.class == CRemoteWebDriver) {
	wrappedDriver.setFileDetector(new LocalFileDetector())
}

String filePath = new File(RunConfiguration.getProjectDir() + '/' + '/Katalon-Devices 1.JPG').getCanonicalPath()

//def filePath = System.getProperty('user.dir') + '/Katalon-Devices 1.JPG'

println(filePath)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Resumable File Upload Demo  tus.io/input_Select a file you want to upload_P0-0'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Resumable File Upload Demo  tus.io/input_Select a file you want to upload_P0-0'), 5)

WebUI.uploadFile(findTestObject('Object Repository/Page_Resumable File Upload Demo  tus.io/input_Select a file you want to upload_P0-0'), filePath)

WebUI.verifyMatch('The upload is complete!', 'The upload is complete!', false, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('screenshot1', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()