import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://localhost:5173/login')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Admin'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_nameexample.com'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Sign in as Admin'))

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/span_User Management'))

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Add New User'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter full name'), 'Hasitha Perera')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter email address'), 'hasitha@gmail.com')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter phone number'), '0725678988')

WebUI.selectOptionByValue(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/select_User Role'), 'driver', false)

WebUI.selectOptionByValue(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/select_User Role'), 'driver', false)

WebUI.selectOptionByValue(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/select_User Role'), 'driver', false)

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter vehicle number'), 'NB-8990')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter emergency contact'), '0345678987')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter username'), 'hasitha')

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter password'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Confirm password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Create User'))

WebUI.verifyElementPresent(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/p_User created successfully'), 0)

