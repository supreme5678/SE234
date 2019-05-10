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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl(ip)

WebUI.setText(findTestObject('Object Repository/show product/Page_ProjectBackend/input_Username_username'), username_1)

WebUI.setText(findTestObject('Object Repository/show product/Page_ProjectBackend/input_Password_password'), password_1)

WebUI.click(findTestObject('show product/Page_ProjectBackend/button_Login'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/show product/Page_ProjectBackend/img'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/show product/Page_ProjectBackend/h5_Garden'), 'Garden')

WebUI.verifyElementPresent(findTestObject('Object Repository/show product/Page_ProjectBackend/img_1'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/show product/Page_ProjectBackend/h5_Banana'), 'Banana')

WebUI.verifyElementPresent(findTestObject('Object Repository/show product/Page_ProjectBackend/img_2'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/show product/Page_ProjectBackend/h5_Orange'), 'Orange')

WebUI.verifyElementPresent(findTestObject('Object Repository/show product/Page_ProjectBackend/img_3'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/show product/Page_ProjectBackend/h5_Papaya'), 'Papaya')

WebUI.verifyElementPresent(findTestObject('Object Repository/show product/Page_ProjectBackend/img_4'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/show product/Page_ProjectBackend/h5_Rambutan'), 'Rambutan')

WebUI.closeBrowser()

