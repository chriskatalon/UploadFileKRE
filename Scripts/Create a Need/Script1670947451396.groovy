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

WebUI.click(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/a_Needs'))

WebUI.click(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/a_New need by type'))

WebUI.click(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/i_Need_icon-plus k-icon-button'))

NeedName = ('Automated Test Need - ' + GlobalVariable.UserSurnamevar)

WebUI.setText(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/input_Title_F100089'), 
    NeedName)

if (WebUI.verifyElementPresent(findTestObject('Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/i_Location_icon-caret-right'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/i_Location_icon-caret-right'))
}

WebUI.click(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/input_Investment area_F103966_autocomplete'))

WebUI.click(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/div_CWI Ancillaries (Valves Hydrants etc)'))

WebUI.click(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/button_Set'))

WebUI.setText(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/input_Asset location_F113942_autocomplete'), 
    '20119680 - Washwater UV Panel No.1 Slave')

WebUI.click(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/div_20119680 - Washwater UV Panel No.1 Slave'))

WebUI.click(findTestObject('Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/i_Refresh'))

WebUI.click(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/i_WQZ_L16 - Malpas  Caerleon  Cwmbran_icon-_4722ef'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/button_OK'))

if (WebUI.verifyElementPresent(findTestObject('Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/i_Owner_icon-caret-right'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/i_Owner_icon-caret-right'))
}

WebUI.setText(findTestObject('Object Repository/Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/textarea_Mitigation_F103508'), 
    'test')

WebUI.click(findTestObject('Page_2.30.6rc3 (DbNode290170DCWW datb test)_485f31/Save Need'))

not_run: WebUI.closeBrowser()

