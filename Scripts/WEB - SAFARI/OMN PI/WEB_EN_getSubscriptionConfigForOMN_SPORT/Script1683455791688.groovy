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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "EN", "SHAHID_VIP_SPORT","OM" , "true")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'OMN')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')


// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "Watch the most powerful series and movies exclusively without stopping")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'Monthly Plan')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "6.99 OMR  / month")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '6.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'OMR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '3')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '6.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'OMR')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "OMN_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "Credit/Debit Card")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "6.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "OMR")


// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "OMN_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', "APPLE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', "Apple Pay")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/ApplePay_PlanSelectionIcon.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "6.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "OMR")

// Yearly package Visual Elements


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].value', "Watch the most powerful series and movies exclusively without stopping")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].value', 'Annual Plan')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].value', "Save 17%")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].value', '5.82 OMR/ month')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].value', '69.89 OMR billed every year')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].value', '69.89')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].value', 'OMR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].value', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].order', '5')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].price', '69.89')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].currency', 'OMR')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].productId', "OMN_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].value', "Credit/Debit Card")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].priceLabel', "69.89")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].currencyLabel', "OMR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].productId', "OMN_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].paymentMethod', "APPLE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[0].value', "Apple Pay")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/ApplePay_PlanSelectionIcon.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].priceLabel', "69.89")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].currencyLabel', "OMR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].allowedForAcquisition', 'true')




// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value','Subscription fees may vary depending on the country, payment method, subscription package, added tax, currency conversion factor, and bank fees. Terms and conditions apply.')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].key','display_type')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].value','vertical')

//  Alternative Payment
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[0].key','alternative_payment_title')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[0].value','Or choose one of the following alternative methods')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[1].key','label_text')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[1].value','Other Payment Methods')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[3].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[3].value','Click here')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[4].key','main_title')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[4].value','Other Payment Methods')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[6].key','alternative_payment_methods')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[6].value','You can get Shahid voucher from any of the following retailers')

//Partners

WS.verifyElementPropertyValue(getResponse, 'partners[0].name','Like Card')
WS.verifyElementPropertyValue(getResponse, 'partners[0].link','https://like4card.com/All-Shahid_VIP?country_id=21')
WS.verifyElementPropertyValue(getResponse, 'partners[0].logo','https://static.s3.shahid.mbc.net/widget-images/logos/likecard@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].value','More Information')

WS.verifyElementPropertyValue(getResponse, 'partners[1].name','You Got a Gift')
WS.verifyElementPropertyValue(getResponse, 'partners[1].link','https://yougotagift.com/oman/gift-card/shahidvip-gift-card-om/')
WS.verifyElementPropertyValue(getResponse, 'partners[1].logo','https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/logos/you-gota-gift.svg')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].value','More Information')

WS.verifyElementPropertyValue(getResponse, 'partners[2].name','Razer Online')
WS.verifyElementPropertyValue(getResponse, 'partners[2].link','https://gold.razer.com/global/en/gold/catalog/shahid-vip')
WS.verifyElementPropertyValue(getResponse, 'partners[2].logo','https://shahid-static.s3.amazonaws.com/widget-images/logos/Coin_RZR%20Gold_Black.png')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].value','More Information')

//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




