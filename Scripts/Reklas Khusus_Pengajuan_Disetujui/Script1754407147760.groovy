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
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseUrl)

//Login
TestObject inputUsername = new TestObject('inputUsername')
inputUsername.addProperty('xpath', ConditionType.EQUALS, '//input[@placeholder=\'Username atau NIK\']')

WebUI.setText(inputUsername, GlobalVariable.username)

TestObject inputPassword = new TestObject('inputPassword')
inputPassword.addProperty('xpath', ConditionType.EQUALS, '//input[@placeholder=\'Password\']')

WebUI.setEncryptedText(inputPassword, GlobalVariable.password)

TestObject btnLogin = new TestObject('btnLogin')
btnLogin.addProperty('xpath', ConditionType.EQUALS, '//button[@type=\'submit\' and contains(@class,\'btn-primary\')]')

WebUI.waitForElementVisible(btnLogin, 10)
WebUI.waitForElementClickable(btnLogin, 10)

WebUI.click(btnLogin)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Program Kemitraan'))

TestObject kreditBermasalahKhusus = new TestObject('kreditBermasalahKhusus')
kreditBermasalahKhusus.addProperty('xpath', ConditionType.EQUALS, '//div[contains(@class,\'nav-dropdown-toggle\') and normalize-space()=\'Kredit Bermasalah Khusus\']')

WebUI.waitForElementClickable(kreditBermasalahKhusus, 10)
WebUI.click(kreditBermasalahKhusus)


//Pengajuan
TestObject menuPengajuan = new TestObject('menuPengajuan')
menuPengajuan.addProperty('xpath', ConditionType.EQUALS, '//a[contains(@href,\'/kredit-bermasalah-khusus/pengajuan\')]')

WebUI.waitForElementClickable(menuPengajuan, 10)
WebUI.click(menuPengajuan)

TestObject tambahBtn = new TestObject('tambahBtn')
tambahBtn.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space(text())=\'Tambah\']')

WebUI.waitForElementClickable(tambahBtn, 10)
WebUI.click(tambahBtn)

TestObject nomorKreditInput = new TestObject()
nomorKreditInput.addProperty('xpath', ConditionType.EQUALS, '//input[@placeholder=\'Nomor Kredit\']')

WebUI.waitForElementVisible(nomorKreditInput, 10)
WebUI.setText(nomorKreditInput, '1312108230019')

WebUI.delay(5)

TestObject cariDataBtn = new TestObject()
cariDataBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Cari Data\']')

WebUI.click(cariDataBtn)

TestObject ajukanReklasBtn = new TestObject()
ajukanReklasBtn.addProperty('xpath', ConditionType.EQUALS, '//a[normalize-space()=\'Ajukan Reklas\']')

WebUI.click(ajukanReklasBtn)

TestObject kriteriaBencana = new TestObject()
kriteriaBencana.addProperty('xpath', ConditionType.EQUALS, '//label[contains(., \'Bencana alam/Non Alam\')]')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(kriteriaBencana, 10)))

TestObject alasanPengajuan = new TestObject()
alasanPengajuan.addProperty('xpath', ConditionType.EQUALS, '//textarea[@placeholder=\'Alasan Pengajuan\']')

WebUI.setText(alasanPengajuan, 'Banjir')

String projectDir = RunConfiguration.getProjectDir()

String filePath = projectDir + GlobalVariable.fileUpload

TestObject uploadFile = new TestObject()
uploadFile.addProperty('xpath', ConditionType.EQUALS, '//input[@type="file"]')

WebUI.uploadFile(uploadFile, filePath)

TestObject simpanBtn = new TestObject()
simpanBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Simpan\']')

WebUI.click(simpanBtn)

TestObject btnTutupPengajuan = new TestObject('btnTutupPengajuan')
btnTutupPengajuan.addProperty('xpath', ConditionType.EQUALS, '//button[@type=\'button\' and contains(@class,\'btn-danger\')]')

WebUI.waitForElementClickable(btnTutupPengajuan, 10)
WebUI.click(btnTutupPengajuan)

WebUI.delay(20)


//Rekomendasi
TestObject menuRekomendasi = new TestObject('menuRekomendasi')
menuRekomendasi.addProperty('xpath', ConditionType.EQUALS, '//a[contains(@href,\'/kredit-bermasalah-khusus/rekomendasi\')]')

WebUI.waitForElementClickable(menuRekomendasi, 10)
WebUI.click(menuRekomendasi)

TestObject btnRekomendasi = new TestObject('btnRekomendasi')
btnRekomendasi.addProperty('xpath', ConditionType.EQUALS, '//table[contains(@class,\'table-bordered\')]/tbody/tr[1]//a[contains(text(),\'Rekomendasi\')]')

WebUI.click(btnRekomendasi)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Menyetujui'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan'), 'setuju')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Kirim'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.delay(20)


//Persetujuan
TestObject menuPersetujuan = new TestObject('menuPersetujuan')
menuPersetujuan.addProperty('xpath', ConditionType.EQUALS, '//a[contains(@href,\'/kredit-bermasalah-khusus/persetujuan\')]')

WebUI.waitForElementClickable(menuPersetujuan, 10)
WebUI.click(menuPersetujuan)

TestObject btnApproval = new TestObject('btnApproval')
btnApproval.addProperty('xpath', ConditionType.EQUALS, '//table[contains(@class,\'table-bordered\')]/tbody/tr[1]//a[contains(text(),\'Approve\')]')

WebUI.click(btnApproval)

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan-approval'), 'ok')

TestObject terimaBtn = new TestObject()
terimaBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Terima\']')

WebUI.click(terimaBtn)

WebUI.waitForAlert(10)

WebUI.acceptAlert()

TestObject btnTutupPersetujuan = new TestObject('btnTutup')
btnTutupPersetujuan.addProperty('xpath', ConditionType.EQUALS, '//button[@type=\'button\' and contains(@class,\'btn-danger\')]')

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
menuBaganAkun.addProperty('xpath', ConditionType.EQUALS, '//a[contains(@href,\'/pelaporan/akuntansi/bagan-akun-pk\')]')

WebUI.waitForElementClickable(menuBaganAkun, 10)
WebUI.click(menuBaganAkun)

TestObject konsolidasiBakun = new TestObject('dynamicKonsolidasiLabel')
konsolidasiBakun.addProperty('xpath', ConditionType.EQUALS, '//label[@for=\'konsolidasi\']')

WebUI.click(konsolidasiBakun)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter'))

WebUI.delay(30)

WebUI.closeBrowser()