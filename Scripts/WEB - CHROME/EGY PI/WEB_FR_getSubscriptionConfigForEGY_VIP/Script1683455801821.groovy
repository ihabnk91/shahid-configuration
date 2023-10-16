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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "FR", "SHAHID_VIP","EG" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'EGY')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')





// Monthly Package Visual Elemnts
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "Abonnez-vous dès maintenant et profitez de vos programmes sans publicité")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'Plan Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "88.99 EGP/ mois")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'facturation mensuelle')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '88.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'Le plus populaire')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '0')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '88.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'EGP')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "EGY_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "Carte de crédit/débit")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "88.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "EGP")




// Monthly Mobile Orange
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].pricingPlanId', 'TPay_Orange_EG')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "EGY_B2C_SHAHID_VIP_1M")
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
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "88.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].allowedForAcquisition', 'true')

// Monthly Mobile Vodafone
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].pricingPlanId', 'TPay_Vodafone_EG')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].productId', "EGY_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].subPricingPlanIds[0]', "60202")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].priceLabel', "88.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].allowedForAcquisition', 'true')


// Monthly Mobile Etisalat
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].pricingPlanId', 'TPay_Etisalat_EG')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].productId', "EGY_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].subPricingPlanIds[0]', "60203")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].priceLabel', "88.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].allowedForAcquisition', 'true')

// Monthly Mobile WE
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].pricingPlanId', 'TPay_WE_EG')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].productId', "EGY_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].subPricingPlanIds[0]', "60204")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].priceLabel', "88.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[4].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[5].allowedForAcquisition', 'true')








//Quarterly card in EGY is now showing the offers card, and has two payment methods (e-wallet and Vodafone cash): - Marwa
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].liteRegistrationEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].period', "Quarterly")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].packageName', "Quarterly")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].price', "234.99")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].currency', "EGP")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].order', "1")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].value', "Abonnez-vous dès maintenant et profitez de vos programmes sans publicité")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].key', "display_title")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].value', "Plan Trimestriel")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[2].value', "Économisez 30%")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[3].value', "78.33 EGP/ mois")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[4].value', "234.99 EGP facturés tous les 3 mois")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[7].key', "show_payment_logo")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[7].value', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].key', "show_tag")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].key', "price")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].value', "234.99")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].key', "currency")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].value', "EGP")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].key', "duration")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].visualElements[12].value', "Trimestriel")



// First payment method in quarterly card for paymob (e-wallet payment) - Marwa
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].pricingPlanId', "c97")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].productId', "EGY_B2C_SHAHID_VIP_3M")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "WALLET_PAY")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].numberOfDay', "7")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "234.99")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].oneTimeCharge', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].renewalDays', "0")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].dealId', "VIP3M_B2C_Vodafone_Cash")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].providerLogos[0]', "https://shahid-static.s3.amazonaws.com/widget-images/logos/vfcash.svg")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].providerLogosNumberToShow', "1")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "Paiment e-wallet")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[3].value', "https://shahid-static.s3.amazonaws.com/widget-images/icons/iconPaymobLogo.svg")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")





// second payment method in quarterly card for paymob (vodafone cash) - Marwa
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].pricingPlanId', "c97")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].productId', "EGY_B2C_SHAHID_VIP_3M")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', "WALLET_PAY")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].numberOfDay', "7")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "234.99")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].oneTimeCharge', "false")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].renewalDays', "0")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].dealId', "VIP3M_B2C_Vodafone_Cash")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].allowedForAcquisition', "true")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].providerLogos[0]', "https://shahid-static.s3.amazonaws.com/dev/widget-images/vodafone/VF_Cash.png")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].providerLogosNumberToShow', "1")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "Vodafone Cash")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[3].value', "https://shahid-static.s3.amazonaws.com/dev/widget-images/vodafone/VF_Cash.png")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'x.offers[5].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")




// Yearly package Visual Elements
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', "Abonnez-vous dès maintenant et profitez de vos programmes sans publicité")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', 'Plan Annuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', "Économisez 29%")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].value', '63.33 EGP/ mois')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].value', "759.99 EGP facturés chaque année")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', '759.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].value', 'EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].value', 'Annuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', '2')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', '759.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', 'EGP')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "EGY_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].value', "Carte de crédit/débit")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "759.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')


// Yearly Fawry
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].productId', "EGY_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].paymentMethod', "CASH_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[0].value', "Payez en espèces")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[1].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[2].value', "https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/carriers/fawry2.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].priceLabel', "759.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].showIn[1]', 'HORIZONTAL_MODE')






// Yearly Paymob 'e-wallet Payment' -marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].pricingPlanId', "f42")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].productId', "EGY_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].paymentMethod', "WALLET_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].priceLabel', "759.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].oneTimeCharge', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].renewalDays', "0")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].allowedForAcquisition', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].providerLogosNumberToShow', '1')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].providerLogos[0]', 'https://shahid-static.s3.amazonaws.com/widget-images/logos/vfcash.svg')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[0].value', "Paiment e-wallet")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[1].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[2].value', "https://shahid-static.s3.amazonaws.com/widget-images/icons/iconPaymobLogo.svg")



// Yearly Paymob 'Vodafone Cash' - Marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].pricingPlanId', "w1")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].productId', "EGY_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].paymentMethod', "WALLET_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].priceLabel', "759.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].oneTimeCharge', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].renewalDays', "0")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].allowedForAcquisition', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].providerLogosNumberToShow', '1')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].providerLogos[0]', 'https://shahid-static.s3.amazonaws.com/widget-images/logos/vfcash.svg')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].visualElements[0].value', "Vodafone Cash")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].visualElements[1].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[3].visualElements[2].value', "https://shahid-static.s3.amazonaws.com/dev/widget-images/vodafone/VF_Cash.png")



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