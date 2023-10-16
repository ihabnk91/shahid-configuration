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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "AR", "SHAHID_VIP","SA" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'SAU')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')


// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'الاشتراك الشهري')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "39.99 SAR / شهرياً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '39.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[11].value', 'الأكثر مبيعاً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '0')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '39.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'SAR')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', 'البطاقة المصرفية')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "39.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "SAR")




// Monthly Mobile Zain
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].pricingPlanId', 'TPay_Zain_SA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "KSA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].subPricingPlanIds[0]', "42004")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].showIn[1]', 'HORIZONTAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].key', "payment_option_group")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[0].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[1].value', "الدفع عبر الجّوال")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[2].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[3].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].visualElements[3].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconMobile.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "39.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].allowedForAcquisition', 'true')

// Monthly Mobile Mobily
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].pricingPlanId', 'TPay_Mobily_SA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].productId', "KSA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].subPricingPlanIds[0]', "42003")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].priceLabel', "39.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].allowedForAcquisition', 'true')
// Monthly Mobile STC
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].pricingPlanId', 'TPay_STC_SA')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].productId', "KSA_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].subPricingPlanIds[0]', "42001")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].priceLabel', "39.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[3].allowedForAcquisition', 'true')


// Yearly package Visual Elements


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].value', 'الاشتراك السنوي')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].value', "وفر29%")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].value', '28.33 SAR / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].value', 'الدفعة المستحقة 339.99 SAR  كل سنة')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].value', '339.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].value', 'SAR')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].value', 'سنوياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].order', '2')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].price', '339.99')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].currency', 'SAR')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].productId', "KSA_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].value', "البطاقة المصرفية")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].priceLabel', "339.99")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].currencyLabel', "SAR")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].allowedForAcquisition', 'false')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')


// Deals

// STC landing page
WS.verifyElementPropertyValue(getResponse, 'deals[0].param', 'stcksa')
WS.verifyElementPropertyValue(getResponse, 'deals[0].skipLandingPage', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visible', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].dealType', 'deal_with_pricing_plan')
WS.verifyElementPropertyValue(getResponse, 'deals[0].template','TELCO')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[7].key','main_partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[7].value',"https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/STCLogo.png")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].featured','false')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].liteRegistrationEnabled','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].packageName','monthly')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].price','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].currency','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].packageId','SHAHID_VIP')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].catalogId','VIP')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[7].key','show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[7].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[8].key','show_tag')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[8].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[11].key','price')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[11].value','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[12].key','currency')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[12].value','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[13].key','duration')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[13].value','شهرياً')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[17].key','CC_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[17].value[0]','visa')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[17].value[1]','master')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[18].key','summary_text_1')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[18].value',"شاهد VIP - وجهتك الأمثل للترفيه اشترك الآن !! الرسوم الشهرية ٣٤.٩٩ ريال سعودي (شاملاً ضريبة القيمة المضافة)")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[19].key','summary_text_2')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[19].value','سيتم تجديد الخدمة تلقائيًا')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].pricingPlanId','TPay_STC_SA')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].productId','KSA_B2C_SHAHID_VIP_1M')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]','42001')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod','MOBILE_PAY')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId','STC')
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].showForAnonymous','true')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[0].key','pop_up_tab_title')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[0].value[0]',' الشروط والأحكام')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[1].key','pop_up_tab_content')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[1].value[0]','<ul> <li> سيتم تجديد الخدمة تلقائيًا. </li> <li> الرسوم الشهرية ٣٤.٩٩ ريال سعودي (شاملاً ضريبة القيمة المضافة) </li> <li> للاستفسارات تواصل معنا على care@shahid.net. </li> </ul>')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[2].key','partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[2].value',"https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/STCLogo.png")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[4].key','partner_name')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[4].value','STC')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[6].key','continue_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[6].value','جرب شاهد VIP ')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[7].key','guideline_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[7].value[0]',"تطبق الشروط والأحكام")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.cards[0].title',"باقة اسبوعية")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.cards[0].image',"https://shahid-static.s3.amazonaws.com/shahid-subscription-config/LP/2022VIPLP.jpg")

