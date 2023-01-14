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

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Selamat Datang di Sistem POS v2.0_name'), 'tm_kf0254pospengumben')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Pengguna_password'), 'Z5ruAGYKCYiN8GG6OuXgrw==')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/input_Kata Sandi_commit'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/img_not_interested_normal'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Silakan Masukkan Jumlah Modal Kasir_p_7892c4'), 
    '0')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Skip'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nomor Transaksi  18084T1-111EY0018084_020bf3'), 
    'NUTRIMAX BR P')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_NUTRIMAX BR P60 (Stok 19990, stock lock 2)'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nomor Transaksi  18084T1-111EY0018084_020bf3'), 
    'PANADOL')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_PANADOL EXTRA  100 TAB (Stok 9941, stock lock 8)'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_ON HOLD_search-customer'), '082297334277')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_082297334277 - Farma  Silver Member'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_DEBITKREDIT'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Pemilik Kartu_paymentcard_holder_name'), 'KUKUH WICAKSONO')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/input_Nomor Kartu_paymentcard_number'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/label_Kartu Debit'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nomor Kartu_paymentcard_number'), '1234-5678-9123-4568')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nominal (Rp)_debit_credit_amount'), '300.000')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_CASH'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Jumlah Uang (Rp)_paymentamount'), '50.000')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Bayar'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Cetak Kirim'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/label'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_SELESAI'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Tim Master Data KF.0254 Pos Pengumben'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_Akhiri Sesi'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Apakah Anda yakin akan mengakhiri ses_8216ad'), 
    '350.000')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Ya'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_LOGIN'))

