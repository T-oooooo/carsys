package com.feri.car.common.exception;

/**
 * 会员异常 自定义异常
 *
 * @author 张明杰
 * @date 2020年1月14日10:25:22
 */
public class UserException extends Exception {
    public UserException() {
        super();
    }
    public UserException(String msg) {
        super(msg);
    }
}
