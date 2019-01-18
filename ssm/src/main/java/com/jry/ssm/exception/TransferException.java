package com.jry.ssm.exception;

/**
 * @Description: java类作用描述
 * @Author: jry
 * @CreateDate: 2019/1/12 19:23
 * @Version: 1.0
 */

public class TransferException extends RuntimeException {
    public TransferException() {
    }

    public TransferException(String message) {
        super(message);
    }

    public TransferException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransferException(Throwable cause) {
        super(cause);
    }

    public TransferException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
