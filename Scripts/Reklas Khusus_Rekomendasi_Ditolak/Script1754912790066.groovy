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

//Pengajuan
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Program Kemitraan'))

TestObject kreditBermasalahKhusus = new TestObject('kreditBermasalahKhusus')
kreditBermasalahKhusus.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'nav-dropdown-toggle') and normalize-space()='Kredit Bermasalah Khusus']")

WebUI.waitForElementClickable(kreditBermasalahKhusus, 10)
WebUI.click(kreditBermasalahKhusus)

TestObject menuPengajuan = new TestObject('menuPengajuan')
menuPengajuan.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/kredit-bermasalah-khusus/pengajuan')]")

WebUI.waitForElementClickable(menuPengajuan, 10)
WebUI.click(menuPengajuan)

TestObject tambahBtn = new TestObject('tambahBtn')
tambahBtn.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space(text())=\'Tambah\']')

WebUI.waitForElementClickable(tambahBtn, 10)
WebUI.click(tambahBtn)

//Input Nomor Kredit
TestObject nomorKreditInput = new TestObject()
nomorKreditInput.addProperty('xpath', ConditionType.EQUALS, '//input[@placeholder=\'Nomor Kredit\']')

WebUI.setText(nomorKreditInput, '1110061160011')

//Click Button Cari Data
TestObject cariDataBtn = new TestObject()
cariDataBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Cari Data\']')

WebUI.click(cariDataBtn)

//CLick Button Ajukan Reklas
TestObject ajukanReklasBtn = new TestObject()
ajukanReklasBtn.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space()=\'Ajukan Reklas\']')

WebUI.click(ajukanReklasBtn)

//Tick Kriteria Bencana
TestObject kriteriaBencana = new TestObject()
kriteriaBencana.addProperty('xpath', ConditionType.EQUALS, '//label[contains(., \'Bencana alam/Non Alam\')]')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(kriteriaBencana, 10)))

//Input Alasan Pengajuan
TestObject alasanPengajuan = new TestObject()
alasanPengajuan.addProperty('xpath', ConditionType.EQUALS, '//textarea[@placeholder=\'Alasan Pengajuan\']')

WebUI.setText(alasanPengajuan, 'Banjir')

//Upload File
TestObject uploadFileInput = new TestObject()
uploadFileInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'file\']')

WebUI.uploadFile(uploadFileInput, '/Users/riscajulinarti/Documents/Pdf test file.pdf')

//Click Save Button
TestObject simpanBtn = new TestObject()
simpanBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Simpan\']')

WebUI.click(simpanBtn)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tutup'))

//Tolak Rekomendasi
TestObject menuRekomendasi = new TestObject('menuRekomendasi')
menuRekomendasi.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/kredit-bermasalah-khusus/rekomendasi')]")

WebUI.waitForElementClickable(menuRekomendasi, 10)
WebUI.click(menuRekomendasi)

TestObject btnRekomendasi = new TestObject('btnRekomendasi')
btnRekomendasi.addProperty('xpath', ConditionType.EQUALS, '//table[contains(@class,\'table-bordered\')]/tbody/tr[1]//a[contains(text(),\'Rekomendasi\')]')

WebUI.click(btnRekomendasi)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Menolak'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan'), 'Tolak')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Kirim'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.delay(15)

WebUI.closeBrowser()

