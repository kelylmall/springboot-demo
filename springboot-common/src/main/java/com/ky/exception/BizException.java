package com.ky.exception;

public class BizException extends BaseException {
    private static final long serialVersionUID = 1L;

    public BizException() {
    }

    public BizException(String errKey, String errMsg) {

        super(errKey, errMsg);
    }

    @Override
    public String toString() {

        return "BizException [errKey=" + errKey + ", errMsg=" + errMsg + "]";
    }

}
