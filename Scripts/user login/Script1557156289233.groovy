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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('http://3.89.142.198:8088/')

WebUI.setText(findTestObject('user login/Page_ProjectBackend/input_Username_username'), username_1)

WebUI.setText(findTestObject('user login/Page_ProjectBackend/input_Password_password'), password_1)

WebUI.click(findTestObject('user login/Page_ProjectBackend/button_Login'))

WebUI.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('user login/Page_ProjectBackend/a_Products'), 0)

WebUI.verifyElementPresent(findTestObject('user login/Page_ProjectBackend/a_Carts'), 0)

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="navbarSupportedContent"]'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> col = Table.findElements(By.className('nav-item'))
int counter = 0;
for (int i = 1; i <= col.size(); i++) {
	counter++;
}
println('No. of columns' + counter)
'compare the value'
WebUI.verifyEqual(2, col.size())


WebUI.closeBrowser()

