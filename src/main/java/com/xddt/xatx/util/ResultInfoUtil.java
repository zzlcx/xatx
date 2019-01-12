package com.xddt.xatx.util;

import java.util.HashMap;
import java.util.Map;


public class ResultInfoUtil {

	private static final String SUCCESS = "0";
	public static final String ERROR = "400";

	private static Map<String, String> errorMap = new HashMap<String, String>();
	static {
		errorMap.put(SUCCESS, "200");
		errorMap.put(ERROR, "出错啦！！！");
		errorMap.put("500", "服务器内部出错啦！！！");
	}


	public static ResultSuccessInfo setSuccessInfo(Object obj) {
		ResultSuccessInfo resultSuccessInfo = new ResultSuccessInfo();
		resultSuccessInfo.setErrorCode(SUCCESS);
		resultSuccessInfo.setResult(obj);
		return resultSuccessInfo;
	}
	

	public static ResultErrorInfo setErrorInfo(String type) {
		ResultErrorInfo resultInfo = new ResultErrorInfo();
		String message = "";
		if (ResultInfoUtil.errorMap.containsKey(type)) {
			message = ResultInfoUtil.errorMap.get(type);
		} else {
			message = "未知错误！！！";
		}
		resultInfo.setErrorMessage(message);
		resultInfo.setErrorCode(type);
		return resultInfo;
	}

}
