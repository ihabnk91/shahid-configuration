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

def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "AR", "SHAHID_VIP","KW" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'KWT')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')



// Monthly Package Visual Elemnts

WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[1].value', 'الاشتراك الشهري')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[2].value', "3.29 KWD / شهرياً")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[3].value', 'تدفع شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[8].value', '3.29')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[9].value', 'KWD')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].visualElements[10].value', 'شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].order', '0')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].price', '3.29')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].currency', 'KWD')

// Monthly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].productId', "KWT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value', "البطاقة المصرفية")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "3.29")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "KWD")




// Monthly Mobile TPay_stc_KW
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].pricingPlanId', 'TPay_stc_KW')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].productId', "KWT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].subPricingPlanIds[0]', "41904")
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
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].priceLabel', "3.29")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].currencyLabel', "KWD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[1].allowedForAcquisition', 'true')

// Monthly Mobile TPay_Zain_BH
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].pricingPlanId', 'TPay_Zain_KW')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].productId', "KWT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].subPricingPlanIds[0]', "41902")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].paymentMethod', "MOBILE_PAY")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].priceLabel', "3.29")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].currencyLabel', "KWD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[0].pricingPlanData[2].allowedForAcquisition', 'true')


// Yearly package Visual Elements


WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].key', "Header_1_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[0].value', "شاهد أقوى المسلسلات و الأفلام حصرياً دون توقف")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[1].value', 'الاشتراك السنوي')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].key', "tag_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[2].value', 'وفر30%')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].key', "promo_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[3].value', '2.29 KWD / شهرياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].key', "deduction_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[4].value', ' 27.59 KWD  تدفع سنوياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[7].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[8].value', "true")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[10].value', '27.59')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[11].value', 'KWD')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].visualElements[12].value', 'سنوياً')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].order', '2')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].period', 'yearly')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].price', '27.59')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].currency', 'KWD')

// Yearly Credit Card
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].productId', "KWT_B2C_SHAHID_VIP_12M")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].subPricingPlanIds', "null")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].paymentMethod', "CREDIT_CARD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].key', "title")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[0].value', "البطاقة المصرفية")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].key', "CTA_text")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[1].value', "اشترك")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].key', "logo")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].visualElements[2].value', "https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].priceLabel', "27.59")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].currencyLabel', "KWD")
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[0]', 'VERTICAL_MODE')
WS.verifyElementPropertyValue(getResponse, 'groups[0].pricingPlans[2].pricingPlanData[0].showIn[1]', 'HORIZONTAL_MODE')

// Deals

// STC Telco landing page

WS.verifyElementPropertyValue(getResponse, 'deals[0].param', "stckwt")
WS.verifyElementPropertyValue(getResponse, 'deals[0].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'deals[0].skipLandingPage', "false")
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[5].key', "offer_logo")
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[5].value[0]', "https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/STC_LOGO_KWT.png")
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[7].key', "main_partner_logo")
WS.verifyElementPropertyValue(getResponse, 'deals[0].visualElements[7].value', "https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/STC_LOGO_KWT.png")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].price', "3.29")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].currency', "KWD")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].pricingPlanId', "TPay_stc_KW")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].productId', "KWT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', "41904")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "3.29")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "KWD")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].pricingPlanData[0].dealId', "STC-KWT-LP-ALLUSER")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[18].key', "summary_text_1")
WS.verifyElementPropertyValue(getResponse, 'deals[0].groups[0].pricingPlans[0].visualElements[18].value', "شاهد VIP - وجهتك الأمثل للترفيه اشترك الآن !! الرسوم الشهرية 3.29 دينار كويتي (شاملاً ضريبة القيمة المضافة)")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[0].key', "pop_up_tab_title")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[0].value[0]', " الشروط والأحكام")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[1].key', "pop_up_tab_content")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[1].value[0]', "<ul> <li> سيتم تجديد الخدمة تلقائيًا </li> <li> الرسوم الشهرية 2.89 دينار كويتي (شاملاً ضريبة القيمة المضافة) . </li> <li> للاستفسارات تواصل معنا على care@shahid.net. </li> </ul>")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[2].key', "partner_logo")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[2].value', "https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/STC_LOGO_KWT.png")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[4].key', "partner_name")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[4].value', "STC")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[6].key', "continue_cta")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[6].value', "جرب شاهد VIP ")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[7].key', "guideline_cta")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.visualElements[7].value[0]', "تطبق الشروط والأحكام")
WS.verifyElementPropertyValue(getResponse, 'deals[0].specialOfferLandingPage.cards[0].image', "https://shahid-static.s3.amazonaws.com/shahid-subscription-config/LP/2022VIPLP.jpg")
WS.verifyElementPropertyValue(getResponse, 'deals[0].dealType', "deal_with_pricing_plan")
WS.verifyElementPropertyValue(getResponse, 'deals[0].template', "TELCO")


