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

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "EN", "SHAHID_VIP_SPORT_GOBX","SA" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'SAU')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')


// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP_SPORT_GOBX")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "Watch the most powerful series and movies exclusively without stopping")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', "Monthly Plan")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', "84.99 SAR/ month")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[4].value', 'Billed every month')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', '84.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', 'Monthly Plan')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].value', "Most popular")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '12')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '84.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'SAR')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_SPORT_GOBOX_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "Credit/Debit Card")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "84.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "SAR")




// Monthly Mobile Zain
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].pricingPlanId', 'TPay_Zain_SA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "KSA_B2C_SHAHID_VIP_SPORT_GOBOX_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].subPricingPlanIds[0]', "42004")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].showIn[1]', 'HORIZONTAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "Mobile Payment")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[3].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconMobile.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "84.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].allowedForAcquisition', 'true')
// Monthly Mobile Mobily
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].pricingPlanId', 'TPay_Mobily_SA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].productId', "KSA_B2C_SHAHID_VIP_SPORT_GOBOX_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].subPricingPlanIds[0]', "42003")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].priceLabel', "84.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].allowedForAcquisition', 'true')

// Monthly Mobile STC
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].pricingPlanId', 'TPay_STC_SA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].productId', "KSA_B2C_SHAHID_VIP_SPORT_GOBOX_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].subPricingPlanIds[0]', "42001")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].priceLabel', "84.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].allowedForAcquisition', 'true')


// Yearly package Visual Elements


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].packageId', "SHAHID_VIP_SPORT_GOBX")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].value', "Watch the most powerful series and movies exclusively without stopping")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].value', 'Annual Plan')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].value', "Save 14%")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].value', "73.33 SAR/ month")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].value', "879.99 SAR billed every year")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].value', '879.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].value', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].order', '14')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].price', '879.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].currency', 'SAR')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_SPORT_GOBOX_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].value', "Credit/Debit Card")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].priceLabel', "879.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')





// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value','Subscription fees may vary depending on the country, payment method, subscription package, added tax, currency conversion factor, and bank fees. Terms and conditions apply.')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].key','display_type')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].value','vertical')



//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




