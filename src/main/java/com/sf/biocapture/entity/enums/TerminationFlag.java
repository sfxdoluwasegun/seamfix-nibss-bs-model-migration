package com.sf.biocapture.entity.enums;

import lombok.Getter;

/**
 * 
 * @author MO
 *
 */
@Getter
public enum TerminationFlag {
	Y("Y"),
	N("N"),
	NA("N/A"),
	;
	
	private String value;

	private TerminationFlag(String value) {
		this.value = value;
	}
	
	public static TerminationFlag from(String value) {
		if(value == null) {
			return null;
		}
		for(TerminationFlag termination : TerminationFlag.values()) {
			if(termination.getValue().equalsIgnoreCase(value)) {
				return termination;
			}
		}
		return null;
	}
	
	public static TerminationFlag getDefaultFlag() {
		return N;
	}
	
}
