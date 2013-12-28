package com.junit.chap03;

public interface RequestHandler {

	Response process(Request request) throws Exception;
	
}
