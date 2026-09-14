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

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter full name'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter email address'), 'kasun')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter phone number'), '078')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter student index'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter student name'), 'Nimal')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter student grade'))

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter address'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter username'), 'nimal')

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter password'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Confirm password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Create User'))

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/label_Phone Number'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter full name'), 'Vimasani')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter email address_1'), '')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter email address'), 'vimasha')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter phone number'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter student index'), '104')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter student grade'), 'Test')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter address'), 'Panadura')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Create User'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter email address_2'), 'vimasha@gmail.com')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Create User'))

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Create User'))

WebUI.verifyElementNotPresent(findTestObject(null), null)

