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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("IOS_APP", "AR", "SHAHID_VIP","IL" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'ISR')

WS.verifyElementPropertyValue(getResponse, 'platform', '[IOS_APP]')

// 30% Offers

WS.verifyElementPropertyValue(getResponse, 'offers[0].offerId', "winback-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[0].offerParam', "winback30")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].price', '15.5')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].value', 'الشهرية')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].value', '15.5')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].value', 'اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].value', 'تتجدد شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
////WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].value', '15.5 ₪')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].value','احصل على خصم 30%' )
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[12].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[14].value', 'وفر 30%')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].value', 'true')
// iTunes Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].productId', "ISR_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '15.5')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_30P_ISR')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')

// 40% Offers

WS.verifyElementPropertyValue(getResponse, 'offers[1].offerId', "winback-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[1].offerParam', "winback40")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].price', '13.5')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].value', 'الشهرية')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].value', '13.5')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].value', 'اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].value', 'تتجدد شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
//WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].value', '13.5 ₪')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].value','احصل على خصم 40%' )
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[12].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[14].value', 'وفر 40%')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].value', 'true')

// iTunes Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].productId', "ISR_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '13.5')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_40P_ISR')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
// 50% Offers

WS.verifyElementPropertyValue(getResponse, 'offers[2].offerId', "winback-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[2].offerParam', "winback50")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].price', '11.0')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].currency', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].value', 'الشهرية')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].value', '11')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].value', 'اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].value', 'تتجدد شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
//WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].value', '11 ₪')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].value','احصل على خصم 50%' )
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[12].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[14].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[14].value', 'وفر 50%')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].value', 'true')
// iTunes Only NSF Offe2
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].productId', "ISR_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'APPLE_IAP')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '11')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', '₪')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'iOS_RE_50P_ISR')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')


// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', 'الشهرية')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', '21.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[13].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[5].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[5].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'اشترك')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', 'تتجدد شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', '21.9 ₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value',"الاشتراك الشهري" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[12].value', 'الأكثر مبيعاً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '0')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '21.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', '₪')

// Monthly iTunes
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "ISR_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplus1monthfreetrial')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "APPLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "21.9")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "₪")



// Yearly package Visual Elemnts


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', 'السنوية')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', '₪')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', '187.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[5].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[5].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].value', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'CTA_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', 'اشترك')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].value', "12 شهراً - 15.65 ₪/ شهرياً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', '187.9 ₪ ')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].value',"وفر29%" )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].value','الاشتراك السنوي' )
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[13].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[13].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', '2')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', '187.9')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', '₪')

// Yearly iTunes
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "ISR_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].subPricingPlanIds[0]', 'mbc.shahid.iosplusyearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "APPLE_IAP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "187.9")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "₪")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')



// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value',"رسوم الاشتراك قد تختلف بناءً على البلد أو طريقة الدفع أو باقة الإشتراك أو الضريبة المضافة أو معامل تحويل العملات والرسوم البنكية. تطبّق الشروط والأحكام")



//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




