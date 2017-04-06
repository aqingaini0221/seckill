package org.seckill.exception;

/**
 * Created by Administrator on 2017/3/30.
 */
public class RepeatkillException extends SeckillException{
    public RepeatkillException(String message) {
        super(message);
    }
    public RepeatkillException(String message, Throwable cause){
        super(message,cause);
    }
}
