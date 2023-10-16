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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "AR", "SHAHID_VIP_SPORT","EG" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'EGY')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')



// Monthly Package Visual Elemnts
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'الاشتراك الشهري')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "299.99 EGP / شهرياً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].key', 'Free_trial_day')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[7].value', '7')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '299.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', 'الأكثر مبيعاً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '3')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '299.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'EGP')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "EGY_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', 'البطاقة المصرفية')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "299.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "EGP")




// Quarterly Package - Marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].liteRegistrationEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].period', "Quarterly")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageName', "Quarterly")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].price', "869.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].currency', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].order', "3")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[1].value', 'اشتراك الـ  ٣ أشهر')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[2].value', "289.99 EGP / شهرياً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[3].value', '869.99 EGP تدفع كل ثلاثة اشهر')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[8].value', '869.99 EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[9].value', 'EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].visualElements[10].value', 'كل ثلاثة شهور')



// Quarterly Fawry - Marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].pricingPlanId', "f3")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].productId', "EGY_B2C_SHAHID_VIP_SPORT_3M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].paymentMethod', "CASH_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].numberOfDay', '7')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].freeTrialEnabled', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].priceLabel', "869.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].oneTimeCharge', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].renewalDays', "0")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[0].value', "ادفع نقداً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[0].visualElements[2].value', "https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/carriers/fawry2.svg")



// Quarterly e-wallet - Marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].pricingPlanId', "f3")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].productId', "EGY_B2C_SHAHID_VIP_SPORT_3M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].paymentMethod', "WALLET_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].numberOfDay', '7')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].freeTrialEnabled', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].priceLabel', "869.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].oneTimeCharge', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].renewalDays', "0")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].showIn[1]', 'HORIZONTAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[1].value', "المحفظة الإلكترونية")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[2].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[1].visualElements[3].value', "https://shahid-static.s3.amazonaws.com/widget-images/icons/iconPaymobLogo.svg")

// Quarterly e-wallet - Marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].pricingPlanId', "f3")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].productId', "EGY_B2C_SHAHID_VIP_SPORT_3M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].paymentMethod', "WALLET_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].numberOfDay', '7')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].freeTrialEnabled', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].priceLabel', "869.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].oneTimeCharge', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].renewalDays', "0")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].showIn[1]', 'HORIZONTAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[1].value', "فودافون كاش")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[2].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[1].pricingPlanData[2].visualElements[3].value', "https://shahid-static.s3.amazonaws.com/widget-images/icons/iconPaymobLogo.svg")




// Yearly package Visual Elements
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].liteRegistrationEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].packageId', "SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].catalogId', "SPORT")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].order', '5')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].price', '3299.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].currency', 'EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].packageName', "yearly")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].value', 'الاشتراك السنوي')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].value', "8% وفر")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].value', '274.99 EGP / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].value', '3299.99 EGP  تدفع سنوياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].value', '3299.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].value', 'EGP')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].value', 'سنوياً')



// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].productId', "EGY_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].value', "البطاقة المصرفية")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].priceLabel', "3299.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')


// Yearly Fawry -marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].productId', "EGY_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].paymentMethod', "CASH_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[0].value', "ادفع نقداً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].visualElements[2].value', "https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/carriers/fawry2.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].priceLabel', "3299.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[1].showIn[1]', 'HORIZONTAL_MODE')



//e-wallet yearly -marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].pricingPlanId', "w1")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].productId', "EGY_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].paymentMethod', "WALLET_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].priceLabel', "3299.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].visualElements[1].value', "المحفظة الإلكترونية")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].visualElements[2].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].visualElements[3].value', "https://shahid-static.s3.amazonaws.com/widget-images/icons/iconPaymobLogo.svg")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[2].showIn[1]', 'HORIZONTAL_MODE')


//vodafone cash yearly -marwa
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].pricingPlanId', "w1")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].productId', "EGY_B2C_SHAHID_VIP_SPORT_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].paymentMethod', "WALLET_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].priceLabel', "3299.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].currencyLabel', "EGP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].visualElements[1].value', "فودافون كاش")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].visualElements[2].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].visualElements[3].value', "https://shahid-static.s3.amazonaws.com/dev/widget-images/vodafone/VF_Cash.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].showIn[1]', 'HORIZONTAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[3].providerLogos[0]', 'https://shahid-static.s3.amazonaws.com/dev/widget-images/vodafone/VF_Cash.png')




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
WS.verifyElementPropertyValue(getResponse, 'partners[0].name','Fawry')
WS.verifyElementPropertyValue(getResponse, 'partners[0].link','https://fawryplus.com/branches/')
WS.verifyElementPropertyValue(getResponse, 'partners[0].logo','https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/logos/fawry.svg')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].value','معلومات إضافية')
WS.verifyElementPropertyValue(getResponse, 'partners[1].name','Bee')
WS.verifyElementPropertyValue(getResponse, 'partners[1].link','https://customer.bee.com.eg/en/bee-locator')
WS.verifyElementPropertyValue(getResponse, 'partners[1].logo','https://static.s3.shahid.mbc.net/widget-images/logos/bee@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].value','معلومات إضافية')
WS.verifyElementPropertyValue(getResponse, 'partners[2].name','Aman')
WS.verifyElementPropertyValue(getResponse, 'partners[2].link','http://epayments.aman.eg/')
WS.verifyElementPropertyValue(getResponse, 'partners[2].logo','https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/Logo_Aman.png')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].value','معلومات إضافية')

//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')