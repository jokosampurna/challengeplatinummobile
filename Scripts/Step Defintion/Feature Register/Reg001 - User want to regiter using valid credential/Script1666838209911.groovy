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

WebUI.callTestCase(findTestCase('Page Register/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Tap Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Tap Page Daftar'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Input Nama'), [('nama') : 'Madona'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Input Email'), [('email') : 'timamobile01@yopmail.com'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Input Password'), [('password') : 'student1234'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Input HP'), [('hp') : '085212349876'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Input Kota'), [('kota') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Input Alamat'), [('alamat') : 'Kelapa Gading'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Page Register/Tap Daftar'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

