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

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/html_swal-icon--errorborder-colorf27474-web_3ac672'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/input_Kata Sandi_commit'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/img_not_interested_normal'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Skip'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_Tambah Lain Lain'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/img_Tambah Lain-lain_normal'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/label_Kredit Resep'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/span_-pilih jaminan-'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Lanjutkan_select2-search__field'), 'admedika payor')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/span_ADMEDIKA PAYOR PT-'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Pasien_prescriptionpatient_name'), 'kuku')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nomor Telepon_prescriptionpatient_phone'), '6546546')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Alamat Pasien_prescriptionpatient_address'), 'depok')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Tanggal Lahir'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Tanggal Lahir_prescriptionpatient_birthdate'), '13-03-1997')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_NIK_prescriptionnik'), '12345678950')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Dokter_prescription-doctor-name-search'), 'bufi')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_Bufi - Baru'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_PPK Asal_prescription-ppk-origin-name-search'), 
    'c')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_RS FAMILY MEDICAL CENTER'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Poli_prescription-poly-name-search'), '0')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_P0li Bedah'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Alamat Dokter Praktik_prescriptiondoc_b467a8'), 
    'depok')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Nama PasienNama pasien harus diisiNomor_5f6670'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Peserta_insurance_member_name'), 'kukuh')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/span_Cari Peserta'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Lanjutkan_select2-search__field'), '1628')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Npp_attempt222answer_text'), '12335')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/label_Nama_pasien'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nama_pasien_attempt250answer_text'), 'kukuh')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_TANGGAL RESEP_attempt251answer_text'), '12-12-2022')

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Obat_non-dispensed-drug-name-search'), 'amlo')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_AMLODIPINE  5 MG (DUS 50 TAB) (Stok  3629)'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Nama Obat_non-dispensed-drug-name-search'), 'panadol')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_PANADOL EXTRA  100 TAB (Stok  9926)'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Obat Non-RacikObat RacikNama ObatItem P_7fca9d'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Jumlah Resep_non-dispensed-drug-quant_6b7e69'), 
    '14')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/input_Signa 1_non_dispensed_drugsigna1'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/html_swal-icon--errorborder-colorf27474-web_3ac672_1'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Signa 1_non_dispensed_drugsigna1'), '1')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Signa 2'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Signa 2_non_dispensed_drugsigna2'), '1')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Lanjutkan'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_ON HOLD_search-customer'), '082297334277')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_082297334277 - Farma  Silver Member'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Bayar'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Cetak Kirim'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/div_Tim Master Data KF.0254 Pos Pengumben'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_Akhiri Sesi'))

WebUI.setText(findTestObject('Object Repository/Page_POS Frontend/input_Apakah Anda yakin akan mengakhiri ses_8216ad'), 
    '15.000')

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/button_Ya'))

WebUI.click(findTestObject('Object Repository/Page_POS Frontend/a_LOGIN'))

