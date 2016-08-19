package com.sf.biocapture.entity.enums;

/**
 * Enum for validating questionnaire fields during sim swap
 * @author Nnanna
 *
 */
public enum QuestionnaireFields {
	FIRST_NAME("FIRST_NAME"),
	LAST_NAME("LAST_NAME"),
	DATE_OF_BIRTH("DATE_OF_BIRTH"),
	LGA_OF_ORIGIN("DATE_OF_BIRTH");
	
	String value;
	
	QuestionnaireFields(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}
