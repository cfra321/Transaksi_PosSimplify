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

WebUI.navigateToUrl('https://pos-development.buaya.dev/')


for (int i=1; i<3; i++) {
	WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Selamat Datang di Sistem POS v2.0_name'), 'tm_kf0254pospengumben')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Pengguna_password'), 'Z5ruAGYKCYiN8GG6OuXgrw==')
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/input_Kata Sandi_commit'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/img_not_interested_normal'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Skip'))
	
	WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nomor Transaksi  18055T1-111EY0018055_563924'),
		'PANADOL EXTRA @ 100 TAB')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_PANADOL ACTIFAST TAB8 (Stok 1000, stock lock 0)'))
	
	WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_ON HOLD_search-customer'), '082297334277')
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_082297334277 - Farma  Reguler Member'))
	
	WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Jumlah Uang (Rp)_paymentamount'), '20.000')
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Bayar'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/span_Kirim WA_lever'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Cetak Kirim'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/label'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_SELESAI'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Tim Master Data KF.0254 Pos Pengumben'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_Akhiri Sesi'))
	
	WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Apakah Anda yakin akan mengakhiri ses_8216ad'),
		'0')
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Ya'))
	
	WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_LOGIN'))
	
}
