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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseUrl)

//Login
TestObject inputUsername = new TestObject('inputUsername')
inputUsername.addProperty("xpath", ConditionType.EQUALS, "//input[@placeholder='Username atau NIK']")
WebUI.setText(inputUsername, GlobalVariable.username)

TestObject inputPassword = new TestObject('inputPassword')
inputPassword.addProperty("xpath", ConditionType.EQUALS, "//input[@placeholder='Password']")
WebUI.setEncryptedText(inputPassword, GlobalVariable.password)

TestObject btnLogin = new TestObject('btnLogin')
btnLogin.addProperty("xpath", ConditionType.EQUALS, "//button[@type='submit' and contains(@class,'btn-primary')]")
WebUI.waitForElementVisible(btnLogin, 10)
WebUI.waitForElementClickable(btnLogin, 10)
WebUI.click(btnLogin)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Program Kemitraan'))

TestObject kreditBermasalahKhusus = new TestObject('kreditBermasalahKhusus')
kreditBermasalahKhusus.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'nav-dropdown-toggle') and normalize-space()='Kredit Bermasalah Khusus']")

WebUI.waitForElementClickable(kreditBermasalahKhusus, 10)
WebUI.click(kreditBermasalahKhusus)

TestObject menuRekomendasi = new TestObject('menuRekomendasi')
menuRekomendasi.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/kredit-bermasalah-khusus/rekomendasi')]")

WebUI.waitForElementClickable(menuRekomendasi, 10)
WebUI.click(menuRekomendasi)

TestObject filternokredit = new TestObject('filternokredit')
filternokredit.addProperty("xpath", ConditionType.EQUALS, "//input[@placeholder='Nomor Kredit']")
WebUI.setText(filternokredit, "1100106150020")

TestObject filterBtn = new TestObject()
filterBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Filter\']')
WebUI.click(filterBtn)

WebUI.delay(10)

TestObject filternokredit1 = new TestObject('filternokredit')
filternokredit1.addProperty("xpath", ConditionType.EQUALS, "//input[@placeholder='Nomor Kredit']")
WebUI.setText(filternokredit1, "")

TestObject filternamaMB = new TestObject('filternokredit')
filternamaMB.addProperty("xpath", ConditionType.EQUALS, "//input[@placeholder='Nama MB']")
WebUI.setText(filternamaMB, "Baso")

TestObject filterBtn1 = new TestObject()
filterBtn1.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Filter\']')
WebUI.click(filterBtn1)

WebUI.delay(10)

WebUI.closeBrowser()

