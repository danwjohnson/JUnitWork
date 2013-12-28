package com.junit.chap03;

public class ErrorResponse implements Response {

	private Request originalRequest;
	private Exception originalException;
	
	public ErrorResponse(Request request, Exception exception) {
		
		this.originalRequest = request;
		this.originalException = exception;
		
	} // end constructor
	
	
	public Request getOriginalRequest() {
		
		return this.originalRequest;
		
	} // end getOriginalRequest()
	
	
	public Exception getOriginalException() {
		
		return this.originalException;
		
	} // end getOriginalException()
	
} // end ErrorResponse class
