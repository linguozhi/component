/*
 * Copyright (c) 2004-2014 by yiyou All rights reserved
 */
package com.lingz.component.protocol;

/**
 * @description 业务状态码枚举
 * @author <a href="mailto:linguozhi@52tt.com">soothing</a>
 * @since 2016-01-28
 * @version 1.0.0
 */
public enum StatusCodeEnum {

	// 操作成功
	SUCCESS(2000000, "success"),
	// 服务器内部错误
	INTERNAL_ERROR(5000000, "内部错误"),
	// 未知错误
	UNKNOWN_ERROR(5000001, "未知错误"),
	// 系统参数错误
	INVALID_SYSTEM_PARAMETER(5000002, "参数错误"),
	// 无效的应用编号
	INVALID_CLIENT_CALLER(5000010, "caller错误"),
	// 签名无效
	INVALID_SIGN(5000011, "sign错误"),
	// 业务参数错误
	INVALID_BUSINESS_PARAMETER(5000020, "业务参数错误"),
	// 数据已存在
	DATA_EXIST(5000028, "数据重复"),
	// 数据不存在
	DATA_NOT_EXIST(5000029, "数据不存在");

	private int index;

	private String message;

	StatusCodeEnum(int index, String message) {
		this.index = index;
		this.message = message;
	}

	public int getIndex() {
		return index;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return this.index + "_" + this.message;
	}
}
