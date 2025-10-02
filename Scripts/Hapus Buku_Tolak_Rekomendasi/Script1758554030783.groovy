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

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/div_Hapus Buku'))


//Pengajuan Hapus Buku
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Pengajuan'))

TestObject btnTambahPengajuan = new TestObject("btnTambahPengajuan")
btnTambahPengajuan.addProperty("xpath", ConditionType.EQUALS, "//a[@href='/program-kemitraan/hapus-buku/pengajuan/tambah']")

WebUI.waitForElementVisible(btnTambahPengajuan, 10)
WebUI.waitForElementClickable(btnTambahPengajuan, 10)
WebUI.click(btnTambahPengajuan)

TestObject btnUpload = new TestObject("btnUpload")
btnUpload.addProperty("xpath", ConditionType.EQUALS, "//button[normalize-space(text())='Upload File']")

WebUI.waitForElementClickable(btnUpload, 20)
WebUI.click(btnUpload)

String projectDir = RunConfiguration.getProjectDir()

String filePath = projectDir + GlobalVariable.fileCSVtolakrek

TestObject uploadFileCSV = new TestObject()
uploadFileCSV.addProperty('xpath', ConditionType.EQUALS, '//input[@type="file"]')

WebUI.uploadFile(uploadFileCSV, filePath)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Import'))

TestObject checkboxLabel = new TestObject("chkLabelByTitle")
checkboxLabel.addProperty("xpath", ConditionType.EQUALS, "//div[@title='Centang/Tidak centang semua']//label")

WebUI.waitForElementClickable(checkboxLabel, 20)
WebUI.enhancedClick(checkboxLabel)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Ajukan'))

TestObject checkboxLabelAlasan = new TestObject()
checkboxLabelAlasan.addProperty('xpath', ConditionType.EQUALS, '//label[contains(., \'Tidak diketahui domisili\')]')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(checkboxLabelAlasan, 10)))

TestObject checkboxLabelAlasan1 = new TestObject()
checkboxLabelAlasan1.addProperty('xpath', ConditionType.EQUALS, '//label[contains(., \'Kerusuhan\')]')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(checkboxLabelAlasan1, 10)))

String projectDir1 = RunConfiguration.getProjectDir()

String filePath1 = projectDir + GlobalVariable.fileUpload

TestObject uploadFile = new TestObject()
uploadFile.addProperty('xpath', ConditionType.EQUALS, '//input[@type="file"]')

WebUI.uploadFile(uploadFile, filePath1)

TestObject alasanPengajuan = new TestObject('alasanPengajuan')
alasanPengajuan.addProperty("xpath", ConditionType.EQUALS, "//textarea[@placeholder='Alasan Pengajuan']")

WebUI.setText(alasanPengajuan, "Debitur sudah tidak diketahui domisili dan usaha bangkrut")

WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/button_Simpan'))

WebUI.delay(20)


//Rekomendasi Hapus Buku
WebUI.click(findTestObject('Object Repository/Page_Keila - Pegadaian/a_Rekomendasi'))

TestObject btnRekomendasi = new TestObject("btnRekomendasi")
btnRekomendasi.addProperty("xpath", ConditionType.EQUALS, "(//a[contains(@class,'btn-success') and contains(text(),'Rekomendasi')])[1]")

WebUI.click(btnRekomendasi)

TestObject btnMenolak = new TestObject("btnMenolak")
btnMenolak.addProperty("xpath", ConditionType.EQUALS, "//button[contains(text(),'Menolak') and contains(@class,'btn-danger')]")

WebUI.waitForElementClickable(btnMenolak, 10)
WebUI.enhancedClick(btnMenolak)

WebUI.setText(findTestObject('Object Repository/Page_Keila - Pegadaian/textarea__alasan-approval'), 'not ok')

TestObject btnTolak = new TestObject("btnTolak")
btnTolak.addProperty("xpath", ConditionType.EQUALS, "//button[contains(@class,'btn-primary') and .//span[normalize-space(text())='Tolak']]")

WebUI.click(btnTolak)

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.delay(20)

WebUI.closeBrowser()