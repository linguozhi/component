/*
 * Copyright (c) 2013-2020 by yiyou All rights reserved
 */
package com.lingz.component.protocol;

/**
 * @description 响应状态
 * @author <a href="mailto:linguozhi@52tt.com">soothing</a>
 * @since 2016-01-28
 * @version 1.0.0
 */
public class ResponseState {

	/**
	 * code
	 */
	private int code;

	/**
	 * message
	 */
	private String message;

	/**
	 * get code
	 *
	 * @return code code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * set code
	 *
	 * @param code code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * get message
	 *
	 * @return msg message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * set message
	 *
	 * @param message message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponseState [code=" + code + ", message=" + message + "]";
	}

}
