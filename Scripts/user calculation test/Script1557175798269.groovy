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

WebUI.setText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/input_Username_username'), username_1)

WebUI.setText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/input_Password_password'), password_1)

WebUI.click(findTestObject('Object Repository/user calculation/Page_ProjectBackend/button_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/user calculation/Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('user calculation/Page_ProjectBackend/a_Carts'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/td_Banana'), 'Banana')

WebUI.verifyElementText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/td_150 THB'), '150 THB')

WebUI.setText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/input_Banana_amount'), '10')

WebUI.verifyElementText(findTestObject('user calculation/Page_ProjectBackend/p_Total price'), 'Total price: 1,500 THB')

WebUI.click(findTestObject('Object Repository/user calculation/Page_ProjectBackend/button_confirm'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('user calculation/Page_ProjectBackend/div_successfully_added'), 'Well done!')

WebUI.closeBrowser()

