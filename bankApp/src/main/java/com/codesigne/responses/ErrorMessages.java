package com.codesigne.responses;

public enum ErrorMessages {

	MISSING_REQUIRED_FIELD("Missing required field."),
	RECORD_ALREADY_EXISTS("Record already exixts."),
	INTERNAL_SERVER_ERROR("Internal Codesigne server error."),
	NO_RECORD_FOUND("record with provided id is not found.");
	
	private String errorMessage;

	private ErrorMessages(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
