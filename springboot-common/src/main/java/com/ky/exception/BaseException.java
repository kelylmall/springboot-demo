package com.ky.exception;

import lombok.Data;

/**
 * @ClassName DemoException
 * @Author lim@udiannet.com
 * @DATE 2018-09-05
 * @Version 1.0
 **/
@Data
public class BaseException extends Exception {

    protected String errKey = "";

    protected String errMsg = "";

    public BaseException() {
        super();
    }

    public BaseException(String errKey, String errMsg) {
        super(errKey);
        this.errKey = errKey;
        this.errMsg = errMsg;
    }


}
