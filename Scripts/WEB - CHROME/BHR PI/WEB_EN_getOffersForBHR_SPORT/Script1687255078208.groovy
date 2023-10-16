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


def getResponse = CustomKeywords.'config_files.getConfigFile.getConfig'("WEB", "EN", "SHAHID_VIP_SPORT","BH" , "false")


WS.verifyResponseStatusCode(getResponse, 200)

WS.verifyElementPropertyValue(getResponse, 'country', 'BHR')

WS.verifyElementPropertyValue(getResponse, 'platform', '[WEB]')


// winback-30-offer

WS.verifyElementPropertyValue(getResponse, 'offers[5].offerId', "winback-sport-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[5].offerParam', "sportsoffer30")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].price', '4.89')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].currency', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[1].value','30% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[8].value', '4.89')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[9].value', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[12].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].visualElements[13].value', 'Save 30%')


// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].productId', "BHR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '4.89')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_SPORT_30P_BHR')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[5].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// winback-40-offer

WS.verifyElementPropertyValue(getResponse, 'offers[6].offerId', "winback-sport-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[6].offerParam', "sportsoffer40")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].price', '4.19')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].currency', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[1].value','40% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[8].value', '4.19')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[9].value', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[13].value', 'Save 40%')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].productId', "BHR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '4.19')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_SPORT_40P_BHR')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[6].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')


// winback50 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[7].offerId', "winback-sport-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[7].offerParam', "sportsoffer50")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].price', '3.49')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].currency', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[1].value','50% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[8].value', '3.49')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[9].value', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[13].value', 'Save 50%')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].productId', "BHR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '3.49')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'WB_SPORT_50P_BHR')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[7].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')



// winback-30-offer

WS.verifyElementPropertyValue(getResponse, 'offers[11].offerId', "byg-sport-30-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[11].offerParam', "bygsportsoffer30")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].price', '4.89')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].currency', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[1].value','30% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[8].value', '4.89')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[9].value', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[12].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].visualElements[13].value', 'Save 30%')


// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].productId', "BHR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '4.89')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'BYG_SPORT_30P_BHR')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[11].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')

// winback-40-offer


WS.verifyElementPropertyValue(getResponse, 'offers[12].offerId', "byg-sport-40-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[12].offerParam', "bygsportsoffer40")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].price', '4.19')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].currency', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[1].value','40% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[8].value', '4.19')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[9].value', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[13].value', 'Save 40%')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].productId', "BHR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '4.19')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'BYG_SPORT_40P_BHR')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[12].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')


// winback50 Offers

WS.verifyElementPropertyValue(getResponse, 'offers[13].offerId', "byg-sport-50-offer")
WS.verifyElementPropertyValue(getResponse, 'offers[13].offerParam', "bygsportsoffer50")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].period', 'monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].featured', "true")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].price', '3.49')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].currency', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].order','0')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].packageId',"SHAHID_VIP_SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].catalogId',"SPORT")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[0].key', 'Header_1_text')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[0].value', 'Watch the most powerful series and movies exclusively without stopping')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[1].key', 'display_title')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[1].value','50% Discount Offer' )
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[3].key', 'deduction_text')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[3].value', 'billed every month')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[6].key', 'show_payment_logo')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[6].value', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[8].key', 'price')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[8].value', '3.49')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[9].key', 'currency')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[9].value', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[10].key', 'duration')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[10].value', 'Monthly')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[11].key', 'featured_tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[11].value', 'Limited Time Offer')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[13].key', 'tag_text')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[13].value', 'Save 50%')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[12].key', 'show_tag')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].visualElements[12].value', 'true')

// CC Only NSF Offer
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].productId', "BHR_B2C_SHAHID_VIP_SPORT_1M")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].paymentMethod', 'CREDIT_CARD')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].freeTrialEnabled', "false")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].showIn[0]', "VERTICAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].showIn[1]', "HORIZONTAL_MODE")
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].priceLabel', '3.49')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].currencyLabel', 'BHD')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].dealId', 'BYG_SPORT_50P_BHR')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].allowedForAcquisition', 'true')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].key','title')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[0].value','Credit/Debit Card')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].key','CTA_text')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[1].value','Subscribe')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].key','logo')
WS.verifyElementPropertyValue(getResponse, 'offers[13].groups[0].pricingPlans[0].pricingPlanData[0].visualElements[2].value','https://static.s3.shahid.mbc.net/widget-images/icons/iconCreditCard.png')
