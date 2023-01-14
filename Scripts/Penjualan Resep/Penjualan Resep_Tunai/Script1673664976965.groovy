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

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Skip'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_Tambah Lain Lain'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/img_Tambah Lain-lain_normal'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Pasien_prescriptionpatient_name'), 'kukuh')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nomor Telepon_prescriptionpatient_phone'), '082297334277')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Alamat Pasien_prescriptionpatient_address'), 'jakarta')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/input_Tanggal Lahir_prescriptionpatient_birthdate'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/input_Tanggal Lahir_prescriptionpatient_birthdate'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Tanggal Lahir_prescriptionpatient_birthdate'), '13-10-2010')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_NIK_prescriptionnik'), '456789520146600004')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Dokter_prescription-doctor-name-search'), 'budi')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_Budi HartatI - GIGI DAN MULUT - rs hermina depk'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Obat_non-dispensed-drug-name-search'), 'amlo')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_AMLODIPINE  5 MG (DUS 50 TAB) (Stok  3689)'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/input_Jumlah Resep_non-dispensed-drug-quant_6b7e69'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Jumlah Resep_non-dispensed-drug-quant_6b7e69'), 
    '30')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/html_swal-icon--errorborder-colorf27474-web_3ac672'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Signa 1_non_dispensed_drugsigna1'), '1')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Nama ObatItem PenjaminJumlahHarga Total_16971c'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Signa 2_non_dispensed_drugsigna2'), '1')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Lanjutkan'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_ON HOLD_search-customer'), '082297334277')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_082297334277 - Farma  Silver Member'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Jumlah Uang (Rp)_paymentamount'), '20.000')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Bayar'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Cetak Kirim'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/label'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_SELESAI'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Tim Master Data KF.0254 Pos Pengumben'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_Akhiri Sesi'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Apakah Anda yakin akan mengakhiri ses_8216ad'), 
    '15.000')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Ya'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_LOGIN'))

