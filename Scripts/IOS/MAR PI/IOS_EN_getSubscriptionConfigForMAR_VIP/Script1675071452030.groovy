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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("IOS_APP", "EN", "SHAHID_VIP","MA" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'MAR')

WS.verifyElementPropertyValue(getResponse, 'platform', '[IOS_APP]')

// winback-30-offer

WS.verifyElementPropertyValue(getResponse, 'offers[0].offerId', "winback-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[0].offerParam', "winback30")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].price', '23.1')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].currency', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].value', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].value', '23.1')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].value', 'Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].value', 'renewed monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
////WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].value', '23.1 DH')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].value','30% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].value', 'true')


// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].productId', "MAR_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '23.1')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_30P_MAR')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
// winback-40-offer

WS.verifyElementPropertyValue(getResponse, 'offers[1].offerId', "winback-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[1].offerParam', "winback40")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].price', '19.8')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].currency', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].value', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].value', '19.8')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].value', 'Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].value', 'renewed monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
//WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].value', '19.8 DH')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].value','40% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].value', 'true')
// CC Only NSF Offe
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].productId', "MAR_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '19.8')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_40P_MAR')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')



// winback50 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[2].offerId', "winback-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[2].offerParam', "winback50")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].price', '16.5')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].currency', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].value', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].value', '16.5')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].value', 'Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].value', 'renewed monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
//WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].value', '16.5 DH')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].value','50% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].value', 'true')
// CC Only NSF Offe
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].productId', "MAR_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '16.5')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'DH')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_50P_MAR')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')


// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'DH')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', '33')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[5].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[7].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[7].value', 'Subscribe')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'renewed monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', '33 DH')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].value',"Monthly Plan" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[14].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[14].value', 'Most popular')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '0')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '33')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'DH')

// Monthly iTunes
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "MAR_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "APPLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "33")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "DH")



// Yearly package Visual Elemnts


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', 'DH')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', '283')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[5].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[5].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', 'Subscribe')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].value', "12 months at 23.58 DH / month")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', '283 DH')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].value',"Save 29%" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].value','Annual Plan' )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[13].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[13].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', '2')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', '283')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', 'DH')

// Yearly iTunes
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "MAR_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplusyearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "APPLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "283")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "DH")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')



// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value',"Subscription fees may vary depending on the country, payment method, subscription package, added tax, currency conversion factor, and bank fees. Terms and conditions apply.")



//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




