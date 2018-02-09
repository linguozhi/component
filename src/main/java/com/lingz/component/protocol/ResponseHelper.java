/*
 * Copyright (c) 2013-2020 by yiyou All rights reserved
 */
package com.lingz.component.protocol;

import com.lingz.component.datatable.BootstrapTable;
import com.lingz.component.datatable.DataTable;
import com.lingz.component.datatable.DataTableBulid;

import java.util.HashMap;
import java.util.Map;

/**
 * @description HTTP输出帮助对象
 * @author <a href="mailto:lingzuohi@52tt.com">soothing</a>
 * @since 2014-07-30
 * @version 1.0.0
 */
public class ResponseHelper {

	/**
	 * 构建发送客户端对象
	 * @param code
	 * @param message
	 * @param data
     * @return
     */
	public static Map<String, Object> buildResult(int code, String message, Object data) {
		ResponseState responseState = new ResponseState();
		responseState.setCode(code);
		responseState.setMessage(message);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(ParamName.ID, System.currentTimeMillis());
		map.put(ParamName.STATE, responseState);
		map.put(ParamName.DATA, data);

		return map;
	}

	/**
	 * 发送结果的消息到客户端
	 *
	 * @param code
	 *            状态码
	 * @param message
	 *            状态信息 void
	 */
	public static Map buildResult(int code, String message) {
		return buildResult(code, message, null);
	}

	/**
	 * 发送结果的消息到客户端
	 *
	 * @param statusCodeEnum
	 *            结果枚举
	 * @param data
	 *            状态内容 void
	 */
	public static Map buildResult(StatusCodeEnum statusCodeEnum, Object data) {
		return buildResult(statusCodeEnum.getIndex(), statusCodeEnum.getMessage(), data);
	}

	/**
	 * 发送结果的消息到客户端
	 *
	 * @param statusCodeEnum
	 *            结果枚举 void
	 */
	public static Map buildResult(StatusCodeEnum statusCodeEnum) {
		return buildResult(statusCodeEnum, null);
	}

	/**
	 * 发送成功结果的消息到客户端
	 */
	public static Map buildSuccessResult() {
		return buildResult(StatusCodeEnum.SUCCESS);
	}

	/**
	 * 发送成功结果的消息到客户端
	 *
	 * @param message
	 *            void
	 */
	public static Map buildSuccessResult(String message) {
		return buildResult(StatusCodeEnum.SUCCESS.getIndex(), message, null);
	}

	/**
	 * 发送错误结果的消息到客户端
	 *
	 * @param message
	 *            void
	 */
	public static Map buildErrorResult(String message) {
		return buildResult(StatusCodeEnum.UNKNOWN_ERROR.getIndex(), message, null);
	}


	/**
	 * 构建data table 数据
	 * @param draw
	 * @param total
	 * @param data
     * @return
     */
    public static DataTable buildDataTable(int draw, int total, Object data) {
		return DataTableBulid.build(draw, total, data);
	}

	/**
	 * 构件bootstrap table 数据
	 * @param total
	 * @param data
     * @return
     */
	public static BootstrapTable buildBootstrapTable(int total, Object data) {
		return BootstrapTable.build(total, data);
	}

	class ParamName {

		public static final String ID = "id";
		public static final String CALLER = "caller";
		public static final String DATA = "data";
		public static final String STATE = "state";
		public static final String CODE = "code";
		public static final String MSG = "msg";
	}

}