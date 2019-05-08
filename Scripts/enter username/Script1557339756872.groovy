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
import org.openqa.selenium.By.ByClassName as ByClassName

WebUI.openBrowser('')

WebUI.navigateToUrl('http://3.89.142.198:8088/')

WebUI.setText(findTestObject('empty pass/Page_ProjectBackend/input_Username_username'), username_1)

WebUI.click(findTestObject('Object Repository/user login/Page_ProjectBackend/button_Login'))

WebUI.verifyElementPresent(findTestObject('empty pass/Page_ProjectBackend/label_Password'), 0)

WebUI.verifyElementPresent(findTestObject('empty pass/Page_ProjectBackend/label_Password is required'), 0)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.tagName('app-login'))

List<WebElement> word = Table.findElements(By.className('text-danger'))

int counter = 0

for (int i = 1; i <= word.size(); i++) {
    counter++
}

println('No. of warning' + counter)

WebUI.verifyEqual(2, counter)

WebUI.closeBrowser()

