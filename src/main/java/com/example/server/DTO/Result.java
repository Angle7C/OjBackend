package com.example.ojbackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer integer;
    private String  message;
    private Object data;
    private List<Object> datas;

    public static Result ok(String message){
        return ok(message);
    }
    public static Result ok(String message,Object data){
        return ok(message,data,null);
    }
    public static Result ok(String message,Object data,List<Object> list){
        return new Result(1000,message,data,list);
    }
    public  static Result faile(Integer code,String message){
        return new Result(code,message,null,null);
    }
}
