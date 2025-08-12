import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__8'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__10'), GlobalVariable.password)

WebUI.sendKeys(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__10'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Program Kemitraan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Kredit Bermasalah Khusus'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Persetujuan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Approve Reklas'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan-approval'), 'not ok')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tolak'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.delay(15)

WebUI.closeBrowser()

