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
import org.openqa.selenium.WebElement as WebElement
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

TestObject menuTransaksiPKBL = new TestObject()
menuTransaksiPKBL.addProperty("xpath", ConditionType.EQUALS, "//div[contains(text(),'Transaksi PKBL')]")
WebUI.click(menuTransaksiPKBL)

TestObject subMenuJurnalBalik = new TestObject()
subMenuJurnalBalik.addProperty("xpath", ConditionType.EQUALS, "//a[contains(text(),'Jurnal Balik')]")
WebUI.click(subMenuJurnalBalik)

TestObject kodejurnal = new TestObject()
kodejurnal.addProperty('xpath', ConditionType.EQUALS, '//input[@placeholder=\'Nomor Bukti\']')
WebUI.setText(kodejurnal, '20250916182532.PL')

TestObject cariDataBtn = new TestObject()
cariDataBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Cari Jurnal\']')

WebUI.click(cariDataBtn)


TestObject koreksiBtn = new TestObject()
koreksiBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Koreksi\']')

WebUI.click(koreksiBtn)

TestObject fieldTanggal = new TestObject()
fieldTanggal.addProperty("xpath", ConditionType.EQUALS, "//input[@placeholder='Tanggal']")
WebUI.click(fieldTanggal)

// Pilih tanggal 17 (ubah sesuai kebutuhan)
TestObject pilihTanggal = new TestObject()
pilihTanggal.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'vdp-datepicker__calendar')]//span[text()='17']")
WebUI.click(pilihTanggal)

TestObject simpanBtn = new TestObject()
simpanBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Simpan\']')

WebUI.click(simpanBtn)

WebUI.closeBrowser()