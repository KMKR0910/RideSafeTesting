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

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/a_Register'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter your full name'), 'Pasindu Peris')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_nameemail.com'), 'pasindup@gmail.com')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_07XXXXXXXX'), '0765468945')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter your address'), '18/D Main Street, Colombo 07')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter your Student Index'))

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/div_Parent RegistrationSubmit a request to regis'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter your Student Index'), '106')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter your childs name'), 'pasinduni')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter your childs grade'))

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter your childs name'), 'Pasinduni')

WebUI.setText(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/input_Enter your childs grade'), '8')

WebUI.click(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/button_Submit Registration Request'))

WebUI.verifyElementPresent(findTestObject('Page_RideSafe Tracker/Page_RideSafe Tracker/div_Parent RegistrationSubmit a request to regis'), 
    0)