// Zain Telco landing page

WS.verifyElementPropertyValue(getResponse, 'deals[1].param', "zainkwt")
WS.verifyElementPropertyValue(getResponse, 'deals[1].featured', "false")
WS.verifyElementPropertyValue(getResponse, 'deals[1].skipLandingPage', "false")
WS.verifyElementPropertyValue(getResponse, 'deals[1].visualElements[5].key', "offer_logo")
WS.verifyElementPropertyValue(getResponse, 'deals[1].visualElements[5].value[0]', "https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/ZN_LOGO_KWT.png")
WS.verifyElementPropertyValue(getResponse, 'deals[1].visualElements[7].key', "main_partner_logo")
WS.verifyElementPropertyValue(getResponse, 'deals[1].visualElements[7].value', "https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/ZN_LOGO_KWT.png")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].price', "3.29")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].currency', "KWD")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].packageId', "SHAHID_VIP")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].catalogId', "VIP")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].pricingPlanId', "TPay_Zain_KW")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].productId', "KWT_B2C_SHAHID_VIP_1M")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].subPricingPlanIds[0]', "41902")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', "3.29")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', "KWD")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].pricingPlanData[0].dealId', "ZAIN-KWT-LP-ALLUSER")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[18].key', "summary_text_1")
WS.verifyElementPropertyValue(getResponse, 'deals[1].groups[0].pricingPlans[0].visualElements[18].value', "شاهد VIP - وجهتك الأمثل للترفيه اشترك الآن !! الرسوم الشهرية 3.29 دينار كويتي (شاملاً ضريبة القيمة المضافة)")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[0].key', "pop_up_tab_title")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[0].value[0]', " الشروط والأحكام")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[1].key', "pop_up_tab_content")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[1].value[0]', "<ul> <li> سيتم تجديد الخدمة تلقائيًا </li> <li> الرسوم الشهرية 2.89 دينار كويتي (شاملاً ضريبة القيمة المضافة) . </li> <li> للاستفسارات تواصل معنا على care@shahid.net. </li> </ul>")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[2].key', "partner_logo")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[2].value', "https://shahid-static.s3.us-east-1.amazonaws.com/shahid-subscription-config/ZN_LOGO_KWT.png")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[4].key', "partner_name")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[4].value', "ZAIN")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[6].key', "continue_cta")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[6].value', "جرب شاهد VIP ")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[7].key', "guideline_cta")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.visualElements[7].value[0]', "تطبق الشروط والأحكام")
WS.verifyElementPropertyValue(getResponse, 'deals[1].specialOfferLandingPage.cards[0].image', "https://shahid-static.s3.amazonaws.com/shahid-subscription-config/LP/2022VIPLP.jpg")
WS.verifyElementPropertyValue(getResponse, 'deals[1].dealType', "deal_with_pricing_plan")
WS.verifyElementPropertyValue(getResponse, 'deals[1].template', "TELCO")

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
WS.verifyElementPropertyValue(getResponse, 'partners[0].name','OG Money')
WS.verifyElementPropertyValue(getResponse, 'partners[0].link','https://ogmoney.store/product/shahid-vip/')
WS.verifyElementPropertyValue(getResponse, 'partners[0].logo','https://shahid-static.s3.amazonaws.com/widget-images/logos/og_logo.svg')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[0].visualElements[0].value','معلومات إضافية')

