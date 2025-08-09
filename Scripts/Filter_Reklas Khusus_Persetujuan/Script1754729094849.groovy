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

WebUI.navigateToUrl('https://keila.internal.trivamas.com/admin')

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__8'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__10'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Program Kemitraan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Kredit Bermasalah Khusus'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Persetujuan'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Filter daftar___BVID__492'), '1100106970010')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Filter daftar___BVID__492'), '')

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Filter daftar___BVID__493'), 'CV')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter'))

WebUI.delay(15)

WebUI.closeBrowser()

