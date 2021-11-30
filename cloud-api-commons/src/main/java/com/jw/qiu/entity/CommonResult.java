package com.jw.qiu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private int code;
    private String msg;
    private  T data;

    public CommonResult(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public static <T> CommonResult createSuccess(T t){
        return new CommonResult(0,"success",t);
    }

    public static CommonResult createSuccess(){
        return new CommonResult(0,"success");
    }

    public static  CommonResult error(){
        return new CommonResult(999,"error");
    }
    public static  CommonResult error(String msg){
        return new CommonResult(999,msg);
    }
}
