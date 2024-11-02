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



class TestCase2 {
	@When("user open browser")
	public void user_open_browser() {
		WebUI.openBrowser('http://ebay.com/')
		WebUI.maximizeWindow()
	}

	@When("user search strings")
	public void user_search_strings() {
		WebUI.setText(findTestObject('Object Repository/TestCase2/ElementTestCase2/textfield_search'), 'MacBook')
	}

	@When("choosing category")
	public void choosing_category() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/TestCase2/ElementTestCase2/Dropbar'), 'Computers/Tablets & Networking', false)
	}

	@When("user click search")
	public void user_click_search() {
		WebUI.click(findTestObject('Object Repository/TestCase2/ElementTestCase2/btn_search'))
	}

	@When("page loads completely")
	public void page_loads_completely() {
		WebUI.waitForPageLoad(10)
	}

	@When("verify first result match")
	public void verify_first_result_match() {
		String expectedSearchString = 'MacBook'
		String firstResultName = WebUI.getText(findTestObject('Object Repository/TestCase2/ElementTestCase2/title_first_product'))
	}

	@Then("close browser")
	public void close_browser() {
		WebUI.closeBrowser()
	}
}