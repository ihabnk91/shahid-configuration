<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>getSubscriptionConfig</name>
   <tag></tag>
   <elementGuidId>7c1550db-64ac-4a31-8e83-508a132b9951</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>a72112d8-3dad-4115-b3bd-9b725f4b85e3</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>SHAHID_OS</name>
      <type>Main</type>
      <value>${platform}</value>
      <webElementGuid>5f2aad5f-ff92-430a-8891-6bcb2fae7e79</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>token</name>
      <type>Main</type>
      <value>eyJhbGciOiJIUzI1NiJ9.eyJjYWNoZSI6IlVzZXJfNWYzZjMwYzJiOTI3NDFiNWIyYjA4NThjY2Y1M2VhMGMiLCJ1aWQiOiJhcHIxU2hhaGlkRW5LdGtJdmgyS2thMzFnb3p6OWc3cjAiLCJkaWQiOiJXZWIiLCJzdWJpZCI6IjVmM2YzMGMyYjkyNzQxYjViMmIwODU4Y2NmNTNlYTBjIiwic3ViIjoic2hhaGlkLXRva2VuLWVuY29kZSIsImlzcyI6InNoYWhpZC10b2tlbi1lbmNvZGUiLCJpYXQiOjE2Nzg4MDgzODYsImV4cCI6MTcxMDQzMDc4Nn0.oCfR8uV7Qf_73AGGMREpRRayqHVfv3s7LjN4lZDuBeQ</value>
      <webElementGuid>fe764a2b-02bf-4d8b-a4ff-5611185f5a3b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>profile</name>
      <type>Main</type>
      <value>{&quot;id&quot;:&quot;21a4b5f7-b1b9-4ac3-886f-883aa8bdc131&quot;,&quot;ageRestriction&quot;:false,&quot;master&quot;:1}</value>
      <webElementGuid>6076bfe4-a68e-455c-8704-ce14b288ddcc</webElementGuid>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${baseUrl}shahid-subscription-config-v3/configuration?language=${lng}&amp;t=1659948821531&amp;filterPackageIds=${packageId}&amp;country=${country}&amp;flow=ACQUISITION&amp;applePaySupported=${applePay}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
