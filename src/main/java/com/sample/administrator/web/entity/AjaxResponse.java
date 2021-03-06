package com.sample.administrator.web.entity;

import com.sample.administrator.web.element.ResponseCode;

public class AjaxResponse {

	private ResponseCode responseCode;
	private String responseMessage;
	private Object targetObject;
	
	public ResponseCode getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
		this.responseMessage = responseCode.getDescription();
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public Object getTargetObject() {
		return targetObject;
	}
	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}
	
}
