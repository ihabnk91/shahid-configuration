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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("ANDROID_APP", "FR", "SHAHID_VIP_SPORT","GB" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'GBR')

WS.verifyElementPropertyValue(getResponse, 'platform', '[ANDROID_APP]')

// sportsoffer30 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[3].offerId', "winback-sport-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[3].offerParam', "sportsoffer30")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].price', '10.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].currency', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].value','30% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[3].value', 'facturation mensuelle')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].value', '10.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].value', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[13].value', 'Économisez 30% ')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].value', 'true')


// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].productId', "GBR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "[net.shahid.monthly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'GOOGLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '10.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'GW_WB_SPORT_30P_GBR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value',"S’abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','google')


// sportsoffer40 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[4].offerId', "winback-sport-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[4].offerParam', "sportsoffer40")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].price', '9.29')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].currency', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].value','40% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[3].value', 'facturation mensuelle')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].value', '9.29')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].value', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[13].value', 'Économisez 40% ')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].productId', "GBR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "[net.shahid.monthly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'GOOGLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '9.29')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'GW_WB_SPORT_40P_GBR')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value',"S’abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','google')

// sportsoffer50 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[5].offerId', "winback-sport-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[5].offerParam', "sportsoffer50")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].price', '7.79')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].currency', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].value', 'Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].value','50% de réduction' )
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[3].value', 'facturation mensuelle')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].value', '7.79')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[9].value', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].value', 'Offre limitée')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[13].value', 'Économisez 50% ')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].productId', "GBR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "[net.shahid.monthly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'GOOGLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '7.79')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'GW_WB_SPORT_50P_GBR')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value',"S’abonner")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','google')






// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "Abonnez-vous dès maintenant et profitez de vos programmes sans publicité")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'Plan Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "15.49 GBP / mois")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'facturation mensuelle')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '15.49')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'Mensuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', "Le plus populaire")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '3')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '15.49')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'GBP')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "GBR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "[net.shahid.monthly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "GOOGLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "google")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "15.49")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "GBP")





// Yearly package Visual Elements


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', "Abonnez-vous dès maintenant et profitez de vos programmes sans publicité")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', 'Plan Annuel ')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', "Économisez 17%")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].value', '12.91 GBP/ mois')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].value', '154.99 GBP facturés chaque année')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', '154.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].value', 'GBP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].value', 'Annuel')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', '5')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', '154.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', 'GBP')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "GBR_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].subPricingPlanIds', "[net.shahid.yearly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "GOOGLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].value', "S’abonner")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].value', "google")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "154.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "GBP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')






// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','Abonnez-vous dès maintenant et profitez de vos programmes sans publicité')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value',"L'offre n'est pas valable pour les anciens abonnés via Google Play. Les frais d’abonnement peuvent varier selon le pays, le moyen de paiement, le forfait, les taxes, les taux de change et les frais bancaires. Les conditions générales d’utilisation s’appliquent.")
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].key','display_type')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].value','vertical')


//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




