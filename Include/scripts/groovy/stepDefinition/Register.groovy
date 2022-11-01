package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Register {
	
	//Reg001 - User want to register using valid credential
	@Then("tap akun")
	public void tap_akun() {
		WebUI.callTestCase(findTestCase('Page/Register/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("tap masuk")
	public void tap_masuk() {
		WebUI.callTestCase(findTestCase('Page/Register/Tap Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("tap pagedaftar")
	public void pagedaftar() {
		WebUI.callTestCase(findTestCase('Page/Register/Tap Page Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input nama")
	public void input_nama() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Nama'), [('nama') : 'David'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input email")
	public void input_email() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Email'), [('email') : 'timamobile03@yopmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input password")
	public void input_password() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Password'), [('password') : 'student1234'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input hp")
	public void input_hp() {
		WebUI.callTestCase(findTestCase('Page/Register/Input HP'), [('hp') : '085212349876'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input kota")
	public void input_kota() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Kota'), [('kota') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input alamat")
	public void input_alamat() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Alamat'), [('alamat') : 'Slipi'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("swipe")
	public void verify() {
		Mobile.swipe(690, 2137, 0, 0)
	}

	@Then("tap daftar")
	public void tap_daftar() {
		WebUI.callTestCase(findTestCase('Page/Register/Tap Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verify content profile")
	public void verify_content_profile() {
		WebUI.callTestCase(findTestCase('Page/Profile/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.closeApplication()
		Mobile.startApplication('Apk/app-release.apk', true)
	}
	
	@Then("close app")
	public void close_app() {
		Mobile.closeApplication()
	}
	
	
	//Reg002 - User want to register using invalid credential
	@Then("start app")
	public void start_app() {
		Mobile.startApplication('Apk/app-release.apk', true)
	}
	
	@Then("input nama1")
	public void input_nama1() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Nama'), [('nama') : 'Jeko'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input email1")
	public void input_email1() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Email'), [('email') : 'timamobile10'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input password1")
	public void input_password1() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Password'), [('password') : '1234abc'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input hp1")
	public void input_hp1() {
		WebUI.callTestCase(findTestCase('Page/Register/Input HP'), [('hp') : '78454132'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input kota1")
	public void input_kota1() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Kota'), [('kota') : 'Semarang'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input alamat1")
	public void input_alamat1() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Alamat'), [('alamat') : 'Candisari'], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("verify email")
	public void verify_email() {
		Mobile.verifyElementVisible(findTestObject('Page Register/text - emailtdkvalid'), 0)
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.closeApplication()
		Mobile.startApplication('Apk/app-release.apk', true)
	}
	
	//Reg003 - User want to register using existing email
	@Then("input nama2")
	public void input_nama2() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Nama'), [('nama') : 'Madona'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input email2")
	public void input_email2() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Email'), [('email') : 'timamobile01@yopmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input password2")
	public void input_password2() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Password'), [('password') : 'student1234'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input hp2")
	public void input_hp2() {
		WebUI.callTestCase(findTestCase('Page/Register/Input HP'), [('hp') : '085212349876'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input kota2")
	public void input_kota2() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Kota'), [('kota') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input alamat2")
	public void input_alamat2() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Alamat'), [('alamat') : 'Kelapa Gading'], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("verify email sudah digunakan")
	public void verify_email_sudah_digunakan() {
		Mobile.verifyElementVisible(findTestObject('Page Register/text - emailsdhdigunakan'), 0)
	}
	
}