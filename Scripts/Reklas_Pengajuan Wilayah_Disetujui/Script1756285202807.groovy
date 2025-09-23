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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
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

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Program Kemitraan'))

TestObject kreditBermasalah = new TestObject('kreditBermasalah')
kreditBermasalah.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'nav-dropdown-toggle') and normalize-space()='Kredit Bermasalah']")

WebUI.waitForElementClickable(kreditBermasalah, 10)
WebUI.click(kreditBermasalah)


//Pengajuan
TestObject menuPengajuanWilayah = new TestObject('menuPengajuanWilayah')
menuPengajuanWilayah.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/kredit-bermasalah/pusat/pengajuan')]")

WebUI.waitForElementClickable(menuPengajuanWilayah, 10)
WebUI.click(menuPengajuanWilayah)

TestObject btnTambah = new TestObject()
btnTambah.addProperty('xpath', ConditionType.EQUALS, '//a[contains(text(),\'Tambah\')]')

WebUI.click(btnTambah)

TestObject btnAjukanReklas = new TestObject()
btnAjukanReklas.addProperty('xpath', ConditionType.EQUALS, '(//a[contains(text(),\'Ajukan Reklas\')])[1]')

WebUI.click(btnAjukanReklas)

TestObject chkUsahaBangkrut = new TestObject()
chkUsahaBangkrut.addProperty('xpath', ConditionType.EQUALS, '//label[contains(text(),\'Meninggal dunia\')]')

WebUI.click(chkUsahaBangkrut)

TestObject chkTidakDiketahuiDomisili = new TestObject()
chkTidakDiketahuiDomisili.addProperty('xpath', ConditionType.EQUALS, '//label[contains(text(),\'Tidak diketahui domisili\')]')

WebUI.click(chkTidakDiketahuiDomisili)

TestObject txtAlasan = new TestObject()
txtAlasan.addProperty('xpath', ConditionType.EQUALS, '//textarea[@name=\'alasan_pengajuan\' or @placeholder=\'Alasan Pengajuan\']')

WebUI.setText(txtAlasan, 'Meninggal')

TestObject btnSimpan = new TestObject()
btnSimpan.addProperty('xpath', ConditionType.EQUALS, '//button[contains(text(),\'Simpan\')]')

WebUI.click(btnSimpan)

TestObject btnTutupPengajuan = new TestObject('btnTutupPengajuan')
btnTutupPengajuan.addProperty("xpath", ConditionType.EQUALS, "//button[@type='button' and contains(@class,'btn-danger')]")

WebUI.waitForElementClickable(btnTutupPengajuan, 10)
WebUI.click(btnTutupPengajuan)

WebUI.delay(20)


//Rekomendasi
TestObject menuRekomendasiWilayah = new TestObject('menuRekomendasiWilayah')
menuRekomendasiWilayah.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/kredit-bermasalah/pusat/rekomendasi')]")

WebUI.waitForElementClickable(menuRekomendasiWilayah, 10)
WebUI.click(menuRekomendasiWilayah)

TestObject btnAjukanReklasRek = new TestObject()
btnAjukanReklasRek.addProperty('xpath', ConditionType.EQUALS, '(//a[contains(text(),\'Ajukan Reklas\')])[1]')

WebUI.click(btnAjukanReklasRek)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Menyetujui'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan'), 'ok')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Kirim'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.delay(20)


//Persetujuan
TestObject menuPersetujuanWilayah = new TestObject('menuPersetujuanWilayah')
menuPersetujuanWilayah.addProperty("xpath", ConditionType.EQUALS, "//a[contains(@href,'/kredit-bermasalah/pusat/persetujuan')]")

WebUI.waitForElementClickable(menuPersetujuanWilayah, 10)
WebUI.click(menuPersetujuanWilayah)

TestObject btnApproveReklas = new TestObject()
btnApproveReklas.addProperty('xpath', ConditionType.EQUALS, '(//a[contains(text(),\'Approve Reklas\')])[1]')

WebUI.click(btnApproveReklas)

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan-approval'), 'ok')

TestObject terimaBtn = new TestObject()
terimaBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Terima\']')

WebUI.click(terimaBtn)

WebUI.waitForAlert(10)

WebUI.acceptAlert()

TestObject btnTutupPersetujuan = new TestObject('btnTutupPersetujuan')
btnTutupPersetujuan.addProperty("xpath", ConditionType.EQUALS, "//button[@type='button' and contains(@class,'btn-danger')]")

WebUI.waitForElementClickable(btnTutupPersetujuan, 10)
WebUI.click(btnTutupPersetujuan)


WebUI.delay(20)


//Laporan MB Bermasalah
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Pelaporan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Laporan PK'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Rekap Rincian MB Bermasalah PK'))

TestObject konsolidasiMB = new TestObject('dynamicKonsolidasiLabel')
konsolidasiMB.addProperty('xpath', ConditionType.EQUALS, '//label[@for=\'konsolidasi\']')

WebUI.click(konsolidasiMB)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter'))


//Laporan Bagan Akun
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