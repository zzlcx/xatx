package com.xddt.xatx.util;

import java.util.HashMap;


public class ResultSuccessInfo {

	private String errorCode = "0";
	
	private String successMessage = "";
	
	private int total = 0;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}


	private Object result;
	

	public ResultSuccessInfo() {

	}

	public ResultSuccessInfo(String code) {
		super();
		this.errorCode = code;
	}

	public ResultSuccessInfo(Object result) {
		super();
		this.result = result;
	}

	public ResultSuccessInfo(String errorCode,String errorMessage,  Object result) {
		super();
		this.errorCode = errorCode;
		this.successMessage = errorMessage;
		this.result = result;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		if (result == null) {
			this.result = new HashMap<Object, Object>();
			return;
		}
		this.result = result;
	}

}
