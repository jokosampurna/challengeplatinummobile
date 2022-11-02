package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Then
import internal.GlobalVariable

//#Agungcahyadi.QA.Wave1.Binar

public class Login {
	
	//Reg005 - User want to login using valid credential
	@Then("tap akun")
	public void tap_akun() {
		WebUI.callTestCase(findTestCase('Page/Home/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("tap masuk")
	public void tap_masuk() {
		WebUI.callTestCase(findTestCase('Page/Register/Tap Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input email")
	public void input_email() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Email'), [('email') : 'timamobile03@yopmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input password")
	public void input_password() {
		WebUI.callTestCase(findTestCase('Page/Register/Input Password'), [('password') : 'student1234'], FailureHandling.STOP_ON_FAILURE)
	}


	@Then("tap masuk login")
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
}
