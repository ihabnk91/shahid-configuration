package common

import com.kms.katalon.core.annotation.Keyword

public class CommonKeywords {

	/**
	 * Convert string to JSON object
	 * @param string to convert
	 * @return a JSON object
	 */
	@Keyword
	def convertStringToJson(targetString) {
		def slurper = new groovy.json.JsonSlurper()
		def result = slurper.parseText(targetString)
		return result
	}

	/**
	 * Get error user message
	 * @param String response
	 * @return error message
	 */
	def static getErrorMsg(response) {
		def slurper = new groovy.json.JsonSlurper()
		def result = slurper.parseText(response.getResponseBodyContent())
		println result.faults[0].userMessage
		return result.faults[0].userMessage
	}

	public String extractInformationFromSelfLink(String strSelfLink) {
		int lastSlashIndex = strSelfLink.lastIndexOf("/")
		println "id  is " + strSelfLink.substring(lastSlashIndex + 1, strSelfLink.length())
		return strSelfLink.substring(lastSlashIndex + 1 , strSelfLink.length())
	}
}
