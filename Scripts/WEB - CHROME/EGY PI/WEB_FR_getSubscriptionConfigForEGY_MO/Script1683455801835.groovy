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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "FR", "SHAHID_MOBILE_ONLY","EG" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'EGY')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')



// Monthly Package Visual Elemnts
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_MOBILE_ONLY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'Plan Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "28.99 EGP / mois")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'facturation mensuelle')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[7].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[7].value', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '28.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '18')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '28.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'EGP')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "EGY_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "Carte de crédit/débit")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "S'abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "28.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "EGP")




// Monthly Mobile Orange
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].pricingPlanId', 'TPay_Orange_EG')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "EGY_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].subPricingPlanIds[0]', "60201")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].showIn[1]', 'HORIZONTAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "Paiement mobile")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[3].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconMobile.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "28.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].allowedForAcquisition', 'true')

// Monthly Mobile Vodafone
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].pricingPlanId', 'TPay_Vodafone_EG')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].productId', "EGY_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].subPricingPlanIds[0]', "60202")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].priceLabel', "28.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].allowedForAcquisition', 'true')

// Monthly Mobile Etisalat
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].pricingPlanId', 'TPay_Etisalat_EG')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].productId', "EGY_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].subPricingPlanIds[0]', "60203")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].priceLabel', "28.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].allowedForAcquisition', 'true')
// Monthly Mobile WE
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].pricingPlanId', 'TPay_WE_EG')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].productId', "EGY_SHAHID_MOBILE_ONLY_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].subPricingPlanIds[0]', "60204")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].priceLabel', "28.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].allowedForAcquisition', 'true')



// Yearly package Visual Elements
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_MOBILE_ONLY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', "")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', 'Plan Annuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].value', "Économisez 29%")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', '20.41 EGP / mois')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].value', "244.99 EGP facturés chaque année")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].value', '244.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].value', 'EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', '18')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', '244.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', 'EGP')


// Yearly Fawry
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "EGY_B2C_SHAHID_MOBILE_ONLY_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "CASH_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].value', "Fawry")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].value', "https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/carriers/fawry2.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "244.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')






// Deals
WS.verifyElementPropertyValue(getResponse, 'deals[0].param', 'EtisalatEGY')
WS.verifyElementPropertyValue(getResponse, 'deals[0].skipLandingPage', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visible', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].dealType', 'deal_with_pricing_plan')
WS.verifyElementPropertyValue(getResponse, 'deals[0].template','TELCO')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[7].key','main_partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[7].value','https://shahidstatic1.akamaized.net/mediaObject/product_images/En_large/original/En_large.png?type=png')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].featured','false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].liteRegistrationEnabled','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].packageName','monthly')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].price','28.99')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].currency','EGP')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].packageId','SHAHID_MOBILE_ONLY')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].catalogId','VIP')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[6].key','show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[6].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[7].key','show_tag')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[7].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[10].key','price')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[10].value','28.99')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[11].key','currency')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[11].value','EGP')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[12].key','duration')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[12].value','Mensuel')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[16].key','CC_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[16].value[0]','visa')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[16].value[1]','master')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[17].key','summary_text_1')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[17].value','Plan mensuel \n 9,99 EGP / Mensuel') 
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[18].key','tab_name')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[18].value','VIP Mobile')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[19].key','summary_text_2')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[19].value','Abonnez-vous et économisez 50 % sur les 3 premiers mois.\n Profitez de tout un monde de divertissement à petit prix de 9.99 EGP / mois')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].productId','EGY_SHAHID_MOBILE_ONLY_1M')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].pricingPlanId','TPay_Etisalat_EG')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod','MOBILE_PAY')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]','60203')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel','28.99')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel','EGP')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId','TPEGYMO1M')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].showForAnonymous','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[0].key','pop_up_tab_title')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[0].value[0]','CGU')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[1].key','pop_up_tab_content')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[1].value[0]',"<ul> <li>50% de réduction est disponible uniquement pour les nouveaux abonnés </li> <li>Le service sera automatiquement renouvelé après 3 mois au prix régulier de 19,99 EGP / mois </li> <li>Offre valable sur le plan mensuel</li> <li>L'offre est valable pour une rédemption seulement </li> <li>Pour plus d'information, contactez-nous à care@shahid.net </li> </ul>")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[2].key','partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[2].value','https://shahidstatic1.akamaized.net/mediaObject/product_images/En_large/original/En_large.png?type=png')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[4].key','partner_name')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[4].value','EtisalatEGY')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[6].key','continue_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[6].value',"Profitez de l'offre")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[7].key','guideline_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[7].value[0]',"Les CGU s'appliquent.")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.cards[0].image','https://shahid.mbc.net/mediaObject/nsf-packages/thumbnail_Mobile-Landing-Page/original/thumbnail_Mobile-Landing-Page.jpeg')

// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value',"Les frais d'abonnement peuvent varier selon le pays, le moyen de paiement, le forfait, les taxes, les taux de change et les frais bancaires. Les conditions générales d'utilisation s'appliquent.")
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].key','display_type')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].value','vertical')

//  Alternative Payment
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[0].key','alternative_payment_title')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[0].value',"Ou choisissez l'un des autres moyens de paiement suivants")
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[1].key','label_text')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[1].value','Autres moyens de paiement')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[3].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[3].value','Cliquez ici')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[4].key','main_title')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[4].value','Autres moyens de paiement')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[6].key','alternative_payment_methods')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[6].value',"Vous pouvez vous procurer un code promo Shahid auprès de l'un des points de vente suivants")
//Partners
WS.verifyElementPropertyValue(getResponse, 'partners[0].name','Fawry')
WS.verifyElementPropertyValue(getResponse, 'partners[0].link','https://fawryplus.com/branches/')
WS.verifyElementPropertyValue(getResponse, 'partners[0].logo','https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/logos/fawry.svg')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].value',"Plus d’informations")
WS.verifyElementPropertyValue(getResponse, 'partners[1].name','Bee')
WS.verifyElementPropertyValue(getResponse, 'partners[1].link','https://customer.bee.com.eg/en/bee-locator')
WS.verifyElementPropertyValue(getResponse, 'partners[1].logo','https://static.s3.shahid.mbc.net/widget-images/logos/bee@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].value',"Plus d’informations")
WS.verifyElementPropertyValue(getResponse, 'partners[2].name','Aman')
WS.verifyElementPropertyValue(getResponse, 'partners[2].link','http://epayments.aman.eg/')
WS.verifyElementPropertyValue(getResponse, 'partners[2].logo','https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/Logo_Aman.png')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].value',"Plus d’informations")

//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')