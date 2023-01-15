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

Mobile.startApplication('C:\\Users\\kukuh wicaksono\\Downloads\\kf_mobile_dev_stabilisasi_2.apk', true)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.scrollToText('setuju')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Setuju (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (4)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - No. Handphone (3)'), '082297334277', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Kata Sandi (3)'), 'cfrawkg123', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Masuk (2)'), 0)

Mobile.switchToNative()

Mobile.scrollToText('keluar')

Mobile.tap(findTestObject('Object Repository/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - YA (1)'), 0)

Mobile.closeApplication()

