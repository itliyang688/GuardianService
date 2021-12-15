package com.example.demo.entity;

import com.example.demo.enums.ResponseEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//保证序列化json的时候,如果是null的对象,key也会消失
@ApiModel("统一响应实体")
public class Result<T> implements Serializable {

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @ApiModelProperty("操作是否成功")
    private Boolean success;

    @ApiModelProperty("响应代码")
    private Integer code;

    @ApiModelProperty("响应信息")
    private String message;

    @ApiModelProperty("响应结果数据")
    private T data;

    public Result() {
    }

    private Result(Boolean success, Integer code) {
        this.success = success;
        this.code = code;
    }

    private Result(Boolean success, Integer code, T data) {
        this.success = success;
        this.code = code;
        this.data = data;
    }

    private Result(Boolean success, Integer code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private Result(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static <T> Result<T> success() {
        return new Result<T>(true, ResponseEnum.SUCCESS.getCode(),ResponseEnum.SUCCESS.getMessage());
    }

    public static <T> Result<T> successMessage(String message) {
        return new Result<T>(true, ResponseEnum.SUCCESS.getCode(), message);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(true, ResponseEnum.SUCCESS.getCode(),ResponseEnum.SUCCESS.getMessage(),data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<T>(true, ResponseEnum.SUCCESS.getCode(), message, data);
    }

    public static <T> Result<T> error() {
        return new Result<T>(false, ResponseEnum.ERROR.getCode(), ResponseEnum.ERROR.getMessage());
    }

    public static <T> Result<T> errorMessage(String errorMessage) {
        return new Result<T>(false, ResponseEnum.ERROR.getCode(), errorMessage);
    }

    public static <T> Result<T> errorCodeMessage(Integer errorCode, String errorMessage) {
        return new Result<T>(false, errorCode, errorMessage);
    }
}
