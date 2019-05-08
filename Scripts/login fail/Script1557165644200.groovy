import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

System.setProperty('webdriver.chrome.driver', 'C:\\chromedriver.exe')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://3.89.142.198:8088/')

WebUI.setText(findTestObject('Object Repository/login fail/Page_ProjectBackend/input_Username_username'), 'user')

WebUI.setText(findTestObject('Object Repository/login fail/Page_ProjectBackend/input_Password_password'), 'ser')

WebUI.click(findTestObject('Object Repository/login fail/Page_ProjectBackend/button_Login'))

not_run: WebUI.waitForElementNotPresent(findTestObject('login fail/Page_ProjectBackend/div_Usernamepassword is incorrect'), 
    30)

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/login fail/Page_ProjectBackend/div_Usernamepassword is incorrect'), 
    0)

WebUI.closeBrowser()

