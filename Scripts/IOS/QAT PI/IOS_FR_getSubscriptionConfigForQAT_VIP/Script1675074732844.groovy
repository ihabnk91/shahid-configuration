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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("IOS_APP", "FR", "SHAHID_VIP","QA")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'QAT')

WS.verifyElementPropertyValue(getResponse, 'platform', '[IOS_APP]')


// winback30 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[0].offerId', "winback-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[0].offerParam', "winback30")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].price', '24.49')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].currency', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].value', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].value', '24.49')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].value', 'renouvelé chaque mois')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
////WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].value', '24.49 QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].value','30% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[12].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[14].value', 'Économisez 30% ')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].productId', "QAT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '24.49')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_30P_QAT')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')



// winback40 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[1].offerId', "winback-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[1].offerParam', "winback40")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].price', '20.99')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].currency', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].value', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].value', '20.99')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].value', 'renouvelé chaque mois')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
//WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].value', '20.99 QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].value','40% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[12].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[14].value', 'Économisez 40% ')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].value', 'true')
// CC Only NSF Offe
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].productId', "QAT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '20.99')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_40P_QAT')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')


// winback50 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[2].offerId', "winback-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[2].offerParam', "winback50")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].price', '17.49')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].currency', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].value', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].value', '17.49')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].value', 'renouvelé chaque mois')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
//WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].value', '17.49 QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].value','50% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[12].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[14].value', 'Économisez 50% ')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].value', 'true')
// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].productId', "QAT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '17.49')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_50P_QAT')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')

// Ramdan Offers

WS.verifyElementPropertyValue(getResponse, 'offers[3].offerId', "ramadan_offer")
WS.verifyElementPropertyValue(getResponse, 'offers[3].offerParam', "ramadan")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].price', '239.99')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].currency', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].order','2')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].value', 'Annuel')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].value', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[2].value', '239.99')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].value', '19.99 QAR / mois les 12 premiers mois')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].value', '239.99 QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].value','Plan Annuel' )
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].value', 'Offre Ramadan')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[13].value', '50% de réduction')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[14].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[14].value', 'true')
// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].productId', "ARE_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplusyearly')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '239.99')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_Ramadan2023_VIP_ARE')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')

// CC Only RO Offe2
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].productId', "ARE_B2C_SHAHID_VIP_12M")

WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', 'title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', 'Carte de crédit/débit')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "S'abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', 'logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', '239.99')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].dealId', 'Ramadan2023_VIP_ARE')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[1].allowedForAcquisition', 'false')

// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', '39.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', 'renouvelé chaque mois')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', '39.99 QAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value',"Plan Mensuel" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].value', 'Le plus populaire')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '0')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '39.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'QAR')

// Monthly iTunes
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "QAT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "APPLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "39.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "QAR")


// Yearly package Visual Elemnts


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].value', 'Annuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].value', 'QAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].value', '339.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[5].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[5].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[6].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[9].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[9].value', "12 mois à 28.33 QAR / mois")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].value', '339.99 QAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].value',"Économisez 29%" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].value',"Plan Annuel" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[13].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[13].value', "Abonnez-vous dès maintenant et profitez de vos programmes sans publicité")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].order', '2')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].price', '339.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].currency', 'QAR')
// Yearly iTunes
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].productId', "QAT_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplusyearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].paymentMethod', "APPLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].priceLabel', "339.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].currencyLabel', "QAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].allowedForAcquisition', 'true')


// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value',"Les frais d'abonnement peuvent varier selon le pays, le moyen de paiement, le forfait, les taxes, les taux de change et les frais bancaires. Les conditions générales d'utilisation s'appliquent.")



//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