// Mobily Landing Page

WS.verifyElementPropertyValue(getResponse, 'deals[1].param', 'mobilyksa')
WS.verifyElementPropertyValue(getResponse, 'deals[1].skipLandingPage', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[1].visible', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[1].dealType', 'deal_with_pricing_plan')
WS.verifyElementPropertyValue(getResponse, 'deals[1].template','TELCO')
WS.verifyElementPropertyValue(getResponse, 'deals[1].visualElements[7].key','main_partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[1].visualElements[7].value',"https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/MobilyLogo.png")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].featured','false')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].liteRegistrationEnabled','true')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].packageName','monthly')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].price','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].currency','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].packageId','SHAHID_VIP')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].catalogId','VIP')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[7].key','show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[7].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[8].key','show_tag')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[8].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[11].key','price')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[11].value','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[12].key','currency')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[12].value','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[13].key','duration')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[13].value','شهرياً')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[17].key','CC_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[17].value[0]','visa')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[17].value[1]','master')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[18].key','summary_text_1')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[18].value',"شاهد VIP - وجهتك الأمثل للترفيه اشترك الآن !! الرسوم الشهرية ٣٤.٩٩ ريال سعودي (شاملاً ضريبة القيمة المضافة)")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].pricingPlanId','TPay_Mobily_SA')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].productId','KSA_B2C_SHAHID_VIP_1M')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]','42003')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod','MOBILE_PAY')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].dealId','MOBILY-KSA-LP-ALLUSER')
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].showForAnonymous','true')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[0].key','pop_up_tab_title')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[0].value[0]',' الشروط والأحكام')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[1].key','pop_up_tab_content')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[1].value[0]','<ul> <li> سيتم تجديد الخدمة تلقائيًا. </li> <li> الرسوم الشهرية ٣٤.٩٩ ريال سعودي (شاملاً ضريبة القيمة المضافة) </li> <li> للاستفسارات تواصل معنا على care@shahid.net. </li>')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[2].key','partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[2].value',"https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/MobilyLogo.png")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[4].key','partner_name')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[4].value','MOBILY')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[6].key','continue_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[6].value','جرب شاهد VIP ')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[7].key','guideline_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[7].value[0]',"تطبق الشروط والأحكام")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.cards[0].title',"باقة اسبوعية")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.cards[0].image',"https://shahid-static.s3.amazonaws.com/shahid-subscription-config/LP/2022VIPLP.jpg")
// Zain landing page
WS.verifyElementPropertyValue(getResponse, 'deals[2].param', 'zainksa')
WS.verifyElementPropertyValue(getResponse, 'deals[2].skipLandingPage', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[2].visible', 'false')
WS.verifyElementPropertyValue(getResponse, 'deals[2].dealType', 'deal_with_pricing_plan')
WS.verifyElementPropertyValue(getResponse, 'deals[2].template','TELCO')
WS.verifyElementPropertyValue(getResponse, 'deals[2].visualElements[7].key','main_partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[2].visualElements[7].value',"https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/ZainKSALogo.png")
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].featured','false')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].liteRegistrationEnabled','true')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].packageName','monthly')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].price','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].currency','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].packageId','SHAHID_VIP')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].catalogId','VIP')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[7].key','show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[7].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[8].key','show_tag')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[8].value','true')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[11].key','price')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[11].value','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[12].key','currency')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[12].value','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[13].key','duration')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[13].value','شهرياً')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[17].key','CC_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[17].value[0]','visa')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[17].value[1]','master')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[18].key','summary_text_1')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].visualElements[18].value',"شاهد VIP - وجهتك الأمثل للترفيه اشترك الآن !! الرسوم الشهرية ٣٤.٩٩ ريال سعودي (شاملاً ضريبة القيمة المضافة)")
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].pricingPlanData[0].pricingPlanId','TPay_Zain_SA')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].pricingPlanData[0].productId','KSA_B2C_SHAHID_VIP_1M')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]','42004')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod','MOBILE_PAY')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel','39.99')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel','SAR')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].pricingPlanData[0].dealId','ZAIN-KSA-LP-ALLUSER')
WS.verifyElementPropertyValue(getResponse, 'deals[2].groups[0].pricingPlans[0].pricingPlanData[0].showForAnonymous','true')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[0].key','pop_up_tab_title')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[0].value[0]',' الشروط والأحكام')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[1].key','pop_up_tab_content')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[1].value[0]','<ul> <li> سيتم تجديد الخدمة تلقائيًا. </li> <li> الرسوم الشهرية ٣٤.٩٩ ريال سعودي (شاملاً ضريبة القيمة المضافة) </li> <li> للاستفسارات تواصل معنا على care@shahid.net. </li>')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[2].key','partner_logo')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[2].value',"https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/ZainKSALogo.png")
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[4].key','partner_name')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[4].value','ZAIN')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[6].key','continue_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[6].value','جرب شاهد VIP ')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[7].key','guideline_cta')
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.visualElements[7].value[0]',"تطبق الشروط والأحكام")
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.cards[0].title',"باقة اسبوعية")
WS.verifyElementPropertyValue(getResponse, 'deals[2].specialOfferLandingPage.cards[0].image',"https://shahid-static.s3.amazonaws.com/shahid-subscription-config/LP/2022VIPLP.jpg")

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
WS.verifyElementPropertyValue(getResponse, 'partners[0].name','STC Pay')
WS.verifyElementPropertyValue(getResponse, 'partners[0].link','http://stcpay.com.sa/sms/shahid')
WS.verifyElementPropertyValue(getResponse, 'partners[0].logo','https://static.s3.shahid.mbc.net/widget-images/logos/stcpay@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visible','false')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].value','معلومات إضافية')
WS.verifyElementPropertyValue(getResponse, 'partners[1].name','Virgin Megastore')
WS.verifyElementPropertyValue(getResponse, 'partners[1].link','https://www.virginmegastore.sa/store-finder')
WS.verifyElementPropertyValue(getResponse, 'partners[1].logo','https://static.s3.shahid.mbc.net/widget-images/logos/virgin-megastore@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visible','false')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].value','معلومات إضافية')
WS.verifyElementPropertyValue(getResponse, 'partners[2].name','Like Card')
WS.verifyElementPropertyValue(getResponse, 'partners[2].link','https://like4card.com/All-Shahid_VIP?country_id=2')
WS.verifyElementPropertyValue(getResponse, 'partners[2].logo','https://static.s3.shahid.mbc.net/widget-images/logos/likecard@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].value','معلومات إضافية')
WS.verifyElementPropertyValue(getResponse, 'partners[3].name','You Got a Gift')
WS.verifyElementPropertyValue(getResponse, 'partners[3].link','https://yougotagift.com/saudi/gift-card/shahidvip-gift-card-sa/')
WS.verifyElementPropertyValue(getResponse, 'partners[3].logo','https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/logos/you-gota-gift.svg')
WS.verifyElementPropertyValue(getResponse, 'partners[3].visible','false')
WS.verifyElementPropertyValue(getResponse, 'partners[3].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[3].visualElements[0].value','معلومات إضافية')
WS.verifyElementPropertyValue(getResponse, 'partners[4].name','Jarir')
WS.verifyElementPropertyValue(getResponse, 'partners[4].link','https://www.jarir.com/sa-en/storelocator/')
WS.verifyElementPropertyValue(getResponse, 'partners[4].logo','https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/Logo_Jarir.png')
WS.verifyElementPropertyValue(getResponse, 'partners[4].visible','false')
WS.verifyElementPropertyValue(getResponse, 'partners[4].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[4].visualElements[0].value','معلومات إضافية')
WS.verifyElementPropertyValue(getResponse, 'partners[5].name','Extra')
WS.verifyElementPropertyValue(getResponse, 'partners[5].link','https://www.extra.com/en-sa/store-finder')
WS.verifyElementPropertyValue(getResponse, 'partners[5].logo','https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/Extra%20Logo.png')
WS.verifyElementPropertyValue(getResponse, 'partners[5].visible','false')
WS.verifyElementPropertyValue(getResponse, 'partners[5].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[5].visualElements[0].value','معلومات إضافية')

//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




