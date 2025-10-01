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

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Angsuran'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Hapus Buku'))

TestObject btnTerimaAngsuran = new TestObject("btnRekomendasi")
btnTerimaAngsuran.addProperty("xpath", ConditionType.EQUALS, "(//a[contains(@class,'btn-success') and contains(text(),'Terima Angsuran')])[1]")

WebUI.click(btnTerimaAngsuran)

//Kalo mau tunai part ini di comment
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_Transfer Bank'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Rp_v-money form-control text-right'), '100,000')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Cek Simulasi'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Terima'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tutup'))

WebUI.delay(20)


//Laporan Bagan Akun
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Pelaporan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Laporan PK'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Laporan Akuntansi'))

TestObject menuBaganAkun = new TestObject('menuBaganAkun')
menuBaganAkun.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/pelaporan/akuntansi/bagan-akun-pk')]")

WebUI.waitForElementClickable(menuBaganAkun, 10)
WebUI.click(menuBaganAkun)

TestObject konsolidasiLabel = new TestObject('dynamicKonsolidasiLabel')
konsolidasiLabel.addProperty('xpath', ConditionType.EQUALS, '//label[@for=\'konsolidasi\']')

WebUI.click(konsolidasiLabel)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter'))

WebUI.delay(30)

WebUI.closeBrowser()