WS.verifyElementPropertyValue(getResponse, 'partners[1].name','Sheeel.com')
WS.verifyElementPropertyValue(getResponse, 'partners[1].link','https://www.sheeel.com/mobiles-recharge-cards/instant-prepaid-cards/pay-only-kwd5-5-on-3-months-shahid-subscription.html')
WS.verifyElementPropertyValue(getResponse, 'partners[1].logo','https://static.s3.shahid.mbc.net/widget-images/logos/Sheeel-com@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[1].visualElements[0].value','معلومات إضافية')

WS.verifyElementPropertyValue(getResponse, 'partners[2].name','Like Card')
WS.verifyElementPropertyValue(getResponse, 'partners[2].link','https://like4card.com/All-Shahid_VIP?country_id=16')
WS.verifyElementPropertyValue(getResponse, 'partners[2].logo','https://static.s3.shahid.mbc.net/widget-images/logos/likecard@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[2].visualElements[0].value','معلومات إضافية')

WS.verifyElementPropertyValue(getResponse, 'partners[3].name','ENET')
WS.verifyElementPropertyValue(getResponse, 'partners[3].link','http://e.net.kw/eNet/Navigate?language=en-US&viewName=KioskLocations')
WS.verifyElementPropertyValue(getResponse, 'partners[3].logo','https://static.s3.shahid.mbc.net/widget-images/logos/enet@2x.png')
WS.verifyElementPropertyValue(getResponse, 'partners[3].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[3].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[3].visualElements[0].value','معلومات إضافية')

WS.verifyElementPropertyValue(getResponse, 'partners[4].name','You Got a Gift')
WS.verifyElementPropertyValue(getResponse, 'partners[4].link','https://yougotagift.com/kuwait/gift-card/shahid-vip-gift-card-kw/')
WS.verifyElementPropertyValue(getResponse, 'partners[4].logo','https://shahid-static.s3.us-east-1.amazonaws.com/widget-images/logos/you-gota-gift.svg')
WS.verifyElementPropertyValue(getResponse, 'partners[4].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[4].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[4].visualElements[0].value','معلومات إضافية')

WS.verifyElementPropertyValue(getResponse, 'partners[5].name','Jarir')
WS.verifyElementPropertyValue(getResponse, 'partners[5].link','https://www.jarir.com/kw-en/catalogsearch/result?search=Shahid')
WS.verifyElementPropertyValue(getResponse, 'partners[5].logo','https://shahid-static.s3.amazonaws.com/widget-images/logos/Logo_Jarir+(2).png')
WS.verifyElementPropertyValue(getResponse, 'partners[5].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[5].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[5].visualElements[0].value','معلومات إضافية')

WS.verifyElementPropertyValue(getResponse, 'partners[6].name','Razer Online')
WS.verifyElementPropertyValue(getResponse, 'partners[6].link','https://gold.razer.com/global/en/gold/catalog/shahid-vip')
WS.verifyElementPropertyValue(getResponse, 'partners[6].logo','https://shahid-static.s3.amazonaws.com/widget-images/logos/Coin_RZR%20Gold_Black.png')
WS.verifyElementPropertyValue(getResponse, 'partners[6].visible','true')
WS.verifyElementPropertyValue(getResponse, 'partners[6].visualElements[0].key','text')
WS.verifyElementPropertyValue(getResponse, 'partners[6].visualElements[0].value','معلومات إضافية')

//Default Package

WS.verifyElementPropertyValue(getResponse, 'defaultPackageId','SHAHID_VIP')




