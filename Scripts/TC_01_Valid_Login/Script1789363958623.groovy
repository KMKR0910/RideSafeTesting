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

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Parent'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_nameexample.com'), 'nimalp')

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Sign in as Parent'))

WebUI.verifyElementPresent(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/div_Welcome, nimalpManage supun Pereras school'), 
    0)

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Logout'))

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Driver'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_nameexample.com_1'), 'kasun')

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input__1'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Sign in as Driver'))

WebUI.verifyElementPresent(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/div_Route A - Morning RunBus 001  Started at 07'), 
    0)

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Logout_1'))

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/svg_lucide lucide-shield-check h-5 w-5 mb-1'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_nameexample.com_2'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input__2'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Sign in as Admin'))

WebUI.verifyElementPresent(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/div_Admin Control CenterManage school transport'), 
    0)

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Logout_2'))

