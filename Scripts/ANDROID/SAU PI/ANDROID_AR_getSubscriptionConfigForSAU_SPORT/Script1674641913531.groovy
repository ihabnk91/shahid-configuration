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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("ANDROID_APP", "AR", "SHAHID_VIP_SPORT","SA" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'SAU')

WS.verifyElementPropertyValue(getResponse, 'platform', '[ANDROID_APP]')


// 30% Offer

WS.verifyElementPropertyValue(getResponse, 'offers[3].offerId', "winback-sport-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[3].offerParam', "sportsoffer30")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].price', '48.99')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].currency', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].value','احصل على خصم 30%' )
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].value', '48.99')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[13].value', 'وفر 30%')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].value', 'true')


// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "[net.shahid.monthly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'GOOGLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '48.99')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'GW_WB_SPORT_30P_SAU')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','google')

// 40% Offers

WS.verifyElementPropertyValue(getResponse, 'offers[4].offerId', "winback-sport-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[4].offerParam', "sportsoffer40")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].price', '41.99')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].currency', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].value','احصل على خصم 40%' )
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].value', '41.99')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[13].value', 'وفر 40%')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "[net.shahid.monthly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'GOOGLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '41.99')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'GW_WB_SPORT_40P_SAU')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','google')

// 50% Offers

WS.verifyElementPropertyValue(getResponse, 'offers[5].offerId', "winback-sport-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[5].offerParam', "sportsoffer50")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].price', '34.99')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].currency', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].value','احصل على خصم 50%' )
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].value', '34.99')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[9].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[13].value', 'وفر 50%')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "[net.shahid.monthly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'GOOGLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '34.99')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'GW_WB_SPORT_50P_SAU')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','google')



// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'الاشتراك الشهري  ')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "69.99 SAR / شهرياً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '69.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', 'الأكثر مبيعاً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '3')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '69.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'SAR')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "[net.shahid.monthly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "GOOGLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "google")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "69.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "SAR")



// Yearly package Visual Elements


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].value', 'الاشتراك السنوي ')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].value', "وفر17%")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].value', "58.33 SAR / شهرياً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].value', ' 699.99 SAR  تدفع سنوياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].value', '699.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].value', 'سنوياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].order', '5')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].price', '699.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].currency', 'SAR')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].subPricingPlanIds', "[net.shahid.yearly.vipsports]")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].paymentMethod', "GOOGLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].value', "google")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].priceLabel', "699.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')


// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value','العرض غير متاح للمشتركين السابقين عبر جوجل بلاي. رسوم الاشتراك قد تختلف بناءً على البلد أو طريقة الدفع أو باقة الاشتراك أو الضريبة المضافة أو معامل تحويل العملات والرسوم البنكية. تطبّق الشروط والأحكام.')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].key','display_type')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].value','vertical')

//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




