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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

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

TestObject kreditBermasalah = new TestObject('kreditBermasalah')
kreditBermasalah.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'nav-dropdown-toggle') and normalize-space()='Kredit Bermasalah']")

WebUI.waitForElementClickable(kreditBermasalah, 10)
WebUI.click(kreditBermasalah)


//Pengajuan
TestObject menuPengajuanCabang = new TestObject('menuPengajuanCabang')
menuPengajuanCabang.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/kredit-bermasalah/cabang/pengajuan')]")

WebUI.waitForElementClickable(menuPengajuanCabang, 10)
WebUI.click(menuPengajuanCabang)

TestObject btnTambah = new TestObject()
btnTambah.addProperty('xpath', ConditionType.EQUALS, '//a[contains(text(),\'Tambah\')]')

WebUI.click(btnTambah)

TestObject btnAjukanReklas = new TestObject()
btnAjukanReklas.addProperty('xpath', ConditionType.EQUALS, '(//a[contains(text(),\'Ajukan Reklas\')])[1]')

WebUI.click(btnAjukanReklas)

TestObject chkKriteriaBencana = new TestObject()
chkKriteriaBencana.addProperty('xpath', ConditionType.EQUALS, '//label[contains(text(),\'Usaha Bangkrut\')]')

WebUI.click(chkKriteriaBencana)

TestObject chkKriteriaBencana1 = new TestObject()
chkKriteriaBencana1.addProperty('xpath', ConditionType.EQUALS, '//label[contains(text(),\'Tidak diketahui domisili\')]')

WebUI.click(chkKriteriaBencana1)

TestObject txtAlasan = new TestObject()
txtAlasan.addProperty('xpath', ConditionType.EQUALS, '//textarea[@name=\'alasan_pengajuan\' or @placeholder=\'Alasan Pengajuan\']')

WebUI.setText(txtAlasan, 'Debitur tidak mampu membayar karena usaha bangkrut')

TestObject btnSimpan = new TestObject()
btnSimpan.addProperty('xpath', ConditionType.EQUALS, '//button[contains(text(),\'Simpan\')]')

WebUI.click(btnSimpan)

TestObject btnTutup = new TestObject('btnTutup')
btnTutup.addProperty("xpath", ConditionType.EQUALS, "//button[@type='button' and contains(@class,'btn-danger')]")

WebUI.waitForElementClickable(btnTutup, 10)
WebUI.click(btnTutup)

WebUI.delay(20)


//Rekomendasi
TestObject menuRekomendasiCabang = new TestObject('menuRekomendasiCabang')
menuRekomendasiCabang.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/kredit-bermasalah/cabang/rekomendasi')]")

WebUI.waitForElementClickable(menuRekomendasiCabang, 10)
WebUI.click(menuRekomendasiCabang)

TestObject btnAjukanReklasRek = new TestObject()
btnAjukanReklasRek.addProperty('xpath', ConditionType.EQUALS, '(//a[contains(text(),\'Ajukan Reklas\')])[1]')

WebUI.click(btnAjukanReklasRek)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Menolak'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan'), 'Tolak')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Kirim'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.delay(20)

WebUI.closeBrowser()