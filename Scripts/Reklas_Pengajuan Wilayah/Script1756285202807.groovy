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
WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__8'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__10'), GlobalVariable.password)

WebUI.sendKeys(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__10'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Program Kemitraan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Kredit Bermasalah'))


//Pengajuan
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Pengajuan dari WilayahPusat'))

//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Tambah'))

//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Ajukan Reklas'))

//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_Bencana alamNon Alam'))

//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_Meninggal dunia'))

//WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea____BVID__545'), 'boleh')

//WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Simpan'))

TestObject btnTambah = new TestObject()
btnTambah.addProperty("xpath", ConditionType.EQUALS, "//a[contains(text(),'Tambah')]")
WebUI.click(btnTambah)

TestObject btnAjukanReklas = new TestObject()
btnAjukanReklas.addProperty("xpath", ConditionType.EQUALS, "(//a[contains(text(),'Ajukan Reklas')])[1]")
WebUI.click(btnAjukanReklas)

TestObject chkUsahaBangkrut = new TestObject()
chkUsahaBangkrut.addProperty("xpath", ConditionType.EQUALS, "//label[contains(text(),'Meninggal dunia')]")
WebUI.click(chkUsahaBangkrut)

TestObject chkTidakDiketahuiDomisili = new TestObject()
chkTidakDiketahuiDomisili.addProperty("xpath", ConditionType.EQUALS, "//label[contains(text(),'Tidak diketahui domisili')]")
WebUI.click(chkTidakDiketahuiDomisili)

TestObject txtAlasan = new TestObject()
txtAlasan.addProperty("xpath", ConditionType.EQUALS, "//textarea[@name='alasan_pengajuan' or @placeholder='Alasan Pengajuan']")
WebUI.setText(txtAlasan, "Meninggal")

TestObject btnSimpan = new TestObject()
btnSimpan.addProperty("xpath", ConditionType.EQUALS, "//button[contains(text(),'Simpan')]")
WebUI.click(btnSimpan)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tutup'))


//Rekomendasi
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Rekomendasi dari WilayahPusat'))

TestObject btnAjukanReklasRek = new TestObject()
btnAjukanReklasRek.addProperty("xpath", ConditionType.EQUALS, "(//a[contains(text(),'Ajukan Reklas')])[1]")
WebUI.click(btnAjukanReklasRek)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Menyetujui'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan'), 'ok')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Kirim'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()


//Persetujuan
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Persetujuan dari WilayahPusat'))

TestObject btnApproveReklas = new TestObject()
btnApproveReklas.addProperty("xpath", ConditionType.EQUALS, "(//a[contains(text(),'Approve Reklas')])[1]")
WebUI.click(btnApproveReklas)

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan-approval'), 'ok')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Terima'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tutup_1'))


//Laporan MB Bermasalah
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Pelaporan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Laporan PK'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Rekap Rincian MB Bermasalah PK'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_Konsolidasi'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter'))


//Laporan Bagan Akun
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Laporan Akuntansi'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Bagan Akun'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Bagan Akun'))

TestObject konsolidasiLabel = new TestObject('dynamicKonsolidasiLabel')
konsolidasiLabel.addProperty('xpath', ConditionType.EQUALS, '//label[@for=\'konsolidasi\']')
WebUI.click(konsolidasiLabel)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter'))

WebUI.closeBrowser()

