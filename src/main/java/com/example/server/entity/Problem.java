package com.example.ojbackend.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author chen
 * @since 2022-06-28 09:06:28
 */
@Getter
@Setter
@ApiModel(value = "Problem对象", description = "")
public class Problem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("问题ID")
    private String problemId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("问题名称")
    private String problemName;

    @ApiModelProperty("问题描述")
    private String problemDesc;

    @ApiModelProperty("测试点数")
    private Integer testNum;

    @ApiModelProperty("难度指数")
    private Integer levelRank;

    @ApiModelProperty("问题标签")
    private String tags;

    @ApiModelProperty("程序cpu占用时间 ms")
    private Integer cpuTime;

    @ApiModelProperty("程序运行时最大内存占用 KB")
    private Integer memorySize;

    @ApiModelProperty("公开状态")
    private Integer state;
}
