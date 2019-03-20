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
	
	private String name;

	private TerminationFlag(String name) {
		this.name = name;
	}
	
	public static TerminationFlag from(String name) {
		if(name == null) {
			return null;
		}
		for(TerminationFlag termination : TerminationFlag.values()) {
			if(termination.name().equals(name)) {
				return termination;
			}
		}
		return null;
	}
	
	public static TerminationFlag getDefaultFlag() {
		return N;
	}
	
}
