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

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

//Login
WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__8'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__10'), GlobalVariable.password)

WebUI.sendKeys(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__10'), Keys.chord(Keys.ENTER))

//Pengajuan
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Program Kemitraan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Kredit Bermasalah Khusus'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Pengajuan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Tambah'))

TestObject nomorKreditInput = new TestObject()

nomorKreditInput.addProperty('xpath', ConditionType.EQUALS, '//input[@placeholder=\'Nomor Kredit\']')

WebUI.setText(nomorKreditInput, '1100106980010')

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

TestObject uploadFileInput = new TestObject()

uploadFileInput.addProperty('xpath', ConditionType.EQUALS, '//input[@type=\'file\']')

WebUI.uploadFile(uploadFileInput, '/Users/riscajulinarti/Documents/Pdf test file.pdf')

TestObject simpanBtn = new TestObject()

simpanBtn.addProperty('xpath', ConditionType.EQUALS, '//button[normalize-space()=\'Simpan\']')

//WebUI.waitForElementClickable(simpanBtn, 10)
WebUI.click(simpanBtn)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tutup'))

//WebUI.waitForElementPresent(findTestObject('Page_Keila - Pegadaian/input_Filter daftar___BVID__508'), 0)
//WebUI.setText(findTestObject('Page_Keila - Pegadaian/input_Filter daftar___BVID__508'), '1100106980010')
//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Cari Data'))
//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Ajukan Reklas'))
//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_Bencana alamNon Alam'))
//WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea____BVID__523'), 'banjir')
//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Simpan'))
//Rekomendasi
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Rekomendasi'))

TestObject btnRekomendasi = new TestObject('btnRekomendasi')

btnRekomendasi.addProperty('xpath', ConditionType.EQUALS, '//table[contains(@class,\'table-bordered\')]/tbody/tr[1]//a[contains(text(),\'Rekomendasi\')]')

WebUI.click(btnRekomendasi)

//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Rekomendasi_1'))
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Menyetujui'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan'), 'setuju')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Kirim'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

//Persetujuan
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Persetujuan'))

TestObject btnApproval = new TestObject('btnApproval')

btnApproval.addProperty('xpath', ConditionType.EQUALS, '//table[contains(@class,\'table-bordered\')]/tbody/tr[1]//a[contains(text(),\'Approve Reklas\')]')

WebUI.click(btnApproval)

//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Approve Reklas'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan-approval'), 'ok')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Terima'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tutup_1'))

WebUI.closeBrowser()
