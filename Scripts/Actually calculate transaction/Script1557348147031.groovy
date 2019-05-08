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

WebUI.navigateToUrl('http://3.89.142.198:8088/')

WebUI.setText(findTestObject('Object Repository/transaction/input_Username_username'), Username_2)

WebUI.setText(findTestObject('Object Repository/transaction/input_Password_password'), Password_2)

WebUI.click(findTestObject('Object Repository/transaction/button_Login'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/transaction/a_Total Transaction'))

WebUI.verifyElementPresent(findTestObject('Object Repository/transaction/td_20120 THB'), 20210)

WebUI.verifyElementPresent(findTestObject('Object Repository/transaction/td_60570 THB'), 60570)

WebUI.verifyElementPresent(findTestObject('Object Repository/transaction/td_1500 THB'), 1500)

WebUI.verifyElementPresent(findTestObject('Object Repository/transaction/td_1500 THB'), 1500)

WebUI.verifyElementPresent(findTestObject('Object Repository/transaction/td_1500 THB'), 1500)

WebUI.verifyElementPresent(findTestObject('Object Repository/transaction/p_Total price  85190 THB'), 85190)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//*[@id="add-row"]'))

List<WebElement> price = Table.findElements(By.tagName('tr'))

int counter = -1

for (int i = 1; i <= price.size(); i++) {
    counter++
}

println('No. of row ' + counter)

WebUI.verifyEqual(5, counter)

price1 = WebUI.getText(findTestObject('Object Repository/transaction/p_Total price  85190 THB'))

println(price1)

WebUI.verifyEqual('Total price: 85,190 THB', price1)

WebUI.closeBrowser()

