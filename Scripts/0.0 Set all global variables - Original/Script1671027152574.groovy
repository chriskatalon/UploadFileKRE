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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

Date date = new Date()

SimpleDateFormat formatter = new SimpleDateFormat('dd/MM/yyyy')

String CurrentDate = formatter.format(date)

GlobalVariable.CurrentDatevar = CurrentDate

OneDayAhead = CustomKeywords.'com.kms.katalon.keyword.datetime.DateTimeUtility.addDays'(CurrentDate, 'dd/MM/yyyy', 1)

GlobalVariable.OneDayAheadvar = OneDayAhead

SimpleDateFormat UserNameformatter = new SimpleDateFormat('dd-MM-yyyy-hh-mm-ss')

String UserNamestrDate = UserNameformatter.format(date)

System.out.println('Date Format with dd-MM-yyyy : ' + UserNamestrDate)

//String UserSurname = 'User-One-' + UserNamestrDate

String UserSurname = UserNamestrDate

String User2Surname = 'User-Two-' + UserNamestrDate

String UserEmail = ('Katalon.' + UserSurname) + '@datb.com'

String User2Email = ('Katalon.' + User2Surname) + '@datb.com'

System.out.println('surname = ' + UserSurname)

System.out.println('user email address = ' + UserEmail)

GlobalVariable.UserSurnamevar = UserSurname

GlobalVariable.User2Surnamevar = User2Surname

GlobalVariable.User2Emailvar = User2Email

GlobalVariable.UserEmailvar = UserEmail

GlobalVariable.URLvar = 'https://www0.datb.net/dcwwimtest290170/'

CurrentDay = CustomKeywords.'com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDate'()

CurrentMonth = CustomKeywords.'com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentMonth'()

CurrentYear = CustomKeywords.'com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentYear'()

GlobalVariable.CurrentDayvar = CurrentDay

GlobalVariable.CurrentMonthvar = CurrentDay

GlobalVariable.CurrentYearvar = CurrentDay

GlobalVariable.DateToClickvar = (((('//*[(contains(text(), \'' + CurrentDay) + '\') or contains(., \'') + CurrentDay) + 
'\'))]')

GlobalVariable.UploadFilePathvar = (RunConfiguration.getProjectDir() + '/Data Files/images-to-upload/')

System.out.println('UserEmail = ' + GlobalVariable.UserEmailvar)

System.out.println('UserSurname = ' + GlobalVariable.UserSurnamevar)

System.out.println('User2Email = ' + GlobalVariable.User2Emailvar)

System.out.println('User2Surname = ' + GlobalVariable.User2Surnamevar)

System.out.println('DateToClick = ' + GlobalVariable.DateToClickvar)

System.out.println('Current date = ' + GlobalVariable.CurrentDatevar)

System.out.println('Full fileupload path = ' + GlobalVariable.UploadFilePathvar)

String excelFile = (RunConfiguration.getProjectDir() + '/Data Files/') + 'DCWWIMPassVariables.xlsx'

ExcelKeywords.createExcelFile(excelFile)

workbook = ExcelKeywords.getWorkbook(excelFile)

sheet = workbook.getSheet('sheet0')

ExcelKeywords.setValueToCellByAddress(sheet, 'A1', GlobalVariable.UserSurnamevar)

ExcelKeywords.saveWorkbook(excelFile, workbook)

