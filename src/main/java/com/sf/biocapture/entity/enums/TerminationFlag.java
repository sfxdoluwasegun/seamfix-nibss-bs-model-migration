package com.sf.biocapture.entity.enums;

import lombok.Getter;

/**
 * 
 * @author MO
 *
 */
@Getter
public enum TerminationFlag {
	Y,
	N,
	NA,
	;
	
	public static TerminationFlag from(String value) {
		if(value == null) {
			return null;
		}
		for(TerminationFlag termination : TerminationFlag.values()) {
			if(termination.name().equalsIgnoreCase(value)) {
				return termination;
			}
		}
		return null;
	}
	
	public static TerminationFlag getDefaultFlag() {
		return N;
	}
	
}
