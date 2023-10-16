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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("IOS_APP", "FR", "SHAHID_VIP_SPORT","PS" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'PSE')

WS.verifyElementPropertyValue(getResponse, 'platform', '[IOS_APP]')


// winback30 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[3].offerId', "winback-sport-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[3].offerParam', "sportsoffer30")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].price', '23.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[2].value', '23.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].value', "S'abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].value', 'renouvelé chaque mois')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
////WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].value', '23.9 ₪')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].value','30% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[14].value', 'Économisez 30% ')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[13].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].productId', "ISR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'Shahid_Sport_VIP01')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '23.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_WB_SPORT_30P_ISR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')



// sportsoffer40 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[4].offerId', "winback-sport-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[4].offerParam', "sportsoffer40")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].price', '20.9')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[2].value', '20.9')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].value', "S'abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].value', 'renouvelé chaque mois')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
//////WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].value', '20.9 ₪')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].value','40% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[14].value', 'Économisez 40% ')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[13].value', 'true')
// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].productId', "ISR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'Shahid_Sport_VIP01')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '20.9')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_WB_SPORT_40P_ISR')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')


// winback50 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[5].offerId', "winback-sport-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[5].offerParam', "sportsoffer50")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].price', '16.9')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[2].value', '16.9')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[6].value', "S'abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].value', 'renouvelé chaque mois')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
//////WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[9].value', '16.9 ₪')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].value','50% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[14].value', 'Économisez 50% ')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[13].value', 'true')
// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].productId', "ISR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'Shahid_Sport_VIP01')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '16.9')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_WB_SPORT_50P_ISR')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')





// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', '33.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', "S'abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', 'renouvelé chaque mois')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', '33.9 ₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value',"Plan Mensuel" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].value',"Le plus populaire")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '3')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '33.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', '₪')

// Monthly iTunes
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'Shahid_Sport_VIP01')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "APPLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "33.9")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "₪")



// Yearly package Visual Elemnts


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', 'Annuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', '344.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[5].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[5].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', "S'abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].value', "12 mois à 29.99 ₪ / mois")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', '344.9 ₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].value',"Économisez 32%" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].value',"Plan Annuel" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[13].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[13].value', "Abonnez-vous dès maintenant et profitez de vos programmes sans publicité")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', '5')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', '344.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', '₪')

// Yearly iTunes
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].subPricingPlanIds[0]', 'Shahid_Sport_VIP12')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "APPLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "344.9")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "₪")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')



// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value',"Les frais d'abonnement peuvent varier selon le pays, le moyen de paiement, le forfait, les taxes, les taux de change et les frais bancaires. Les conditions générales d'utilisation s'appliquent.")



//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




