package com.qianjiajia.kitchen.common.exception;

import com.qianjiajia.kitchen.common.result.MessageResult;
import lombok.Data;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 10:05
 */
@Data
public class ApiException extends RuntimeException {

    private final ApiExceptionCode code;

    private MessageResult messageResult;

    public ApiException(ApiExceptionCode code,String message) {
        super(message);
        this.code = code;
    }

    public ApiException(MessageResult messageResult){
        super(messageResult.getMessage());
        this.code = messageResult.code;
        this.messageResult = messageResult;
    }
}