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

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Tambah'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Ajukan Reklas'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_Bencana alamNon Alam'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_Meninggal dunia'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea____BVID__545'), 'boleh')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tutup'))


//Rekomendasi
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Rekomendasi dari WilayahPusat'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Ajukan Reklas_1'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Menyetujui'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan'), 'ok')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Kirim'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()


//Persetujuan
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Persetujuan dari WilayahPusat'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Approve Reklas'))

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

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_Konsolidasi_1'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter'))

WebUI.closeBrowser()

