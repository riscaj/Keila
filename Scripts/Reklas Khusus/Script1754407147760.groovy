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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://keila.internal.trivamas.com/admin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__8'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Login___BVID__10'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Login_btn px-4 btn-block btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Dashboard_nav-link nav-dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Pencairan Dana Hibah_nav-link nav-dropd_c20486'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Kredit Bermasalah Khusus_nav-link'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Pengajuan_btn btn-primary btn-block'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/input_Filter daftar___BVID__496'), '1110001180012')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Filter daftar_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Wilayah 6 Makasar_btn btn-sm btn-success'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/label_pilih minimal 1 kriteria_custom-contr_5cbb38'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea____BVID__512'), 'Tidak ada Modal')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_PDF Test file.pdf_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Berkas F-BM1_btn btn-danger'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Pengajuan_nav-link'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Wilayah 6 Makasar_btn btn-sm btn-success_1'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Tanggal Pencairan_btn btn-primary btn-block'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan'), 'Setuju')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button__btn mt-3 btn-primary btn-block'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Rekomendasi_nav-link'))

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Wilayah 6 Makasar_btn btn-sm btn-success_2'))

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan-approval'), 'Terima')

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Alokasi Penyisihan Piutang Mitra Ber_63d600'))

