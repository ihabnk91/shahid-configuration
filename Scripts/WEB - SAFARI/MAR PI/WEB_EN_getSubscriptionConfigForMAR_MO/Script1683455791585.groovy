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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "EN", "SHAHID_MOBILE_ONLY","MA" , "true")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'MAR')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')



// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_MOBILE_ONLY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'Monthly Plan')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "19 DH / month")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[4].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[4].value', "50% Less")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[7].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[7].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '19')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'DH')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '18')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '19')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'DH')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "MAR_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "Credit/Debit Card")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "19")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "DH")


// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "MAR_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', "APPLE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', "Apple Pay")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/ApplePay_PlanSelectionIcon.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "19")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "DH")


// Monthly Mobile Orange
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].pricingPlanId', 'TPay_Orange_MA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].productId', "MAR_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].subPricingPlanIds[0]', "60400")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].showIn[1]', 'HORIZONTAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].visualElements[1].value', "Mobile Payment")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].visualElements[2].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].visualElements[3].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconMobile.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].priceLabel', "19")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].currencyLabel', "DH")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].allowedForAcquisition', 'true')

// Monthly Mobile inwi
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].pricingPlanId', 'TPay_inwi_MA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].productId', "MAR_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].subPricingPlanIds[0]', "60405")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].priceLabel', "19")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].currencyLabel', "DH")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].allowedForAcquisition', 'true')

// Monthly Mobile Maroctel
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].pricingPlanId', 'TPay_Maroctel_MA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].productId', "MAR_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].subPricingPlanIds[0]', "60401")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].priceLabel', "7.6")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].currencyLabel', "DH")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].allowedForAcquisition', 'true')

// Deals

// Inwi landing page

WS.verifyElementPropertyValue(getResponse, 'deals[0].param', 'inwi')
WS.verifyElementPropertyValue(getResponse, 'deals[0].skipLandingPage', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visible', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].dealType', 'deal_with_pricing_plan')
WS.verifyElementPropertyValue(getResponse, 'deals[0].template','TELCO')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[7].key','main_partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[7].value','https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/LP/Logo_inwi.png')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].featured','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].liteRegistrationEnabled','false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].packageName','monthly')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].price','19')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].currency','DH')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].packageId','SHAHID_MOBILE_ONLY')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].catalogId','VIP')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[2].key','display_title')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[2].value',"Monthly Plan")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[3].key','promo_text')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[3].value',"19 DH / month")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[4].key','deduction_text')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[4].value',"billed every month")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[5].key','tag_text')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[5].value',"42% Less")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[7].key','show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[7].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[8].key','show_tag')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[8].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[9].key','price')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[9].value','19')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[10].key','currency')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[10].value','DH')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[11].key','duration')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[11].value','Monthly')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[12].key','summary_text_1')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[12].value',"A world of entertainment at your fingertips \n Join now. Monthly charges DH 19 (VAT Inclusive)")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[0].key','tab_name')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[0].value','Shahid VIP Mobile')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].productId','MAR_SHAHID_MOBILE_ONLY_1M')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].pricingPlanId','TPay_inwi_MA')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod','MOBILE_PAY')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]','60405')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel','19')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel','DH')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId','INWIMLD01_MAR')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].showForAnonymous','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[1].key','pop_up_tab_title')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[1].value[0]','Terms and Conditions  ')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[2].key','pop_up_tab_content')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[2].value[0]',"<ul> <li> Service will be automatically renewed. </li> <li> Shahid VIP Mobile Monthly charges are DH 19  (VAT Inclusive) </li> <li> For inquiries contact us at care@shahid.net </li></ul>")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[3].key','partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[3].value','https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/LP/Logo_inwi.png')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[5].key','partner_name')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[5].value','Inwi')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[6].key','continue_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[6].value',"Get the offer")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[7].key','guideline_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[7].value[0]',"Terms and Conditions Apply")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.cards[0].image','https://shahid-static.s3.amazonaws.com/shahid-subscription-config/LP/2022MOLP.jpg')




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
WS.verifyElementPropertyValue(getResponse, 'partners[0].name','Cash Plus')
WS.verifyElementPropertyValue(getResponse, 'partners[0].link','https://www.cashplus.ma/ar/#map')
WS.verifyElementPropertyValue(getResponse, 'partners[0].logo','https://static.s3.shahid.mbc.net/widget-images/logos/cashplus@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].value','More Information')


//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')