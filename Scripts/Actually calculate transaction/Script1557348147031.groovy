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

WebUI.navigateToUrl('http://3.85.107.71:8088/')

WebUI.setText(findTestObject('Object Repository/transaction/input_Username_username'), 'admin')

WebUI.setText(findTestObject('Object Repository/transaction/input_Password_password'), 'admin')

WebUI.click(findTestObject('Object Repository/transaction/button_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/transaction/a_Total Transaction'))

WebUI.verifyElementText(findTestObject('Object Repository/transaction/td_20120 THB'), '20,120 THB')

WebUI.verifyElementText(findTestObject('Object Repository/transaction/td_60570 THB'), '60,570 THB')

WebUI.verifyElementText(findTestObject('transaction/td_1500 THB_1'), '1,500 THB')

WebUI.verifyElementText(findTestObject('transaction/td_1500 THB_2'), '1,500 THB')

WebUI.verifyElementText(findTestObject('transaction/td_1500 THB_3'), '1,500 THB')

WebUI.verifyElementText(findTestObject('Object Repository/transaction/p_Total price  85190 THB'), 'Total price: 85,190 THB')

WebUI.closeBrowser()

