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


//JokoSampurno.QA.Wave1.Binar

class ViewDaftarJualSaya {

	//PL001 - User want to view daftar jual saya menu semua produk
	@Then("call login")
	public void call_login() {
		WebUI.callTestCase(findTestCase('Step Defintion/Feature Login/Log005 - User want to login using valid credential'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("tap daftar jual saya")
	public void tap_daftar_jual_saya() {
		WebUI.callTestCase(findTestCase('Page/Profile/Tap Daftar Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("tap produk")
	public void tap_produk() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Tap Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verify content")
	public void verify_content() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//PL002 - User want to view daftar jual saya menu diminati
	@Then("tap diminati")
	public void tap_diminati() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Tap Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//PL003 - User want to view daftar jual saya menu terjual
	@Then("tap terjual")
	public void tap_terjual() {
		WebUI.callTestCase(findTestCase('Page/Daftar Jual Saya/Tap Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}