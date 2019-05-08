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

WebUI.setText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/input_Username_username'), username_1)

WebUI.setText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/input_Password_password'), username_1)

WebUI.click(findTestObject('Object Repository/user calculation/Page_ProjectBackend/button_Login'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/user calculation/Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('user calculation/Page_ProjectBackend/a_Carts'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/td_Banana'), 'Banana')

WebUI.verifyElementText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/td_150 THB'), '150 THB')

WebUI.setText(findTestObject('Object Repository/user calculation/Page_ProjectBackend/input_Banana_amount'), '10')

WebUI.verifyElementText(findTestObject('user calculation/Page_ProjectBackend/p_Total price'), 'Total price: 1,500 THB')

WebUI.click(findTestObject('Object Repository/user calculation/Page_ProjectBackend/button_confirm'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('user calculation/Page_ProjectBackend/div_successfully_added'), 0)

WebUI.closeBrowser()

