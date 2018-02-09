package com.lingz.component.protocol;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 封装具体的业务处理逻辑
 * @param <T>
 */
public abstract class ResponseHandler<T> {

	/**
	 * 根据请求参数返回响应结果
	 * @param param
	 * @return
     */
	public abstract Object getResponse(T param);

	/**
	 * 获取中文备注（用于记录日志）
	 * @return
     */
	public abstract String getComment();

	/**
	 * 获取泛型Class对象
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Class<T> getType() {
		// 反射获取泛型的Class类型
		Type genType = this.getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		return (Class<T>) params[0];
	}

}
