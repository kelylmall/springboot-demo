package com.ky.exception;

/**
 * 页面异常
 */
public class PageBizException extends BaseException {
	private static final long serialVersionUID = 1L;

	public PageBizException() {
	}

	public PageBizException(String errKey, String errMsg) {
		super(errKey, errMsg);
	}

	@Override
	public String toString() {
		return "BizException [errKey=" + errKey + ", errMsg=" + errMsg + "]";
	}

}
