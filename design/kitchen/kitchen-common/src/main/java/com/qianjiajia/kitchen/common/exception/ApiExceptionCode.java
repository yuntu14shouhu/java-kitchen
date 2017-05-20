package com.qianjiajia.kitchen.common.exception;

import com.google.common.base.Preconditions;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 10:09
 */
public enum ApiExceptionCode {


    SESSION_EXCEPTION("300"),
    URL_NOT_EXIST("404"),
    FIELD_ERROR("400"),
    SERVER_ERROR("500"),
    BIZ_ERROR("600"),
    LOGIN_FAILURE("1000"),
    GET_USER_FAILURE("1001"),
    USER_NOT_EXIST("1006"),
    RUNTIME_EXCEPTION("9998"),
    UNKNOWN_EXCEPTION("9999"),
    SUCCESS("200"),

    PARAM_EXCEPTION("501");

    private final String code;
    private String message;
    ApiExceptionCode(String code) {
        this.code = code;
    }

    ApiExceptionCode(String code,String message){
        this.code = code;
        this.message = message;
    }



    public static ApiExceptionCode get(ApiExceptionCode code){
        Preconditions.checkArgument(code != null,"API 错误码不能为空!");
        for (ApiExceptionCode apiExceptionCode : ApiExceptionCode.values()){
            if (apiExceptionCode.getCode().equals(code)){
                return apiExceptionCode;
            }
        }
        throw new IllegalArgumentException(String.format("API 错误码 [%s] 不存在",code));
    }

    public String getCode() {
        return code;
    }
}