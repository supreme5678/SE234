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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://3.89.142.198:8088/')

WebUI.setText(findTestObject('Object Repository/logout/Page_ProjectBackend/input_Username_username'), username_1)

WebUI.setText(findTestObject('Object Repository/logout/Page_ProjectBackend/input_Password_password'), password_1)

WebUI.click(findTestObject('Object Repository/logout/Page_ProjectBackend/button_Login'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/logout/Page_ProjectBackend/button_Logout'))

WebUI.verifyElementText(findTestObject('Object Repository/logout/Page_ProjectBackend/h2_Login'), 'Login')

WebUI.verifyElementPresent(findTestObject('Object Repository/logout/Page_ProjectBackend/button_Login'), 0)

WebUI.closeBrowser()
