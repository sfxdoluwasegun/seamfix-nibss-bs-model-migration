package com.sf.biocapture.entity.enums;
/**
 * 
 * @author Nnanna
 *
 */
public enum SimSwapModes {
	FINGERPRINT_AND_QUESTIONNAIRE("FINGERPRINT_AND_QUESTIONNAIRE"),
	FINGERPRINT_ONLY("FINGERPRINT_ONLY"),
	QUESTIONNAIRE_ONLY("QUESTIONNAIRE_ONLY");
	
	String value;
	
	SimSwapModes(String value){
		this.value= value;
	}
	
	public String getValue(){
		return value;
	}
}