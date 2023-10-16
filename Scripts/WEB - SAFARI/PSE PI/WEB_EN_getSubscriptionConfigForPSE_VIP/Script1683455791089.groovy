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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "EN", "SHAHID_VIP","PS" , "true")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'PSE')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')



// winback-30-offer

WS.verifyElementPropertyValue(getResponse, 'offers[0].offerId', "winback-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[0].offerParam', "winback30")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].price', '8.33')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].value','30% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].value', '8.33 ₪ / month')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].value', '8.33')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[12].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].value', 'Save 30%')


// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '8.33')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_30P_PSE')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// winback-40-offer

WS.verifyElementPropertyValue(getResponse, 'offers[1].offerId', "winback-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[1].offerParam', "winback40")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].price', '7.14')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].value','40% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].value', '7.14 ₪ / month')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].value', '7.14')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].value', 'Save 40%')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '7.14')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_40P_PSE')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')


// winback50 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[2].offerId', "winback-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[2].offerParam', "winback50")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].price', '5.95')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].value','50% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].value', '5.95 ₪ / month')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].value', '5.95')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].value', 'Save 50%')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '5.95')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'RE_50P_PSE')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// winback3m Offers

WS.verifyElementPropertyValue(getResponse, 'offers[3].offerId', "winback-3m-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[3].offerParam', "winback3m")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].price', '6.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].value','3 For 1 Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[2].value', '6.9 ₪ / month')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].value', '6.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '6.9')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_3MP_PSE')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// winback-lt Offers

WS.verifyElementPropertyValue(getResponse, 'offers[4].offerId', "winback-lt-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[4].offerParam', "winback-lt")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].price', '6.9')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].value','3 For 1 Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[2].value', '16.9 ₪ / month')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].value', '6.9')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '6.9')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_LTOP_PSE')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')



// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "Watch the most powerful series and movies exclusively without stopping")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'Monthly Plan')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "16.9 ₪ / month")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '16.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '0')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '16.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', '₪')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "Credit/Debit Card")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "16.9")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "₪")



WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "PSE_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', "APPLE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', "Apple Pay")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/ApplePay_PlanSelectionIcon.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "16.9")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "₪")



// Yearly package Visual Elemnts


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', "Watch the most powerful series and movies exclusively without stopping")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', 'Annual Plan')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', "Save 30%")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].value', '11.9 ₪/ month')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].value', '142.9 ₪ billed every year')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', '142.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].value', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', '2')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', '142.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', '₪')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "PSE_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].value', "Credit/Debit Card")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "142.9")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "₪")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')



// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].productId', "PSE_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].paymentMethod', "APPLE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[0].value', "Apple Pay")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[1].value', "Subscribe")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/ApplePay_PlanSelectionIcon.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].priceLabel', "142.9")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].currencyLabel', "₪")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].allowedForAcquisition', 'true')

// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value','Subscription fees may vary depending on the country, payment method, subscription package, added tax, currency conversion factor, and bank fees. Terms and conditions apply.')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].key','display_type')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].value','vertical')



//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




