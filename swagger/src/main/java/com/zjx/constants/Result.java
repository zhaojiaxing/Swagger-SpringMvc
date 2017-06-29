package com.zjx.constants;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by zjx on 2017/6/29.
 *
 * @author zhaojiaxing
 * @version V2.0
 *          Copyright (c)2016 tyj-版权所有
 */
@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    // 200成功
    @ApiModelProperty(value = "错误码", name = "错误码")
    private int code;

    // 返回消息，成功为“success”，失败为具体失败信息
    @ApiModelProperty(value = "错误码描述", name = "错误码描述")
    private String desc;

    // 返回数据
    @ApiModelProperty(value = "数据对象", name = "数据对象")
    private T data;

    public Result() {
    }

    public Result(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Result(int code, String desc, T data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }
}
