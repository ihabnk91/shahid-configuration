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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "AR", "SHAHID_VIP","DZ" , "true")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'DZA')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')



// 30% Offer

WS.verifyElementPropertyValue(getResponse, 'offers[0].offerId', "winback-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[0].offerParam', "winback30")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].price', '279.3')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].currency', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[0].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[1].value','احصل على خصم 30%' )
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[2].value', '279.3 DZD / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[8].value', '279.3')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[9].value', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[11].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[13].value', 'وفر 30%')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].visualElements[12].value', 'true')


// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].productId', "DZA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '279.3')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_30P_DZA')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','البطاقة المصرفية')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[0].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// 40% Offers

WS.verifyElementPropertyValue(getResponse, 'offers[1].offerId', "winback-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[1].offerParam', "winback40")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].price', '239.4')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].currency', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[0].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[1].value','احصل على خصم 40%' )
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[2].value', '239.4 DZD / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[8].value', '239.4')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[9].value', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[11].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[13].value', 'وفر 40%')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].visualElements[12].value', 'true')
// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].productId', "DZA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '239.4')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_40P_DZA')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','البطاقة المصرفية')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[1].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// 50% Offers

WS.verifyElementPropertyValue(getResponse, 'offers[2].offerId', "winback-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[2].offerParam', "winback50")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].price', '199.5')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].currency', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[0].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[1].value','احصل على خصم 50%' )
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[2].value', '199.5 DZD / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[8].value', '199.5')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[9].value', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[11].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[13].value', 'وفر 50%')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].visualElements[12].value', 'true')
// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].productId', "DZA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '199.5')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'RE_50P_DZA')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','البطاقة المصرفية')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[2].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// 3M Offers

WS.verifyElementPropertyValue(getResponse, 'offers[3].offerId', "winback-3m-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[3].offerParam', "winback3m")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].price', '201')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].currency', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[0].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[1].value','بدل الشهر ثلاثة' )
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[2].value', '201 DZD / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[8].value', '201')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[9].value', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[11].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].productId', "DZA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '201')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_3MP_DZA')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','البطاقة المصرفية')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','اشترك')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[3].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// lt Offers

WS.verifyElementPropertyValue(getResponse, 'offers[4].offerId', "winback-lt-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[4].offerParam', "winback-lt")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].price', '201')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].currency', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].packageId',"SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].catalogId',"VIP")
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[0].value', 'شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[1].value','بدل الشهر ثلاثة' )
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[2].key', 'promo_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[2].value', '201 DZD / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[8].value', '201')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[9].value', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[11].value', 'عرض لمدة محدودة')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[4].groups[0].pricingPlans[0].visualElements[12].value', 'true')


// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'الاشتراك الشهري')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "401 DZD / شهرياً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '401')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '0')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '401')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'DZD')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "DZA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "البطاقة المصرفية")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "401")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "DZD")


// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "DZA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', "APPLE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', "Apple Pay")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/ApplePay_PlanSelectionIcon.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "401")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "DZD")

// Yearly package Visual Elements


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', 'الاشتراك السنوي')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', "25% وفر")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].value', '300.08 DZD / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[4].value', ' 3601 DZD  تدفع سنوياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', '3601')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[11].value', 'DZD')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[12].value', 'سنوياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', '2')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', '3601')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', 'DZD')
// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "DZA_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].value', "البطاقة المصرفية")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "3601")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "DZD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "DZA_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "APPLE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].value', "Apple Pay")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/ApplePay_PlanSelectionIcon.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "3601")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "DZD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')

// main Visual Elements
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].key','main_CTA_text_1')
WS.verifyElementPropertyValue(getResponse, 'visualElements[0].value','شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].key','main_disclaimer_text')
WS.verifyElementPropertyValue(getResponse, 'visualElements[2].value','رسوم الاشتراك قد تختلف بناءً على البلد أو طريقة الدفع أو باقة الاشتراك أو الضريبة المضافة أو معامل تحويل العملات والرسوم البنكية. تطبّق الشروط والأحكام.')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].key','display_type')
WS.verifyElementPropertyValue(getResponse, 'visualElements[4].value','vertical')

//  Alternative Payment
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[0].key','alternative_payment_title')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[0].value','أو قم باختيار إحدى الطرق البديلة التالية')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[1].key','label_text')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[1].value','طرق الدفع الأخرى')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[3].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[3].value','اضغط هنا')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[4].key','main_title')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[4].value','طرق الدفع الأخرى')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[6].key','alternative_payment_methods')
WS.verifyElementPropertyValue(getResponse, 'pages[0].visualElements[6].value','يمكنك شراء قسيمة شاهد التسويقية من أي من بائعي التجزئة التاليين')

//Partners
WS.verifyElementPropertyValue(getResponse, 'partners[0].name','Offgamers')
WS.verifyElementPropertyValue(getResponse, 'partners[0].link','https://www.offgamers.com/ae/en/shahid-vip')
WS.verifyElementPropertyValue(getResponse, 'partners[0].logo','https://shahid-static.s3.amazonaws.com/widget-images/logos/Logo_Offgamers.jpg')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].value','معلومات إضافية')

WS.verifyElementPropertyValue(getResponse, 'partners[1].name','Metagames Bilgi Islemleri Limited')
WS.verifyElementPropertyValue(getResponse, 'partners[1].link','https://www.mtcgame.com/en-US/shahid/shahid-vip-gift-card-global')
WS.verifyElementPropertyValue(getResponse, 'partners[1].logo','https://shahid-static.s3.amazonaws.com/widget-images/logos/Logo_Meta%2BGames.png')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].value','معلومات إضافية')

WS.verifyElementPropertyValue(getResponse, 'partners[2].name','Razer Online')
WS.verifyElementPropertyValue(getResponse, 'partners[2].link','https://gold.razer.com/global/en/gold/catalog/shahid-vip-north-africa')
WS.verifyElementPropertyValue(getResponse, 'partners[2].logo','https://shahid-static.s3.amazonaws.com/widget-images/logos/Coin_RZR%20Gold_Black.png')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].value','معلومات إضافية')


//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




