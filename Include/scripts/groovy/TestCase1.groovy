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



class TestCase1 {
	@Given("open web browser")
	public void open_web_browser() {
		WebUI.openBrowser('http://ebay.com/')
		WebUI.maximizeWindow()
	}

	@When("click shop by category")
	public void click_shop_by_category() {
		WebUI.click(findTestObject('Object Repository/TestCase1/Dropbar_Category'))
	}

	@When("click sub category")
	public void click_sub_category() {
		WebUI.click(findTestObject('Object Repository/TestCase1/Subcategory_cell phones and acc'))
	}

	@When("click shop bycategory")
	public void click_shop_bycategory() {
		WebUI.click(findTestObject('Object Repository/TestCase1/Shop by category menu_cell phone and acc'))
	}

	@When("click all filter")
	public void click_all_filter() {
		WebUI.click(findTestObject('Object Repository/TestCase1/btn_All Filters'))
	}

	@When("click condition")
	public void click_condition() {
		WebUI.click(findTestObject('Object Repository/TestCase1/btn_Condition'))
	}

	@When("set condition")
	public void set_condition() {
		WebUI.click(findTestObject('Object Repository/TestCase1/checkbox_new'))
	}

	@When("click price")
	public void click_price() {
		WebUI.click(findTestObject('Object Repository/TestCase1/btn_price'))
	}

	@When("set price")
	public void set_price() {
		WebUI.setText(findTestObject('Object Repository/TestCase1/textfield_price_from'), '7000000')
	}

	@When("click location")
	public void click_location() {
		WebUI.click(findTestObject('Object Repository/TestCase1/btn_Item Location'))
	}

	@When("click item location")
	public void click_item_location() {
		WebUI.click(findTestObject('Object Repository/TestCase1/checkbox_asia'))
	}

	@When("click apply")
	public void click_apply() {
		WebUI.click(findTestObject('Object Repository/TestCase1/btn_Apply'))
	}

	@When("verify filter")
	public void verify_filter() {
		WebUI.click(findTestObject('Object Repository/TestCase1/verify/btn_3 filters applied'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/TestCase1/verify/span_Condition New   filter applied'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/TestCase1/verify/span_Price Over 7,000,000.00   filter applied'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/TestCase1/verify/span_Item Location Asia   filter applied'), 0)
	}

	@Then("user close browser")
	public void user_close_browser() {
		WebUI.closeBrowser()
	}
}