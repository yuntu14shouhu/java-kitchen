package com.qianjiajia.kitchen.common.result;

import com.qianjiajia.kitchen.common.exception.ApiExceptionCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 10:07
 * @Description 封装消息对象用于返回数据以及错误等
 */
public class MessageResult {

    public static final Map DEFAULT_DATA = new HashMap();

    /**
     * 错误码
     */
    public ApiExceptionCode code;

    /**
     * 提示消息
     */
    private String message;

    /**
     * 数据
     */
    private Object data;

    /**
     * 字段错误
     */
    private Map<String,String> fieldErrors;

    public MessageResult(ApiExceptionCode code) {
        this.code = code;
    }

    public MessageResult(ApiExceptionCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public MessageResult(ApiExceptionCode code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public MessageResult(ApiExceptionCode code, Object data) {
        this.code = code;
        this.data = data;
    }

    public MessageResult(ApiExceptionCode code, String message, Object data, Map<String, String> fieldErrors) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.fieldErrors = fieldErrors;
    }

    public MessageResult(ApiExceptionCode code, String message, Map<String, String> fieldErrors) {
        this.code = code;
        this.message = message;
        this.fieldErrors = fieldErrors;
    }

    public static MessageResult getSuccessInstance(){
        return new MessageResult(ApiExceptionCode.SUCCESS);
    }

    public static MessageResult getSuccessInstance(Object data){
        return new MessageResult(ApiExceptionCode.SUCCESS,data);
    }

    public static MessageResult getSuccessInstance(String message){
        return new MessageResult(ApiExceptionCode.SUCCESS,message);
    }

    public static MessageResult getErrorInstance(ApiExceptionCode code,String message){
        return new MessageResult(code,message);
    }

    public static MessageResult getErrorInstance(ApiExceptionCode code,String message,Object data){
        return new MessageResult(code,message,data);
    }

    public static MessageResult getErrorInstance(ApiExceptionCode code,String message,Map<String,String> fieldErrors){
        return new MessageResult(code,message,fieldErrors);
    }

    public static MessageResult getInstance(ApiExceptionCode code,String message,Object data,Map<String,String>fieldErrors){
        return new MessageResult(code,message,data,fieldErrors);
    }

    public ApiExceptionCode getCode() {
        return code;
    }

    public void setCode(ApiExceptionCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        if (data == null){
            return DEFAULT_DATA;
        }
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map<String, String> getFieldErrors() {
        if (fieldErrors == null){
            fieldErrors = new HashMap<>();
        }
        return fieldErrors;
    }

    public void setFieldErrors(Map<String, String> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }

    public void addFieldError(String filedName,String filedValue){
        Map<String,String> filedErrorsMap = getFieldErrors();
        filedErrorsMap.put(filedName,filedValue);
    }
}